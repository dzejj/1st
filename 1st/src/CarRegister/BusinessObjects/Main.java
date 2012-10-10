package CarRegister.BusinessObjects;

import CarRegister.BusinessObjects.Cars.*;
import CarRegister.BusinessObjects.Persons.Person;

public class Main {

	
	public static void main(String[] args) {
		Person p = new Person("Adam");
		
		Car c1=new PersonCar("Nissan", "gda12234");
		Car c2=new TruckCar();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("przed dodaniem lista");
		System.out.println(p.getCars().size());
		System.out.println(p.getCars().get(0));
		System.out.println(p.getCars().get(1));
		p.getCars().add(c2);
		p.getCars().add(c1);
		System.out.println("po dodaniu lista");
		System.out.println(p.getCars().size());
		System.out.println(p.getCars().contains(c1));
		System.out.println(p.getCars().contains(c2));
		for(Car c : p.getCars())
		{
			c.printData();
		}

	}

}
