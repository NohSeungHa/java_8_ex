package com.sh.s2;

public class Food_Main {

	public static void main(String[] args) {

		Shef_Steak st=new Shef_Steak();
		Food_Steak steak=st.makeSteak(1);
		System.out.println(steak.name);
		System.out.println(steak.price);
		System.out.println(steak.source.oilName);
		System.out.println(steak.source.spiceName);
	}
}


