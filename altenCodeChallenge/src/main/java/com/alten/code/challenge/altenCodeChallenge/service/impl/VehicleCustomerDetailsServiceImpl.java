package com.alten.code.challenge.altenCodeChallenge.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.alten.code.challenge.altenCodeChallenge.entity.Customer;
import com.alten.code.challenge.altenCodeChallenge.entity.Vehicle;

import com.alten.code.challenge.altenCodeChallenge.service.VehicleCustomerDetailsService;

@Repository
@Transactional
public class VehicleCustomerDetailsServiceImpl implements VehicleCustomerDetailsService {

	/*
	 * @Autowired private CustomerRepository customerRepository;
	 * 
	 * @Autowired private VehicleRepository vehicleRepository;
	 * 
	 * 
	 * @Override public List<String> getAllVehicles(String vehicleID) { List<String>
	 * result = new ArrayList<String>(); List<Vehicle> vehicles =
	 * vehicleRepository.findByVehicleId(vehicleID); for (Vehicle vehicle :
	 * vehicles) { result.add(vehicle.getRegistrationNo()); } return result; }
	 */
	@PersistenceContext
	private EntityManager entityManager;
	
	public void getVehical()
	{
		Customer customer = entityManager.find(Customer.class, 1);
		Vehicle vehicle2 = entityManager.find(Vehicle.class, 1);
		System.out.println("###"+ vehicle2.getRegistrationNo());
		System.out.println("###"+ customer.getCustomerName());
	}
	
	
}
