package com.sh.s3;

public class CarMain {

	public static void main(String[] args) {
		Car c = new Car();
		c.info();

		
		Car c2 = new Car("Black");
		c2.info();
		
		Car c3 = new Car("White","Kia");
		c3.info();
		
		Car c4 = new Car("Green","Benz",3500);
		c4.info();

	}

}
