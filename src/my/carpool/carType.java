/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.carpool;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author AKASH
 */

public class carType implements Serializable {
    private String name;
    private double perHourCharge;

    public void setPerHourCharge(double perHourCharge) {
        this.perHourCharge = perHourCharge;
    }

    public void setPerKiloCharge(double perKiloCharge) {
        this.perKiloCharge = perKiloCharge;
    }
    private double perKiloCharge;
    public ArrayList<car> car_arr;
    private double price;
    public carType(String newName, double newPerHourCharge, double newPerKiloCharge, double newPrice){
        name = newName;
        price = newPrice;
        perHourCharge=newPerHourCharge;
        perKiloCharge=newPerKiloCharge;
        car_arr=new ArrayList<>();
    }
    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public double getPerHourCharge(){
        return perHourCharge;
    }
    public double getPerKiloCharge(){
        return perKiloCharge;
    }
}
