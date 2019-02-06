package com.alten.code.challenge.altenCodeChallenge.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alten.code.challenge.altenCodeChallenge.entity.Vehicle;
import com.alten.code.challenge.altenCodeChallenge.repository.CustomerRepository;
import com.alten.code.challenge.altenCodeChallenge.repository.VehicleRepository;
import com.alten.code.challenge.altenCodeChallenge.service.VehicleCustomerDetailsService;

@Service
public class VehicleCustomerDetailsServiceImpl implements VehicleCustomerDetailsService {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private VehicleRepository vehicleRepository;
	
	
	@Override
	public List<String> getAllVehicles(String vehicleID) {
		List<String> result = new ArrayList<String>();
        List<Vehicle> vehicles = vehicleRepository.findByVehicleId(vehicleID);
        for (Vehicle vehicle : vehicles) {
            result.add(vehicle.getRegistrationNo());
        }
        return result;
    }

}
