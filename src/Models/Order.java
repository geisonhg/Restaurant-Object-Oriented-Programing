/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author geiso
 */
public class Order {
    Date date;
    Table table;
    boolean status;
    ArrayList<Item> Splits;
    ArrayList<Item> items;
    int id;
    double totalToPay;

    public Order() {
    }

    public Order(Date date, Table table, boolean status, ArrayList<Item> Splits, ArrayList<Item> items, int id, double totalToPay) {
        this.date = date;
        this.table = table;
        this.status = status;
        this.Splits = Splits;
        this.items = items;
        this.id = id;
        this.totalToPay = totalToPay;
    }

    public ArrayList<Item> getSplits() {
        return Splits;
    }

    public void setSplits(ArrayList<Item> Splits) {
        this.Splits = Splits;
    }

    

    public double getTotalToPay() {
        return totalToPay;
    }

    public void setTotalToPay(double totalToPay) {
        this.totalToPay = totalToPay;
    }


    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addItem(Item item){
        this.items.add(item);
    }
    
    public void deleteItem(String string, int id){     
        this.items.remove(this.items.indexOf(string));
    }
    
    public void calcSubTotal(){
        for (int i = 0; i < this.items.size(); i++) {
            this.totalToPay +=this.items.get(i).getPrice(); 
        }
    }
    
    public void addTip(double tip){
        this.totalToPay+=tip;
    }
    
    public void addItemToSplitOrder(Item item){
        this.Splits.add(item);
        this.items.remove(this.items.indexOf(item));
    }
    
    
    
    public void splitOrdet(){
        
    }
    
    
    
    
    
    
    
}
