package com.example.SpringFuelCalculator.dao;

import com.example.SpringFuelCalculator.models.Calculator;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CalculatorDAO {
    private final List<Calculator> calculators;
    {
        calculators = new ArrayList<>();
        calculators.add(new Calculator());
    }
    public void save(Calculator calculator){
        calculators.add(calculator);
    }
    public void priceTravel(Calculator calculator){
       calculator.setTravelPrice(calculator.getConsumption()/100 * calculator.getFuelPrice() * calculator.getDistance());
    }
    public void countFuel(Calculator calculator){
        calculator.setFuelCount(calculator.getConsumption()/100*calculator.getDistance());
    }

    public void consumptionFuel(Calculator calculator){
        calculator.setConsum(calculator.getFuelC()/calculator.getDist()*100);
    }
    public void countTravel(Calculator calculator){
        calculator.setDistTravel(calculator.getCountF()/calculator.getConsumAuto()*100);
    }
}
