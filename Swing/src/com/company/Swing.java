package com.company;

import com.sun.deploy.panel.JavaPanel;
import com.sun.javafx.scene.control.skin.DoubleFieldSkin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

/**
 * Created by JULIA on 17.03.2018.
 */
public class Swing extends JFrame {
    AgenciesModel agencies;
    JTable table;
    NetAgencyController control = new NetAgencyController();
    public Swing(){
        // settings of JFrame
        super("***TRAVEL AGENCY***");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(900,600);
        setLocation(300, 100);
        JTabbedPane jtp = new JTabbedPane();
        getContentPane().add(jtp);
        // set JTable
        agencies = control.getAgModel();
        table=new JTable(agencies);
        table.getTableHeader().setBackground(Color.PINK);
        table.setBackground(Color.lightGray);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        JScrollPane jScrollPane=new JScrollPane(table);
        // set three Buttons for add and delete
        JButton addB = new JButton("add");
        addB.setBackground(Color.PINK);
        JButton deleteB = new JButton("delete");
        deleteB.setBackground(Color.PINK);
        JButton editB = new JButton("edit");
        editB.setBackground(Color.PINK);
        addB.addActionListener(this::actionPerformed);
        deleteB.addActionListener(this::actionPerformed);
        editB.addActionListener(this::actionPerformed);
        // set components to JFrame
        BorderLayout layout = new BorderLayout();
        JPanel panel1 = new JPanel(),
                panel2 = new JPanel();
        panel1.add(addB);
        panel1.add(deleteB);
        panel1.add(editB);
        jtp.addTab("AGENCIES", panel1);
        jtp.addTab("*", panel2);
        panel1.add(jScrollPane,layout.NORTH);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "add":
                newWindow(command);
                break;
            case "delete":
                int row = table.getSelectedRow();
                if (row != -1)
                    control.deleteAgency(row);
                break;
            case "edit":
                row = table.getSelectedRow();
                if (row != -1){
                    newWindow(command);
                }
                break;
        }

    }
    static boolean isDigit(String s) {
        char[] tmp = s.toCharArray();
        char sep = '.';
        for (char c : tmp) {
            if (c != sep) {
                if (!Character.isDigit(c))
                    return false;
            }
        }
        return true;
    }
    static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    void newWindow(String command){
        // new frame for new book
        JFrame frame = new JFrame("new agency");
        frame.setSize(400,300);
        frame.setLocation(300,200);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(4,2);
        panel.setLayout(layout);
        JFormattedTextField t4;
        NumberFormat inf;
        inf = NumberFormat.getIntegerInstance();
        inf.setMinimumIntegerDigits(0);
        inf.setMaximumFractionDigits(20);
        t4 = new JFormattedTextField(inf);
        TextField t1 = new TextField(),t2=new TextField(), t3 = new TextField();
        for(int i=0;i<8;i++){
            if(i%2 == 1){
                switch(i){
                    case 1:
                        panel.add(t1);
                        break;
                    case 3:
                        panel.add(t2);
                        break;
                    case 5:
                        panel.add(t3);
                        break;
                    case 7:
                        panel.add(t4);
                        break;
                }
            }else
                panel.add(new JLabel(agencies.getColumnName(i/2)));
        }
        if (command == "edit" ) {
            int row = table.getSelectedRow();
            Agency ag = control.getAgency(row);
            t1.setText(ag.getName());
            t2.setText(ag.getCity());
            t3.setText(ag.getPhone());
            t4.setText(((Integer)ag.getEmployeeCount()).toString());
        }
        frame.add(panel);
        BorderLayout bLayout= new BorderLayout();
        JPanel bottomPanel = new JPanel();
        JButton b = new JButton("OK");
        bottomPanel.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name,city,phone;
                int count=0;
                name = t1.getText();
                city = t2.getText();
                phone = t3.getText();
                if( name == null)
                    name = "";
                if( city == null)
                    city = "";
                if (phone == null) {
                    phone = "";
                }
                if (isInteger(t4.getText()))
                    count = Integer.parseInt(t4.getText());
                if (command == "add")
                    control.createAgency(name,city,phone,count);
                else {
                    Agency  ag = new Agency(name, city,phone,count);
                    control.editAgency(table.getSelectedRow(),ag);
                }
                frame.dispose();
            }
        });
        frame.add(bottomPanel, bLayout.SOUTH);
        frame.setVisible(true);
    }

}
