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
    private String innerGroup;

    public TableRecord(String name, String bar_code, int count, double cost) {
        this.name = name;
        this.bar_code = bar_code;
        this.count = count;
        this.cost = cost;
    }

    public TableRecord(String name, String bar_code, int count, Double cost, String innerGroup) {
        this.name = name;
        this.bar_code = bar_code;
        this.count = count;
        this.cost = cost;
        this.innerGroup = innerGroup;
    }

    public String getInnerGroup() {
        return innerGroup;
    }

    public void setInnerGroup(String innerGroup) {
        this.innerGroup = innerGroup;
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

    private String getNameWithoutCost(){
        return getName().substring(getName().indexOf(" ")+1);
    }
    
/*
    public int compareTo(TableRecord o) {
        if (this.getNameWithoutCost().equals(o.getNameWithoutCost())){
            return this.getCost().compareTo(o.getCost());
        }else{
            return this.getNameWithoutCost().compareTo(o.getNameWithoutCost());
        }
    }
    */
    
        public int compareTo(TableRecord o) {
        if (Integer.decode(this.innerGroup)==Integer.decode(o.innerGroup)){
            return this.getCost().compareTo(o.getCost());
        }else{
            return Integer.decode(this.innerGroup).compareTo(Integer.decode(o.innerGroup));
        }
    }

}
