
public class ZooKeeper2 {
	private int energyLevel;
	
	//energy getter
	public int getEnergyLevel() {
		return energyLevel;
	}
	
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	public void bat() {
		this.setEnergyLevel(300);
	}

}
