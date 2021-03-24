package project08;

import java.util.Random;

public class GenerateComputerChoice {
	public static String a_Game_Engine( String user1, String user2, String user2Choice, String user1Choice ){

		  //set winner string to "No winner" default
	      String winner = "No Winer";
	      String customMessage = "Both chse same";
	      String finalMessage = "";

	      String rvsCustomMessage = "Rock Crushess Scissors";
	      String svpCustomMessage = "Scissors cuts paper";
	      String pvrCustomMessage = "Paper wraps rock";
	      String rvlCustomMessage = "Rock crushes Lizard";
	      String lvsCustomMessage = "Lizard poisons Spock";
	      String svsCustomMessage = "Spock smashes Scissors";      
	      String svlCustomMessage = "Scissors decapitates Lizard";
	      String lvpCustomMessage = "Lizard eats Paper";
	      String pvsCustomMessage = "Paper disproves Spock";
	      String svrCustomMessage = "Spock vaporizes Rock";
	      int ties=0;
	      int user1wins=0;
	      int user2wins=0;

	      //Winner Logic for the game start

	      //Rock vs Scissors
	      if( user1Choice.equalsIgnoreCase( "Rock" ) && user2Choice.equalsIgnoreCase( "scissors" )  ){
	          winner = user1;
	          customMessage = rvsCustomMessage;
	      }else if( user2Choice.equalsIgnoreCase( "rock" ) && user1Choice.equalsIgnoreCase( "Scissors" ) ){
	          winner = user2;
	          customMessage = rvsCustomMessage;
	      }
	     //scissors vs paper
	      if( user1Choice.equalsIgnoreCase( "Scissors" ) && user2Choice.equalsIgnoreCase( "paper" )  ){
	          winner = user1;
	          customMessage = svpCustomMessage;
	      }else if( user2Choice.equalsIgnoreCase( "scissors" ) && user1Choice.equalsIgnoreCase( "Paper" )  ){
	          winner = user2;
	          customMessage = svpCustomMessage;
	      }
	      //paper vs rock
	      if( user1Choice.equalsIgnoreCase( "Paper" ) && user2Choice.equalsIgnoreCase( "rock" ) ){
	          winner = user1;
	          customMessage = pvrCustomMessage;
	      }else if( user2Choice.equalsIgnoreCase( "paper" ) && user1Choice.equalsIgnoreCase( "Rock" ) ){
	          winner = user2;
	          customMessage = pvrCustomMessage;
	      }
	      //Rock vs Lizards
	      if( user1Choice.equalsIgnoreCase( "Rock" ) && user2Choice.equalsIgnoreCase( "Lizard" )  ){
	          winner = user1;
	          customMessage = rvlCustomMessage;
	      }else if( user2Choice.equalsIgnoreCase( "rock" ) && user1Choice.equalsIgnoreCase( "lizard" ) ){
	          winner = user2;
	          customMessage = rvlCustomMessage;
	      }
	     //lizards vs spock
	      if( user1Choice.equalsIgnoreCase( "lizard" ) && user2Choice.equalsIgnoreCase( "spock" )  ){
	          winner = user1;
	          customMessage = lvsCustomMessage;
	      }else if( user2Choice.equalsIgnoreCase( "lizard" ) && user1Choice.equalsIgnoreCase( "spock" )  ){
	          winner = user2;
	          customMessage = lvsCustomMessage;
	      }
	      //spock vs scissors
	      if( user1Choice.equalsIgnoreCase( "spock" ) && user2Choice.equalsIgnoreCase( "scissors" ) ){
	          winner = user1;
	          customMessage = svsCustomMessage;
	      }else if( user2Choice.equalsIgnoreCase( "spock" ) && user1Choice.equalsIgnoreCase( "scissors" ) ){
	          winner = user2;
	          customMessage = svsCustomMessage;
	      }
	      //scissors vs lizards
	      if( user1Choice.equalsIgnoreCase( "scissors" ) && user2Choice.equalsIgnoreCase( "lizard" )  ){
	          winner = user1;
	          customMessage = svlCustomMessage;
	      }else if( user2Choice.equalsIgnoreCase( "scissors" ) && user1Choice.equalsIgnoreCase( "lizard" ) ){
	          winner = user2;
	          customMessage = svlCustomMessage;
	      }
	     //lizard vs paper
	      if( user1Choice.equalsIgnoreCase( "lizard" ) && user2Choice.equalsIgnoreCase( "paper" )  ){
	          winner = user1;
	          customMessage = lvpCustomMessage;
	      }else if( user2Choice.equalsIgnoreCase( "lizard" ) && user1Choice.equalsIgnoreCase( "Paper" )  ){
	          winner = user2;
	          customMessage = lvpCustomMessage;
	      }
	      //paper vs spock
	      if( user1Choice.equalsIgnoreCase( "Paper" ) && user2Choice.equalsIgnoreCase( "spock" ) ){
	          winner = user1;
	          customMessage = pvsCustomMessage;
	      }else if( user2Choice.equalsIgnoreCase( "paper" ) && user1Choice.equalsIgnoreCase( "spock" ) ){
	          winner = user2;
	          customMessage = pvsCustomMessage;
	      }
	      //spock vs rock
	      if( user1Choice.equalsIgnoreCase( "spock" ) && user2Choice.equalsIgnoreCase( "rock" )  ){
	          winner = user1;
	          customMessage = svrCustomMessage;
	      }else if( user2Choice.equalsIgnoreCase( "spock" ) && user1Choice.equalsIgnoreCase( "rock" ) ){
	          winner = user2;
	          customMessage = svrCustomMessage;
	      }


	    	  finalMessage = winner + " won ( " + customMessage + " )";
	      //Winner Logic for the game ends
	      if(winner == user1) {
	          ++user1wins;
		      }
		      else if(winner == user2) {
		      ++user2wins;  
		      }
		      else {
		    	  ++ties;	  
		      }

	      //Returning the final message
	      return finalMessage;

	  }

	  
	  
}
