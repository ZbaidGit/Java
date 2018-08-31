package tamagochi;

public class Creature {

	private int hunger;
	private int energy;
	private int bored;
	private String name;
	
	Creature(){
		hunger = 100;
		energy = 100;
		bored = 0;
		name = " ";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public int getHunger() {
		return this.hunger;
	}
	
	public int getEnergy() {
		return this.energy;
	}
	
	public int getBored() {
		return this.bored;
	}

	public void decreaseHunger() {
		if (hunger > 0)
			hunger -= 10;
	}
	
	public void decreaseEnergy() {
		if (energy > 0)
			energy -= 10;
	}
	
	public void decreaseBored() {
		if (bored > 0)
			bored -= 10;
	}
	
	public void increaseHunger() {
		if (hunger < 100)
			hunger += 10;
	}
	
	public void increaseEnergy() {
		if (energy < 100)
			energy += 10;
	}
	
	public void increaseBored() {
		if (bored < 100)
			bored += 10;
	}

}
