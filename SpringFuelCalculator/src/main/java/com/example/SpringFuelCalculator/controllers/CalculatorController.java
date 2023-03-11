package com.example.SpringFuelCalculator.controllers;
import com.example.SpringFuelCalculator.dao.CalculatorDAO;
import com.example.SpringFuelCalculator.models.Calculator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("calculator")
public class CalculatorController {

    private final CalculatorDAO calculatorDAO;

     @Autowired
    public CalculatorController(CalculatorDAO calculatorDAO) {
        this.calculatorDAO = calculatorDAO;

     }

    @GetMapping()
    public String newCalculator(Model model){
        model.addAttribute("calculator", new Calculator());
        return "calculator";
    }
    @PostMapping()
    public String create(@ModelAttribute("calculator") @Valid Calculator calculator,
                         BindingResult bindingResult){
         if(bindingResult.hasErrors())
             return "calculator";
        calculatorDAO.save(calculator);
        calculatorDAO.priceTravel(calculator);
        calculatorDAO.countFuel(calculator);
        return "calculator";
    }
    @PatchMapping()
    public String createCountFuel(@ModelAttribute("calculator") @Valid Calculator calculator,
                                  BindingResult bindingResult){
         if(bindingResult.hasErrors())
             return "calculator";
        calculatorDAO.save(calculator);
        calculatorDAO.consumptionFuel(calculator);
        return "calculator";
    }

    @PutMapping()
    public String createDistance(@ModelAttribute("calculator") @Valid Calculator calculator,
                                 BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return "calculator";
        calculatorDAO.save(calculator);
        calculatorDAO.countTravel(calculator);
        return "calculator";

    }




}
