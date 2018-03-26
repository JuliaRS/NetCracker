package com.company;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JULIA on 21.03.2018.
 */
public class LibraryModel extends AbstractTableModel {
    private List<Book> library = new ArrayList<Book>();

    LibraryModel(){
        Book[] books = new Book[2];
        Author author=new Author("Alexander Pushkin", 1799, 1837);
        books[0] = new Book("The Captain's Daughter", author,300 );
        books[0].setQty(1);
        books[0].setDescription("historical novel");
        books[1] = new Book(" The Bronze Horseman",author,250);
        books[1].setQty(2);
        books[1].setDescription("A Petersburg Tale is a narrative poem");
        library.add(books[0]);
        library.add(books[1]);
    }

    LibraryModel(Book[] books) {
        for (Book book: books) {
            library.add(book);
        }
    }


    public void addBook(Book book) {
        library.add(book);
        fireTableDataChanged();
    }

    public void deleteBook(int id) {
        library.remove(id);
        fireTableDataChanged();
    }

    public void setName(int id, String name){
        Book book = library.get(id);
        book.setName(name);
    }

    @Override
    public int getRowCount() {
        return library.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Book book=library.get(rowIndex);
        switch (columnIndex){
            case 0:
                return book.getName();
            case 1:
                return book.getAuthor().getName();
            case 2:
                return book.getDescription();
            case 3:
                return book.getPrice();
            case 4:
                return book.getQty();
        }
        return null;
    }

    public String getColumnName(int column) {
        switch (column){
            case 0:
                return "Title";
            case 1:
                return "Author";
            case 2:
                return "Description";
            case 3:
                return "Price(RUB)";
            case 4:
                return "Quantity";
        }
        return "";
    }

    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Double.class;
            case 4:
                return Integer.class;
        }
        return Object.class;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Book book=library.get(rowIndex);
        switch (columnIndex){
            case 0:
                book.setName((String)aValue);
                break;
            case 1:
                book.getAuthor().setName((String)aValue);
                break;
            case 2:
                book.setDescription((String)aValue);
                break;
            case 3:
                book.setPrice((Double)aValue);
                break;
            case 4:
                book.setQty((Integer)aValue);
                break;
        }
        fireTableCellUpdated(rowIndex,columnIndex);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

}
