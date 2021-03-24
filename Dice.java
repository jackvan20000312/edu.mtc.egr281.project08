package inClass;

public class Dice {
private Die d1;
private Die d2;

public Dice() {
	this(Die.DEFAULT_NUMBER_OF_SIDES);
	
}

public Dice(int newNumberOfSides) {
	d1 = new Die(newNumberOfSides);
	d2 = new Die(newNumberOfSides);
}

public int rol() {
	return d1.roll() + d2.roll();
}

public int getCurentValue() {
	return d1.getCurrentValue() + d2.getCurrentValue();
}

public boolean isDoubles() {
	return(d1.getCurrentValue() == d2.getCurrentValue());
}

}
