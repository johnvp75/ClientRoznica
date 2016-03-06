/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica;

/**
 *
 * @author Евгений
 */
public class TableRecord {
    private String name;
    private String bar_code;
    private int count;
    private double cost;

    public TableRecord(String name, String bar_code, int count, double cost) {
        this.name = name;
        this.bar_code = bar_code;
        this.count = count;
        this.cost = cost;
    }

    public String getBar_code() {
        return bar_code;
    }

    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
