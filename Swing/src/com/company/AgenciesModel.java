package com.company;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class AgenciesModel extends AbstractTableModel {
    List<Agency> network = new ArrayList<>();
    @Override
    public int getRowCount() {
        return network.size();
    }
    AgenciesModel(Agency[] ag) {
        for (Agency a: ag) {
            network.add(a);
        }
    }

    public List<Agency> getNetwork() {
        return network;
    }

    AgenciesModel(){

    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Agency a = network.get(i);
        switch (i1){
            case 0: return a.getName();
            case 1: return a.getCity();
            case 2: return a.getPhone();
            case 3: return a.getEmployeeCount();
        }
        return null;
    }

    public void addAgency(Agency ag) {
        network.add(ag);
        fireTableDataChanged();
    }

    public void removeAgency(int id){
        network.remove(id);
        fireTableDataChanged();
    }

    public Agency getAgency(int index){
        return network.get(index);
    }

    public String getColumnName(int column) {
        switch (column){
            case 0:
                return "NAME";
            case 1:
                return "CITY";
            case 2:
                return "PHONE";
            case 3:
                return "EMPLOYEE COUNT";
        }
        return "";
    }
}
