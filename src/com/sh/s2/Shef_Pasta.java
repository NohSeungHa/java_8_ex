package com.sh.s2;

public class Shef_Pasta {
	
	//메서드명은 makePasta
	//1.크림파스타, 15000 2번소스
	//2.로제파스타, 20000 1번소스
	//3.알리오올리오 파스타 30000 1번소스
	public Food_pasta makePasta(int select) {
		Food_pasta pasta=new Food_pasta();
		Shef_source s=new Shef_source();
		switch (select) {
		case 1:
			pasta.name="크림파스타";
			pasta.price=15000;
			pasta.source=s.makeSource(2);
			break;
		case 2:
			pasta.name="로제파스타";
			pasta.price=20000;
			pasta.source=s.makeSource(1);
			break;
		case 3:
			pasta.name="알리오올리오파스타";
			pasta.price=30000;
			pasta.source=s.makeSource(1);
			break;

		default:
			break;
		}
		return pasta;
	}
	

}
