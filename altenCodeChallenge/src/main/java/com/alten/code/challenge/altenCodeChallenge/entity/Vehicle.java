package com.alten.code.challenge.altenCodeChallenge.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;



@Entity
@NamedQuery(query = "select u from Vehicle u", name = "query_find_all_vehicle")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE1")
	@SequenceGenerator(name="SEQUENCE1", sequenceName="SEQUENCE1", allocationSize=1)
	private int vID;
	
	private String vehicleID;
	
    private String registrationNo;
    
    private char status;
    
    private char lastActiveTime;
    
    private char lastModified;
    
	/*
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name="customerId") private Customer customer;
	 */
    
	public String getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
//	public Vehicle(String vehicleID, String registrationNo) {
//		super();
//		this.vehicleID = vehicleID;
//		this.registrationNo = registrationNo;
//	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public char getLastActiveTime() {
		return lastActiveTime;
	}
	public void setLastActiveTime(char lastActiveTime) {
		this.lastActiveTime = lastActiveTime;
	}
	public char getLastModified() {
		return lastModified;
	}
	public void setLastModified(char lastModified) {
		this.lastModified = lastModified;
	}
	/*
	 * public Customer getCustomerId() { return customer; } public void
	 * setCustomerId(Customer customerId) { this.customer = customerId; }
	 */

}
