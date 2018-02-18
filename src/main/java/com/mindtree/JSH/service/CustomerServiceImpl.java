package com.mindtree.JSH.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.JSH.dao.CustomerDAO;
import com.mindtree.JSH.entity.model.Customer;

import in.benchresources.cdm.customer.CustomerListType;
import in.benchresources.cdm.customer.CustomerType;
 


@Component
public class CustomerServiceImpl implements ICustomerService {
 
    @Autowired
    private CustomerDAO customerDAO;
 
    @Override
    public String createOrSaveNewCustomerInfo(CustomerType customerType) {
    	System.out.println("Add a cutomer "+ customerType.getName());
        Customer newCustomer = new Customer();
        newCustomer.setCustomerId(customerType.getCustomerId());
        newCustomer.setName(customerType.getName());
        newCustomer.setAge(customerType.getAge());
        return customerDAO.insertNewCustomer(newCustomer);
    }
 
    @Override
    public CustomerType getCustomerInfo(int customerId) {
    	System.out.println("get a customer:: " + customerId);
        Customer getCustomer = customerDAO.getCustomer(customerId);
 
        CustomerType customerType = new CustomerType();
        customerType.setCustomerId(getCustomer.getCustomerId());
        customerType.setName(getCustomer.getName());
        customerType.setAge(getCustomer.getAge());
        return customerType;
    }
 
    @Override
    public CustomerListType getAllCustomerInfo() {
    	System.out.println("Get all customer");
        List<Customer> lstCustomer = customerDAO.getAllCustomer();
        CustomerListType customerListType = new CustomerListType();
 
        for(Customer customer : lstCustomer){
            CustomerType customerType = new CustomerType();
            customerType.setCustomerId(customer.getCustomerId());
            customerType.setName(customer.getName());
            customerType.setAge(customer.getAge());
            customerListType.getCustomerType().add(customerType);
        }
        return customerListType;
    }

	@Override
	public String startWebService() {
		System.out.println("Start Service");
		// TODO Auto-generated method stub
		return "Web service started";
	}
}