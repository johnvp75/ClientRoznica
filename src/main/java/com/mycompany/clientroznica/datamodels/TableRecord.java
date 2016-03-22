/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.datamodels;

/**
 *
 * @author Евгений
 */
public class TableRecord implements Comparable<TableRecord>{
    private String name;
    private String bar_code;
    private int count;
    private Double cost;

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

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getCostAsString(){
        return String.format("%.2f руб.", cost);
    }


    public int compareTo(TableRecord o) {
        if (this.getName().equals(o.getName())){
            return this.getCost().compareTo(o.getCost());
        }else{
            return this.getName().compareTo(o.getName());
        }
    }
}
