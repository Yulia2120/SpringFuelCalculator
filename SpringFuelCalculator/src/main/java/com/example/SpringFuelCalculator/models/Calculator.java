package com.example.SpringFuelCalculator.models;
import jakarta.validation.constraints.Min;


public class Calculator {
    @Min(value = 0, message = "Number must not be negative")
    private double distance;  //расстояние

    @Min(value = 0, message = "Number must not be negative")
    private double consumption; // средний расход топлива
    @Min(value = 0, message = "Number must not be negative")
    private double fuelPrice; //стоимость 1 литра
    private double fuelCount; //количество топлива
    private double travelPrice; //стоимость поездки
   //Second calculator
   @Min(value = 0, message = "Number must not be negative")
    private double dist;
    private double consum;
    @Min(value = 0, message = "Number must not be negative")
    private double fuelC;
   //Third calculator
   @Min(value = 0, message = "Number must not be negative")
    private double consumAuto;
    @Min(value = 0, message = "Number must not be negative")
    private double countF;
    private double distTravel;

    public double getDistTravel() {
        return distTravel;
    }

    public void setDistTravel(double distTravel) {
        this.distTravel = distTravel;
    }

    public Calculator(){}


    public double getDist() {
        return dist;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }

    public double getConsum() {
        return consum;
    }

    public void setConsum(double consum) {
        this.consum = consum;
    }

    public double getFuelC() {
        return fuelC;
    }

    public void setFuelC(double fuelC) {
        this.fuelC = fuelC;
    }

    public double getConsumAuto() {
        return consumAuto;
    }

    public void setConsumAuto(double consumAuto) {
        this.consumAuto = consumAuto;
    }

    public double getCountF() {
        return countF;
    }

    public void setCountF(double countF) {
        this.countF = countF;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;

    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;

    }

    public double getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;

    }

    public double getFuelCount() {
        return fuelCount;
    }

    public void setFuelCount(double fuelCount) {
        this.fuelCount = fuelCount;
    }

    public double getTravelPrice() {
        return travelPrice;
    }

    public void setTravelPrice(double travelPrice) {
        this.travelPrice = travelPrice;
    }



}
