
public class Bat extends ZooKeeper2{
	public Bat() {
		setEnergyLevel(300);
		}
	public void fly() {
		setEnergyLevel(getEnergyLevel() -50);
		System.out.println("*flap flap flap* The bat begins to fly");
	}
	
	public void eatHumans(){
		setEnergyLevel(getEnergyLevel() + 25);
		System.out.println("*chomp chomp chomp* another worthless human has been destroyed, the earth is grateful.");
	}
	
	public void attackTown() {
		setEnergyLevel(getEnergyLevel() - 100);
		System.out.println("*crush* *SMASH*  Oh no! another city has been destroyed!!");
	}
	

}


//public void ThrowSomething() {
//	setEnergyLevel(getEnergyLevel() - 5);
//	System.out.println("The Gorilla threw something at you!");