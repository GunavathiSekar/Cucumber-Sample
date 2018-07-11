package com.kg.study;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

import java.util.List;
 import java.util.ArrayList;
import java.util.Arrays;;
// import java.util.Collection;
// import java.util.List;
 
// import static org.assertj.core.api.Assertions.assertThat;
 
@RunWith(Parameterized.class)

public class StandardCalculatorTest {
 
    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0}, { 1, 1},{ 10, 20}
        });
    }
 
    private final Calculator calculator;
    private final int first;
    private final int second;

 
    public StandardCalculatorTest(int first, 
                                  int second) {
         
        this.calculator = new Calculator();
        this.first = first;
        this.second = second;
      
    }
 
    @Test
    public void shouldReturnCorrectSum() {
        int actualSum = calculator.sum(first, second);
        assertEquals(first+second,actualSum);
        // assertThat(actualSum).isEqualByComparingTo(expectedSum);
    } 

    @Test
    public void shouldReturnCorrectMul() {
        int actualSum = calculator.mul(first, second);
        assertEquals(first*second,actualSum);
        // assertThat(actualSum).isEqualByComparingTo(expectedSum);
    }
}