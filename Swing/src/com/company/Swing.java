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
    LibraryModel library;
    JTable table;
    public Swing(){
        // settings of JFrame
        super("***LIBRARY***");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(900,600);
        setLocation(300, 100);
        setIconImage((new ImageIcon("library.png")).getImage());
        // set JTable
        library = new LibraryModel();
        table=new JTable(library);
        table.getTableHeader().setBackground(Color.PINK);
        table.setBackground(Color.lightGray);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        JScrollPane jScrollPane=new JScrollPane(table);
        // set three Buttons for add and delete
        JButton addB = new JButton("add");
        addB.setBackground(Color.PINK);
        JButton deleteB = new JButton("delete");
        deleteB.setBackground(Color.PINK);
        addB.addActionListener(this::actionPerformed);
        deleteB.addActionListener(this::actionPerformed);
        // set components to JFrame
        BorderLayout layout = new BorderLayout();
        JPanel panel = new JPanel();
        panel.add(addB);
        panel.add(deleteB);
        add(panel, layout.SOUTH);
        add(jScrollPane);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "add":
                // new frame for new book
                JFrame frame = new JFrame("new book");
                frame.setSize(400,300);
                frame.setLocation(300,200);
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                JPanel panel = new JPanel();
                GridLayout layout = new GridLayout(5,2,5,10);
                panel.setLayout(layout);
                JFormattedTextField t4,t5;
                t4 = new JFormattedTextField();
                NumberFormat inf;
                inf = NumberFormat.getIntegerInstance();
                inf.setMinimumIntegerDigits(1);
                inf.setMaximumFractionDigits(0);
                t5 = new JFormattedTextField(inf);
                TextField t1 = new TextField(),t2=new TextField(),t3=new TextField();
                for(int i=0;i<10;i++){
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
                            case 9:
                                panel.add(t5);
                                break;
                        }
                    }else
                        panel.add(new JLabel(library.getColumnName(i/2)));
                }
                frame.add(panel);
                BorderLayout bLayout= new BorderLayout();
                JPanel bottomPanel = new JPanel();
                JButton b = new JButton("OK");
                bottomPanel.add(b);
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String title,authorName,description;
                        title = t1.getText();
                        authorName = t2.getText();
                        description = t3.getText();
                        if( title == null)
                            title = "";
                        if( authorName == null)
                            authorName = "";
                        if( description == null)
                            description = "";
                        double price = 0;
                        int qty = 1;
                        boolean flag = true;
                        if (!isDigit(t4.getText())) {
                            t4.setBackground(Color.PINK);
                            flag = false;
                        }
                        else {
                            price = Double.parseDouble(t4.getText());
                            t4.setBackground(Color.WHITE);
                        }
                        if (!isInteger(t5.getText())) {
                            t5.setBackground(Color.PINK);
                            flag = false;
                        }
                        else {
                            qty = Integer.parseInt(t5.getText());
                            t5.setBackground(Color.WHITE);
                        }
                        if (flag) {
                            Book book = new Book(title, new Author(authorName),price,qty);
                            book.setDescription(description);
                            library.addBook(book);
                            frame.dispose();
                        }
                    }
                });
                frame.add(bottomPanel, bLayout.SOUTH);
                frame.setVisible(true);
                break;
            case "delete":
                int row = table.getSelectedRow();
                if (row != -1)
                    library.deleteBook(row);
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
}
