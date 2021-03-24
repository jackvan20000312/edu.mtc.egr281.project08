package inClass;

public class DiceDriver {
	public static void main(String[] args) {
		
		Dice d = new Dice();
		for(int i = 0; i<24; ++i) {
			System.out.print("Roll #" + (i+1) + ": " + d.rol());
		if(d.isDoubles()) {
			System.out.print("--DOUBLES!!");
		}
		System.out.println();
		}
		
		
		
	}
}
