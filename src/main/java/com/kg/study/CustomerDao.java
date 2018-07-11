package com.kg.study;

import java.util.List;

public interface CustomerDao  
{
    public void createCustomer(Customer c);
    public List<Customer> getAllCustomer();
    public Customer  getCustomer(int custid);
    public Customer updateCustomer(int custid,Customer c2);
    public void removeCustomer(int custid);
}