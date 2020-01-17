package w1_l5_1_enum;

public class Main {

	public static void main(String[] args) {
		Duck[] ducks = 
			{new Duck(DuckType.MALLARD),
			 new Duck(DuckType.DECOY),
			 new Duck(DuckType.REDHEAD),
			 new Duck(DuckType.RUBBER) 
			};
		
		
		for(Duck d: ducks) {
			System.out.println(d.getType() + ":");
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}

	}

}
