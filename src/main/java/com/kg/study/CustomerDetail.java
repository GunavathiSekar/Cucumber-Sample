package com.kg.study;

public class CustomerDetail
{
    public static void main(String[] args)
     {
        
        CustomerDao cl=new CustomerImpl();
        cl.createCustomer(new Customer(1, "name", 1324, 657, 34));
        for (Customer c : cl.getAllCustomer())
         {
            System.out.println("Customer Id:" + c.getCustid() + ", Name : " + c.getName());
        }
        int custid = 0;
        System.out.println(cl.getCustomer(custid));
        System.out.println(" ");
    
    
  }  
}