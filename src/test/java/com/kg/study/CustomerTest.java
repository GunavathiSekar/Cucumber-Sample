package com.kg.study;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest
{
    CustomerImpl customerimpl=new CustomerImpl();
    Customer c=new Customer();
    Customer c1=new Customer();
    Customer c2=new Customer();
    Customer c4=new Customer();
    Customer c5=new Customer();
    //=new Customer( 1,"name",1L,1L,1L);
    // @BeforeClass
    // public static void setup()
    // {
    //      cl=new CustomerImpl();
    // }
    @Before
    public void createCustomerTest()
    {
       
        c.setCustid(101);
        c.setName("Lavanya");
        c.setPhoneNumber(1234L);
        c.setPurchaseAmount(345);
        c.setPointsEarned(90L);
        customerimpl.createCustomer(c);
        c1.setCustid(102);
        c1.setName("Guna");
        c1.setPhoneNumber(1234L);
        c1.setPurchaseAmount(345);
        c1.setPointsEarned(90L);
        c2.setCustid(103);
        c2.setName("Dhamu");
        c2.setPhoneNumber(1234L);
        c2.setPurchaseAmount(345);
        c2.setPointsEarned(90L);
        c4.setCustid(104);
        c4.setName("Thanu");
        c4.setPhoneNumber(1234L);
        c4.setPurchaseAmount(345);
        c4.setPointsEarned(90L);
        c5.setCustid(105);
        c5.setName("Jawahar");
        c5.setPhoneNumber(1234L);
        c5.setPurchaseAmount(345);
        c5.setPointsEarned(90L);
        customerimpl.createCustomer(c2);
        customerimpl.createCustomer(c1);
        customerimpl.createCustomer(c5);
       //System.out.print(c2);System.out.print(c);System.out.print(c1);
    }
    @Test
    public void updateDetails()
    {
        assertEquals(c4,customerimpl.updateCustomer(103, c4));
    }
   @Test
   public void display()
   {
    // System.out.println("Display customer Details");

   for (Customer c : customerimpl.getAllCustomer())
   {
      System.out.println("Customer Id:" + c.getCustid() + "Customer Name : " + c.getName()+"Phone no"+c.getPhoneNumber()+"Purchase Amount"+c.getPurchaseAmount()+"Points Earned"+c.getPointsEarned());
    }
} 
@Test
public void retrieveCustomer()
{
  assertEquals(c, customerimpl.getCustomer(101));    
}
@Test
public void removecustomer()
{
    
   	customerimpl.removeCustomer(105);
}
}