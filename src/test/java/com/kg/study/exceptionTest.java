package com.kg.study;
import org.junit.Test;
public class exceptionTest
{
    sampleException s=new sampleException();
    @Test
    public void display(){
        s.print();
    }
    @Test(expected = ArithmeticException.class)
    public void testPrintMessage() {	
       System.out.println("Inside testPrintMessage()");     
       s.print();     
    }

}