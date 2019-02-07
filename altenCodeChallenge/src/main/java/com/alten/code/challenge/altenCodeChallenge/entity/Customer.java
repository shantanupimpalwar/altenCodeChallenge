package com.alten.code.challenge.altenCodeChallenge.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@NamedQuery(query = "select u from Customer u", name = "query_find_all_customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE2")
	@SequenceGenerator(name="SEQUENCE2", sequenceName="SEQUENCE2", allocationSize=1)
	private int customerId;
    private String customerName;
    private String address;
    
	/*
	 * @OneToMany(mappedBy = "customerId") private List<Vehicle> vehicles = new
	 * ArrayList<Vehicle>();
	 */
    
	/*
	 * public List<Vehicle> getVehicles() { return vehicles; }
	 */
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
