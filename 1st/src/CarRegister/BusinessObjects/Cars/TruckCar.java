package CarRegister.BusinessObjects.Cars;

import CarRegister.BusinessObjects.Persons.Person;

public class TruckCar extends Car{

	public void setOwner(Person owner){
		this.owner = owner;
	}
	
	public void printData()
	{
		System.out.println("This is a truck");
	}
}
