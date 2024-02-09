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
public class TakeAway {
    String name;
    String address;
    String status;
    String phone;
    ArrayList<Item> items;

    public TakeAway() {
    }

    public TakeAway(String name, String address, String status, String phone, ArrayList<Item> items) {
        this.name = name;
        this.address = address;
        this.status = status;
        this.phone = phone;
        this.items = items;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    public void addItem(Item item){
        this.items.add(item);
    }
    
    public void deleteItem(String item){
        this.items.remove(this.items.indexOf(item));
    }
    
}
