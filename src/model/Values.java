/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Koaja
 */
public class Values {

    private int kitchenCold, kitchenHot, bathroomCold, bathroomHot, year;
    private String month;
    private double mc3Used;

    public Values(String month, int year, int kitchenCold, int kitchenHot, int bathroomCold, int bathroomHot, double mc3Used) {
        this.kitchenCold = kitchenCold;
        this.kitchenHot = kitchenHot;
        this.bathroomCold = bathroomCold;
        this.bathroomHot = bathroomHot;
        this.year = year;
        this.month = month;
        this.mc3Used = mc3Used;
    }

    public Values(int year) {
        this.year = year;
    }

    /**
     * @return the kitchenCold
     */
    public int getKitchenCold() {
        return kitchenCold;
    }

    /**
     * @param kitchenCold the kitchenCold to set
     */
    public void setKitchenCold(int kitchenCold) {
        this.kitchenCold = kitchenCold;
    }

    /**
     * @return the kitchenHot
     */
    public int getKitchenHot() {
        return kitchenHot;
    }

    /**
     * @param kitchenHot the kitchenHot to set
     */
    public void setKitchenHot(int kitchenHot) {
        this.kitchenHot = kitchenHot;
    }

    /**
     * @return the bathroomCold
     */
    public int getBathroomCold() {
        return bathroomCold;
    }

    /**
     * @param bathroomCold the bathroomCold to set
     */
    public void setBathroomCold(int bathroomCold) {
        this.bathroomCold = bathroomCold;
    }

    /**
     * @return the bathroomHot
     */
    public int getBathroomHot() {
        return bathroomHot;
    }

    /**
     * @param bathroomHot the bathroomHot to set
     */
    public void setBathroomHot(int bathroomHot) {
        this.bathroomHot = bathroomHot;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * @return the mc3Used
     */
    public double getMc3Used() {
        return mc3Used;
    }

    /**
     * @param mc3Used the mc3Used to set
     */
    public void setMc3Used(double mc3Used) {
        this.mc3Used = mc3Used;
    }

}
