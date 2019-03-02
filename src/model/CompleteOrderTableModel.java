package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

public class CompleteOrderTableModel extends AbstractTableModel {
    
    public static ArrayList<Order> bookings;
    private final String[] columnHeadings = {"Order#", "Table#", "#Guests"};

    public CompleteOrderTableModel(){

        bookings = new ArrayList<>(10);

    }

    public void addData(Order booking){

        bookings.add(booking);
        fireTableDataChanged();

    }

    public void removeData(int row){

        bookings.remove(row);
        fireTableDataChanged();

    }

    @Override
    public String getColumnName(int column){

        return columnHeadings[column];
    }

    @Override
    public int getRowCount(){

        return bookings.size();

    }

    @Override
    public int getColumnCount(){

        return 3;

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {

        switch (columnIndex){

           

        }

        return Object.class;

    }


//    @Override
//    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//
//        Order booking = bookings.get(rowIndex);
//        
//        switch (columnIndex){
//
//             case 11:
//                booking.setIsComplete((Boolean) aValue);
//            
//
//        }
//        fireTableCellUpdated(rowIndex, columnIndex);
//    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Order booking = bookings.get(rowIndex);

        switch (columnIndex){

            case 0:
                return booking.getOrderId();

            case 1:
                return booking.getTableNum();

            case 2:
               return booking.getNumGuests();
            
            
            default:
                return null;
        }
    }
}
