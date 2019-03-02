/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.io.Console;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mauriciobedoya
 */
public class CalculatorView {

    private final Console console;
    private Integer option = null;
    private double value1, value2;

    public CalculatorView() {
        console = System.console();
    }

    public int getOption() {
        return option;
    }

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public void readValues() {
        try {
            value1 = Double.parseDouble(console.readLine("%s", "Value 1: "));
            value2 = Double.parseDouble(console.readLine("%s", "Value 2: "));
        } catch (NumberFormatException ex) {
            System.out.println("Incorrect value !!");
            Messages();
        }
    }
    
    public void readOption(){
        try {
            option = Integer.parseInt(console.readLine("%s", "Choose one option: "));
            Integer[] options = {1,2,3,4};
            List<Integer> options1 = Arrays.asList(options);
            if (options1.contains(option)) {
                readValues();
            }
        } catch (NumberFormatException ex) {
            System.out.println("Option value must be 1,2 or 3.");
            Messages();
        }
    }

    public void Messages() {
        try {
            console.printf("\t %s \n", "Welcome to Calculator App");
            console.printf("%s \n", "1) Addition");
            console.printf("%s \n", "2) Multiplication");
            console.printf("%s \n", "3) Substraction");
            console.printf("%s \n", "4) Division");
            console.printf("%s \n", "5) Exit");
            readOption();
            
        } catch (NullPointerException ex) {
            System.out.println("Console not Found");
        }
    }

    public Console getConsole() {
        return console;
    }
}
