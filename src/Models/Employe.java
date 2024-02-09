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
public abstract class Employe {
    
    String name;
    int id;
    Boolean managerPermisions;

    public Employe() {
    }

    public Employe(String name, int id, Boolean managerPermisions) {
        this.name = name;
        this.id = id;
        this.managerPermisions = managerPermisions;
    }

    public Boolean getManagerPermisions() {
        return managerPermisions;
    }

    public void setManagerPermisions(Boolean managerPermisions) {
        this.managerPermisions = managerPermisions;
    }

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public abstract void takeOrder(Item item);
    public abstract void closeOrder();
    
    
}
