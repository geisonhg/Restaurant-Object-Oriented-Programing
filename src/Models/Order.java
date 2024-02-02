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
    ArrayList subOrder;
    int id;

    public Order() {
    }

    public Order(Date date, Table table, boolean status, ArrayList subOrder) {
        this.date = date;
        this.table = table;
        this.status = status;
        this.subOrder = subOrder;
    }
    
    
    
}
