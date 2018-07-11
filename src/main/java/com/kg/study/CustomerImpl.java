package com.kg.study;

import java.util.ArrayList;
import java.util.List;

public class CustomerImpl implements CustomerDao
{
    
    List<Customer>  customerlist = new ArrayList<Customer>();
    //    Customer c1 =new Customer(1, "guna", 96290163L, 500L, 20L);
    //    Customer c2 = new Customer(2, "thanu", 96290163L, 500L, 20L);
    //    Customer c3 = new Customer(3, "dhamomadharan", 95665103L, 1000L, 30L);
    
    public void createCustomer(Customer c) 
    {
        customerlist.add(c);
        // customer.add(c);
        // customer.add(c3);
		
	}
	public List<Customer> getAllCustomer() {
		return customerlist;
	}
	public Customer getCustomer(int custid) {
        Customer c2=new Customer();
        for (Customer c : customerlist) {
            if (c.getCustid() == custid) {
                c2=c;  
                System.out.println(c2);   
            }
        }
        return c2;
    }
    public Customer updateCustomer(int customerId, Customer c2) {
        for (Customer c : customerlist) {
            if (c.getCustid() == customerId) {
                c.setCustid(c2.getCustid());
                c.setName(c2.getName());
                c.setPhoneNumber(c2.getPhoneNumber());
                c.setPurchaseAmount(c2.getPurchaseAmount());
                c.setPointsEarned(c2.getPointsEarned());
            }
        }
		return c2;
    }
	
    public void removeCustomer(int custid) 
    {
        int index=0;
        for (Customer c : customerlist) {
            if (c.getCustid() == custid) {
              index=customerlist.indexOf(c);
            }
        }   
        customerlist.remove(index);
        System.out.println(customerlist);	
	}
		
	

}