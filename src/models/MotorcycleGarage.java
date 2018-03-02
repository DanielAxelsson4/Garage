package models;

import utilities.GarageType;

public class MotorcycleGarage extends Garage {
	
	public MotorcycleGarage(String garageName, GarageType garageType) {
		super(garageName);
		this.garageType = GarageType.AIRPLANE_GARAGE;
	}

	public GarageType getGarageType() {
		return this.garageType;
	}

	@Override
	public void addVehicle(String registrationNumber, Vehicle newVehicle){
		this.addVehicle(registrationNumber, newVehicle);
		//add something if you need
	}

	public void removeVehicle(Vehicle newVehicle ) {
		this.removeVehicle(newVehicle);
	}

}
