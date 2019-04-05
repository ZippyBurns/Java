
public class BatTest {
	public static void main(String[] args) {
		Bat terrorBat = new Bat();
		System.out.println(terrorBat.getEnergyLevel());
		terrorBat.fly();
		terrorBat.attackTown();
		terrorBat.eatHumans();
		terrorBat.eatHumans();
		terrorBat.fly();
		terrorBat.attackTown();
		terrorBat.attackTown();
		System.out.println(terrorBat.getEnergyLevel());
		
	}
}

//attack three towns, eat two humans, and fly twice