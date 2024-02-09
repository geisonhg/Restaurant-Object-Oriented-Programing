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
public class Company {
    String name;
    int id;
    ArrayList employees;

    public Company() {
    }

    public Company(String name, int id, ArrayList employees) {
        this.name = name;
        this.id = id;
        this.employees = employees;
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

    public ArrayList getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList employees) {
        this.employees = employees;
    }
    
    public void addEmployee(Employe employe){
        employe.setId(this.employees.size()-1);
        this.employees.add(employe);
    }
    
    public void removeEmployee(int id){
        this.employees.remove(employees.indexOf(id));
    }
    
    
}
