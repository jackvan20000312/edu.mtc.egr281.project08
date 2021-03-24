package project08;

import java.util.Random;

import javax.swing.JOptionPane;

public class Project08a {
	
	public static void game_HvC(){

		Random random = new Random();
		
		//variables
		//how many wins has the computer had
		int computer1Wins=0;
		//how many wins has the human had
		int user1Wins=0;
		// how many ties
		int ties=0;
		//how many wins has the computer had
		int user1Loses=0;
		//how many wins has the computer had
		int computer1Loses=0;
		//computer's choice, for playing game
		int computer1_choice_Number;
	    //who's the winner
		String winner  ;
	    //custom message, to eventually be replaced by rock, paper, or scissors custom message.
		String customMessage ;
	    //Final Message, Letting you know who won.
		String finalMessage = "";
	   
		String rockCustomMessage = "The rock smashes the scissor";
	    String scissorsCustomMessage = "Scissors cuts paper"; 
	    String paperCustomMessage = "Paper wraps rock";
	   
	    //translation of computer1_choice_Number into plain English
	    String computerChoice = "";
	    //the user's choice, whether it be paper, rock , or scissors.
	    String userWordChoice;
	    //Name of user
	    String userName1 = JOptionPane.showInputDialog("Enter Your name:");
			do {
			
	      //Choosing a random number using the inbuilt function
	      computer1_choice_Number = random.nextInt( 3 ) + 1;


	      //Getting computer translation on the random number it chose
	      // if random number=1, output rock
	      if( computer1_choice_Number == 1 ){
	          computerChoice = "Rock";
	      }
	   // if random number=2, output paper
	      else if( computer1_choice_Number == 2 ){
	          computerChoice = "Paper";
	      }
	   // if random number=3, output scissors
	      else if( computer1_choice_Number == 3 ){
	          computerChoice = "Scissors";
	      }
	      
	      //let's user know that computer has made it's decision
	      System.out.println();
	      System.out.println( "The Computer has made it's choice" );
	   
	      
	      //User1 chooses their option.
	      userWordChoice = JOptionPane.showInputDialog("Options to choose from :\n1.Rock\n2.Paper\n3.Scissors");;
	     
	      //adds the ability to enter a number between 1-3 instead of entering in a full word.
	      if( userWordChoice.equalsIgnoreCase("1")) {
	    	  userWordChoice = "Rock";
	      }
	      else if( userWordChoice.equalsIgnoreCase("2")) {
	    	  userWordChoice = "Paper";
	      }
	      
	      else if( userWordChoice.equalsIgnoreCase("3")) {
	    	  userWordChoice = "Scissors";
	      }

	      //Determines who won the game and sends the answer to a string
	      //3 is Scissors
	      if( computerChoice.equals( "Rock" ) && userWordChoice.equalsIgnoreCase( "scissors" )  ){
	          winner = "Computer";
	          customMessage = rockCustomMessage;
	          }
	      
	      //1 is Rock
	      else if( userWordChoice.equalsIgnoreCase( "rock" ) && computerChoice.equals( "Scissors" ) ){
	          winner = userName1;
	          customMessage = rockCustomMessage;
	      }

	      //2 is paper
	      else if( computerChoice.equals( "Scissors" ) && userWordChoice.equalsIgnoreCase( "paper" )  ){
	          winner = "Computer";
	          customMessage = scissorsCustomMessage;
	      }
	      else if( userWordChoice.equalsIgnoreCase( "scissors" ) && computerChoice.equals( "Paper" )  ){
	          winner = userName1;
	          customMessage = scissorsCustomMessage;
	      }
	      else if( computerChoice.equals( "Paper" ) && userWordChoice.equalsIgnoreCase( "rock" ) ){
	          winner = "Computer";
	          customMessage = paperCustomMessage;
	      }
	      else if( userWordChoice.equalsIgnoreCase( "paper" ) && computerChoice.equals( "Rock" ) ){
	          winner = userName1;
	          customMessage = paperCustomMessage;
	      }
	      else if( userWordChoice.equalsIgnoreCase( "paper" ) && computerChoice.equals( "Paper" )  ){
	    	  System.out.println("Did you enter one of the options listed above?\nTry Again.");
		    	winner="No One";
		    	customMessage="There was a Problem";
		    	
	      }
	      else if( computerChoice.equals( "Rock" ) && userWordChoice.equalsIgnoreCase( "rock" ) ){
	    	  System.out.println("Did you enter one of the options listed above?\nTry Again.");
		    	winner="No One";
		    	customMessage="There was a Problem";
	      }
	      else if( userWordChoice.equalsIgnoreCase( "scissors" ) && computerChoice.equals( "Scissors" ) ){
	    	  System.out.println("Did you enter one of the options listed above?\nTry Again.");
		    	winner="No One";
		    	customMessage="There was a Problem";
	      }
	      else {
	    	winner="No One";
	    	customMessage="It Was A Tie.";
	      }
	     
	      	      
	      //Determines who is the winner and adds to the sum.
	      if(winner == userName1) {
          ++user1Wins;
          ++computer1Loses;
	      }
	      else if(winner == "Computer") {
	      ++user1Loses;
	      ++computer1Wins;  
	      }
	      else {
	    	  ++ties;	  
	      }
	      
	      //The Messages the user sees after each match
	      finalMessage = winner + " won ( " + customMessage + " )";
	      System.out.println( "\nYou chose : " + userWordChoice + "\nAnd the Computer chose : " +computerChoice );
	      System.out.println(finalMessage);
	      	
	      	
			}
			//determines how many times someone has to win. until the game ends.
			while(user1Wins < 5 && computer1Wins < 5);
			
			//The Messages the user sees after the game ends
			  System.out.println();
			  System.out.println();
		      System.out.println("Computer has won " +computer1Wins+ " and lost " +computer1Loses+ " games and " +userName1+ " has won " +user1Wins+ " and has lost " +user1Loses+ " games" );
		     
		      if (ties>0)
		      {
		    	  System.out.println("You have tied " +ties+ " times.");
		      }
		      
		      else {
		    	  System.out.println();
		      }		
	
	}
	
	public static void main( String [] args ) {
		
	
		game_HvC();

		
	}
}
