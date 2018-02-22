package com.sh.s3;

public class Car {
	String color;
	String brand;
	int cc;
	
	//생성자도 오버로딩이 가능함
	//오버로딩은 타입과 또는 매개변수의 갯수가 달라야함
	
	public Car() {
		this("Red");//자신의 또다른 생성자를 호출
		//default,기본,빈 =>생성자 매개변수가 비어있기때문에
		/*color="Red";	//default 생성자는 습관적으로 만들어둬야 한다
		brand="Audi";
		cc=3000;*/
	}
	
	public Car(String color) {
		this(color,"Audi");//this는 생성자 라인의 제일 첫줄에 있어야함
		/*this.color=color;//===>멤버변수와 지역변수의 이름이 같을때 헷갈리지 않게 멤버변수를 가르킬때 this를 사용한다
		brand="Audi";	//this는 생략이 가능
		cc=3000;*/
	}
	public Car(String color, String brand) {
		this(color, brand, 3000);
		/*this.color=color;
		this.brand=brand;
		cc=3000;*/
	}
	public Car(String color, String brand, int cc) {
		this.color=color;
		this.brand=brand;
		this.cc=cc;
	}
	
	public void info() {
		System.out.println("Color : "+this.color);
		System.out.println("Brand : "+this.brand);
		System.out.println("Cc : "+this.cc);
		this.make();
	}
	public void make() {
		System.out.println("자동차 제작 완료");
		
	}

}
