package com.alten.code.challenge.altenCodeChallenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alten.code.challenge.altenCodeChallenge.entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String>{
	
	List<Vehicle> findByVehicleId(String vehicleId);
}
