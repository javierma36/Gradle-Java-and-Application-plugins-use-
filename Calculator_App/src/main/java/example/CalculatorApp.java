/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;


/**
 *
 * @author mauriciobedoya
 */
public class CalculatorApp implements Calculator{
    private final CalculatorView calculatorView;
    public CalculatorApp(CalculatorView calculatorView){
        this.calculatorView = calculatorView;
    }

    @Override
    public double add() {
        return calculatorView.getValue1() + calculatorView.getValue2();
    }

    @Override
    public double multiply() {
       return  calculatorView.getValue1() * calculatorView.getValue2();
    }
    
    @Override
    public double substract(){
        return calculatorView.getValue1() - calculatorView.getValue2();
    }
    
    @Override
    public double divide(){
        double tmp = 0;
        try{
            tmp = calculatorView.getValue1() / calculatorView.getValue2();
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        return tmp;
    }
    
    @Override
    public void operate(){
        boolean tmp = true;
        
        do {
            calculatorView.Messages();
            switch (calculatorView.getOption()) {
                case 1:
                    calculatorView.getConsole().printf("%s \n", add());
                    break;
                case 2:
                    calculatorView.getConsole().printf("%s \n", multiply());
                    break;
                case 3:
                    calculatorView.getConsole().printf("%s \n", substract());
                    break;
                case 4:
                    calculatorView.getConsole().printf("%s \n", divide());
                    break;
                case 5:
                    calculatorView.getConsole().printf("%s \n", "Bye Bye");
                    tmp = false;
                    break;
                default:
                    calculatorView.getConsole().printf("%s \n", "Error");
                    break;
            }

        } while (tmp);
    }

    public static void main(String[] args) {
        
        CalculatorView calculatorView = new CalculatorView();
        CalculatorApp calculatorApp = new CalculatorApp(calculatorView);
        calculatorApp.operate();
    }
}
