package com.sh.s2;

public class Shef_source {

	public Food_Source makeSource(int select) {
		
		Food_Source source = new Food_Source();
		switch (select) {
		case 1:
			source.oilName="Olive";
			source.spiceName="Hub";
					break;
		case 2:
			source.oilName="Milk";
			source.spiceName="cheese";
			break;
		default:
			break;
		}

		/*Food_Source source=new Food_Source();
		source.oilName="Olive";
		source.spiceName="Hub";*/

		//oilName="Milk"
		//spiceName="Cheese"

		return source;
	}

}
