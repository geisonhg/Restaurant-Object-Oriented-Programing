/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
/**
 *
 * @author geiso
 */
public class Table {
    int tableNumber;
    boolean status;
    ArrayList<Order> Orders;

    public Table() {
    }

    public Table(int tableNumber, boolean status, ArrayList<Order> Orders) {
        this.tableNumber = tableNumber;
        this.status = status;
        this.Orders = Orders;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ArrayList<Order> getOrders() {
        return Orders;
    }

    public void setOrders(ArrayList<Order> Orders) {
        this.Orders = Orders;
    }
    
    
}
