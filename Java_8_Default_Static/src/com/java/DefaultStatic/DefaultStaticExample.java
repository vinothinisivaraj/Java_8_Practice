package com.java.DefaultStatic;

interface Vehicle {
	String getBrand();

	String speedUp();

	String slowDown();

	default String turnAlarmOn() {
		return "turning vehicle alarm on";

	}

	default String turnAlarmOff() {
		return "turning vehicle alarm off";
	}

	static String getCompany() {
		return "Suzuki";
	}
}

class car implements Vehicle {

	@Override
	public String getBrand() {
		return "BMW";
	}

	@Override
	public String speedUp() {
		return "Car is speeding";
	}

	@Override
	public String slowDown() {
		return "slowing down";
	}

}

public class DefaultStaticExample {
	public static void main(String[] args) {
		// Vehicle vehicle = new car(); -- can use both 42, 43 way of object creation
		car vehicle = new car();
		vehicle.getBrand();
		vehicle.speedUp();
		vehicle.slowDown();

		vehicle.turnAlarmOn();
		System.out.println(vehicle.turnAlarmOff());
		//printing static method value - Interfacename.methodName
		
		System.out.println(Vehicle.getCompany());

	}
}
