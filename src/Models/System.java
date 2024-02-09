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
public class System {
    String name;
    ArrayList stock;
    ArrayList<TakeAway> takeAways;

    public System() {
    }

    public System(String name, ArrayList stock, ArrayList<TakeAway> takeAways) {
        this.name = name;
        this.stock = stock;
        this.takeAways = takeAways;
    }

    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getStock() {
        return stock;
    }

    public void setStock(ArrayList stock) {
        this.stock = stock;
    }

    public ArrayList<TakeAway> getTakeAways() {
        return takeAways;
    }

    public void setTakeAways(ArrayList<TakeAway> takeAways) {
        this.takeAways = takeAways;
    }

    

    
    public void addItem(Item item){
        this.stock.add(item);
    }
    
    public void removeItem(String name){
        this.stock.remove(this.stock.indexOf(name));
    }
}
