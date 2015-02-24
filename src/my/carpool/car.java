/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.carpool;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author AKASH
 */
public class car implements Serializable {

    private String borrowTime;
    private int carState;
    public int distanceRun;
    public int hoursRun;
    private boolean AC;
    public double revenue;
    public double fuelConsumed;
    private int id;
    public double advance;
    public double repairCost;
    public int rentedOut;

    public car(int newID, boolean set) {
        id = newID;
        distanceRun = 0;
        hoursRun = 0;
        AC = set;
        revenue = 0.0;
        fuelConsumed = 0;
        carState = 1;
        advance = 0;
        repairCost=0;
        rentedOut=0;
    }
    public void setBorrowTime(String time){
        borrowTime=time;
    }
    public String getBorrowTime(){
        return borrowTime;
    }
    public void setAdvance(double newAdvance) {
        advance = newAdvance;
    }
    public double getAdvance() {
        return advance;
    }

    public void setCarState(int i) {
        carState = i;
    }

    public boolean getType() {
        return AC;
    }

    public int getCarState() {
        return carState;
    }

    public int getID() {
        return id;
    }
}
