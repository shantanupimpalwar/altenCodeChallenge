package com.alten.code.challenge.altenCodeChallenge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.alten.code.challenge.altenCodeChallenge.service.VehicleCustomerDetailsService;
//@ComponentScan("com.alten.code.challenge.altenCodeChallenge")
@SpringBootApplication
public class AltenCodeChallengeApplication{

	@Autowired
	VehicleCustomerDetailsService vehicleCustomerDetailsService; 
	
	public static void main(String[] args) {
		SpringApplication.run(AltenCodeChallengeApplication.class, args);
		//System.out.println("&&&&&&&&&&&&&&&&&&&&&");
	}
	
	
}

