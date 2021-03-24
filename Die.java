package inClass;

import java.util.Random;

public class Die {
private int currentValue;
private int numberOfSides;
private Random randomizer;

public static final int DEFAULT_NUMBER_OF_SIDES = 6;

public Die() {
	this(Die.DEFAULT_NUMBER_OF_SIDES);
}
public Die(int newNumberOfSides) {
	this.setCurrentValue(0);
	this.setNumberofSide(newNumberOfSides);
	this.randomizer = new Random();
}

public int getCurrentValue() {
	return this.currentValue;
	
	//end bracket of method getcurrentvalue
}

private void setCurrentValue(int newCurrentValue) {
	this.currentValue = newCurrentValue;
	
}

public int getNumberOfSides() {
	return this.numberOfSides;
	
}

private void setNumberofSide(int newNumberOfSides) {
	this.numberOfSides = newNumberOfSides;
	
}

public int roll() {
	this.setCurrentValue(randomizer.nextInt(this.getNumberOfSides()) + 1);
	return this.getCurrentValue();
	
}


//ending bracket of Class Die
}
