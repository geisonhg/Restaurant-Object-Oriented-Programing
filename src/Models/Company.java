/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author geiso
 */
public class Company {

    String name;
    int id;
    ArrayList<Employe> employees;

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

    public void addEmployee(Employe employe) {
        employe.setId(this.employees.size() + 1);
        this.employees.add(employe);
    }

    public void removeEmployee(int id) {
        
        for (int i = 0; i < this.employees.size(); i++) {
            if (this.employees.get(i).getId() == id) {
                this.employees.remove(employees.indexOf(id));
                JOptionPane.showConfirmDialog(null,this.employees.get(i).name+ " is Deleted");
                break;
            }
        }
        JOptionPane.showConfirmDialog(null,"Incorrect id");

    }

    public String findEmployee(int id) {

        for (int i = 0; i < this.employees.size(); i++) {
            if (this.employees.get(i).getId() == id) {
                return this.employees.get(i).getName();
            }
        }
        return null;
    }
    
    public String showEmployee(){
        String names="";
        for (int i = 0; i < this.employees.size(); i++) {
            names = names +" "+this.employees.get(i).getName();
        }
        return names;
    }

}
