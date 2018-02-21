package com.sh.s2;

import java.util.Scanner;

public class Menu {
	
	public void order() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.안심스테이크");
		System.out.println("2.등심스테이크");
		System.out.println("3.립스테이크");
		System.out.println("4.크림파스타");
		System.out.println("5.로제파스타");
		System.out.println("6.알리오올리오파스타");
		int select = sc.nextInt();
		Shef_Steak st=new Shef_Steak();
		Shef_Pasta pasta=new Shef_Pasta();
		Bill bill = new Bill();
		Food_Steak steak=null;
		Food_pasta pa = null;
		if(select<4) {
			steak = st.makeSteak(select);
			bill.billSteak(steak);
		}else {
			pa=pasta.makePasta(select-3);
			bill.billPasta(pa);
		}
		/*switch (select) {
		case 1:
			steak=st.makeSteak(1);
			System.out.println(steak.name);
			System.out.println(steak.price);
			System.out.println(steak.source.oilName);
			System.out.println(steak.source.spiceName);
			break;
		case 2:
			steak=st.makeSteak(2);
			System.out.println(steak.name);
			System.out.println(steak.price);
			System.out.println(steak.source.oilName);
			System.out.println(steak.source.spiceName);
			break;
		case 3:
			steak=st.makeSteak(3);
			System.out.println(steak.name);
			System.out.println(steak.price);
			System.out.println(steak.source.oilName);
			System.out.println(steak.source.spiceName);
			break;
		case 4:
			pa=pasta.makePasta(1);
			System.out.println(pa.name);
			System.out.println(pa.price);
			System.out.println(pa.source.oilName);
			System.out.println(pa.source.spiceName);
			break;
		case 5:
			pa=pasta.makePasta(2);
			System.out.println(pa.name);
			System.out.println(pa.price);
			System.out.println(pa.source.oilName);
			System.out.println(pa.source.spiceName);
			break;
		case 6:
			pa=pasta.makePasta(3);
			System.out.println(pa.name);
			System.out.println(pa.price);
			System.out.println(pa.source.oilName);
			System.out.println(pa.source.spiceName);
			break;
		default:
			break;
		}*/
		
	}
	

}
