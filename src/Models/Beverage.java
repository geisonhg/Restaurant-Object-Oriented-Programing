/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author geiso
 */
public class Beverage extends Item{
    boolean Alcoholic;

    public Beverage(boolean Alcoholic, String name, double price, String type) {
        super(name, price, type);
        this.Alcoholic = Alcoholic;
    }

    public Beverage() {
    }
    
    
}
