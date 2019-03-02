/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author mauriciobedoya
 */
public class CalculatorAppTest {

    @Mock
    private CalculatorView calculatorView;

    private CalculatorApp calculatorApp;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(calculatorView.getValue1()).thenReturn(2.0);
        when(calculatorView.getValue2()).thenReturn(3.5);
        calculatorApp = new CalculatorApp(calculatorView);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void addTest() {
        double expected = 5.5;
        double actual = calculatorApp.add();
        Assert.assertThat("Addition function in CalculatorApp: Expected != Real", actual, is(expected));
    }
    
    @Test
    public void multiplyTest() {
        double expected = 7.0;
        double actual = calculatorApp.multiply();
        Assert.assertThat("Multiply function in CalculatorApp: Expected != Real", actual, is(expected));
    }
    
    @Test
    public void substractTest(){
        double expected = -1.5;
        double actual = calculatorApp.substract();
        Assert.assertThat("Substract function in CalculatorApp: Expected != Real", actual, is(expected));
    }
    
    @Test
    public void divideTest(){
        double expected = 0.57143;
        String actualString = String.format("%.5f", calculatorApp.divide());
        double actual = Double.parseDouble(actualString);
        Assert.assertThat("Divide function in CalculatorApp: Expected != Real", actual, is(expected));
    }
}
