
public class Gorilla extends Mammal {
	public void ThrowSomething() {
		setEnergyLevel(getEnergyLevel() - 5);
		System.out.println("The Gorilla threw something at you!");
	}
	public void eatBananas() {
		setEnergyLevel(getEnergyLevel() + 10);
		System.out.println("Gorilla ate a banana");
		
	}
	public void climb() {
		setEnergyLevel(getEnergyLevel() - 10);
		System.out.println("The gorilla climed a tree!");
	}
	
}
