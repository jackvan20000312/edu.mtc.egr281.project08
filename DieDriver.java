package inClass;

public class DieDriver {
	
	public static void main(String[] args) {
		
		Die d1 = new Die();
		for(int i =0; i<18; ++i) {
			System.out.println("Roll #"+i+ ": " +d1.roll());
		}
		Die d2 = new Die(4);
		for(int i =0; i<18; ++i) {
			System.out.println("Roll #"+i+ ": " +d2.roll());
		}
		
		
	}
}
