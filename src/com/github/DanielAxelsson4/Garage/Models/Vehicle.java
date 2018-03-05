package com.github.DanielAxelsson4.Garage.Models;

import com.github.DanielAxelsson4.Garage.Utilities.VehicleType;

/**
 * 
 * @author Daniel Axelsson and Sohrab Azami
 * Class description: Vehicle class
 *
 */

public abstract class Vehicle {

	protected String registrationNumber;
	protected String color;
	protected int numberOfWheels;
	protected VehicleType vehicleType;
	protected String parkedGarage;

	protected Vehicle(String registrationNumber) {
		this.registrationNumber = registrationNumber;
		this.color = "";
		this.numberOfWheels = 0;
		this.vehicleType = VehicleType.NOTYPE;
	}

	public String getRegistrationNumber()  {
		return registrationNumber;
	}

	@Override
	public String toString() {
		return "RegistrationNumber = " + registrationNumber + " \n" + "color = " + color + " \n " + "Number of wheels= " + numberOfWheels + " \n" + "vehicle type= "
				+ vehicleType +  " \n ";
	}

































}
