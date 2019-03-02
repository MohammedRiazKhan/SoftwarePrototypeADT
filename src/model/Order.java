package model;

import java.util.List;

public class Order {
    
    private int orderId;
    private int numGuests;
    private int tableNum;
    
    public Order(int orderId, int numGuests, int tableNum){
        this.orderId = orderId;
        this.numGuests = numGuests;
        this.tableNum = tableNum;
        
    }

    public int getNumGuests() {
        return numGuests;
    }

    public void setNumGuests(int numGuests) {
        this.numGuests = numGuests;
    }

    public int getTableNum() {
        return tableNum;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

  
    
    
    
}
