package project08;

import java.util.Random;

import javax.swing.JOptionPane;

public class Project08Engine {
	 public static String generateNormalComputer1Choice( Random  random){

	      int wordNumber;
	      //Choosing a random number using the inbuilt function
	      wordNumber = random.nextInt( 3 ) + 1;
	      String user1Choice = "";

	      //Getting computer choice on the random number
	      if( wordNumber == 1 ){
	          user1Choice = "Rock";
	      }else if( wordNumber == 2 ){
	    	  user1Choice = "Paper";
	      }else if( wordNumber == 3 ){
	    	  user1Choice = "Scissors";
	      }

	      
	      System.out.println( "\nThe Computer has made it's choice" );
	      return user1Choice;
	  }
	  public static String generateNormalComputer2Choice( Random  random){

	      int wordNumber;
	      //Choosing a random number using the inbuilt function
	      wordNumber = random.nextInt( 3 ) + 1;
	      String user2Choice = "";

	      //Getting computer choice on the random number
	      if( wordNumber == 1 ){
	          user2Choice = "Rock";
	      }else if( wordNumber == 2 ){
	    	  user2Choice = "Paper";
	      }else if( wordNumber == 3 ){
	    	  user2Choice = "Scissors";
	      }

	      
	      System.out.println( "\nThe Computer has made it's choice" );
	      return user2Choice;
	  }  
	  public static String generateSpockComputer1Choice( Random  random){

	      int wordNumber;
	      //Choosing a random number using the inbuilt function
	      wordNumber = random.nextInt( 5 ) + 1;
	      String user1Choice = "";

	      //Getting computer choice on the random number
	      if( wordNumber == 1 ){
	          user1Choice = "Rock";
	      }else if( wordNumber == 2 ){
	    	  user1Choice = "Paper";
	      }else if( wordNumber == 3 ){
	    	  user1Choice = "Scissors";
	      }else if( wordNumber == 4 ){
	    	  user1Choice = "Lizard";
	      }else if( wordNumber == 5 ){
	    	  user1Choice = "Spock";
	      }
	      
	      
	      System.out.println( "\nComputer 1 has made it's choice" );
	      return user1Choice;
	  }
	  public static String generateSpockComputer2Choice( Random  random){

	      int wordNumber;
	      //Choosing a random number using the inbuilt function
	      wordNumber = random.nextInt( 5 ) + 1;
	      String user2Choice = "";

	      //Getting computer choice on the random number
	      if( wordNumber == 1 ){
	          user2Choice = "Rock";
	      }else if( wordNumber == 2 ){
	    	  user2Choice = "Paper";
	      }else if( wordNumber == 3 ){
	    	  user2Choice = "Scissors";
	      }else if( wordNumber == 4 ){
	    	  user2Choice = "Lizard";
	      }else if( wordNumber == 5 ){
	    	  user2Choice = "Spock";
	      }
	      
	      
	      System.out.println( "\nComputer 2 has made it's choice" );
	      return user2Choice;

	  }
	 
	  //User Choice
	  public static String getUser1NormalGamePlayChoice(){

	  String user1Choice = JOptionPane.showInputDialog("Options to choose from :\n1.Rock\n2.Paper\n3.Scissors");
	  //Returning the user choice
	  if( user1Choice.equalsIgnoreCase("1")) {
	    user1Choice = "Rock";
	  }
	   
	  else if( user1Choice.equalsIgnoreCase("2")) {
	    user1Choice = "Paper";
	  }
	      
	  else if( user1Choice.equalsIgnoreCase("3")) {
	    user1Choice = "Scissors";
	  }
	      
	  return user1Choice;

	  }
	  public static String getUser2NormalGamePlayChoice(){

		  String user2Choice = JOptionPane.showInputDialog("Options to choose from :\n1.Rock\n2.Paper\n3.Scissors");
		  //Returning the user choice
		  if( user2Choice.equalsIgnoreCase("1")) {
		    user2Choice = "Rock";
		  }
		   
		  else if( user2Choice.equalsIgnoreCase("2")) {
		    user2Choice = "Paper";
		  }
		      
		  else if( user2Choice.equalsIgnoreCase("3")) {
		    user2Choice = "Scissors";
		  }
		      
		  return user2Choice;

		  } 
	  public static String getUser1SpockGamePlayChoice(){
	String user1Choice="loster";
	  String user1aChoice = JOptionPane.showInputDialog("Options to choose from :\n1.Rock\n2.Paper\n3.Scissors\n4.Lizard\n5.Spock");
	  //Returning the user choice
	  if( user1aChoice.equalsIgnoreCase("1")) {
	    user1Choice = "Rock";
	  }else if( user1aChoice.equalsIgnoreCase("2")) {
	    user1Choice = "Paper";
	  }else if( user1aChoice.equalsIgnoreCase("3")) {
	    user1Choice = "Scissors";
	  }else if( user1aChoice.equalsIgnoreCase("4")) {
		user1Choice = "Lizard";
	  }else if( user1aChoice.equalsIgnoreCase("5")) {
		user1Choice = "Spock";
	  }
	      
	  return user1Choice;

	  }
	  public static String getUser2SpockGamePlayChoice(){
	String user2Choice="lost";
		  String user2aChoice = JOptionPane.showInputDialog("Options to choose from :\n1.Rock\n2.Paper\n3.Scissors\n4.Lizard\n5.Spock");
		  //Returning the user choice
		  if( user2aChoice.equalsIgnoreCase("1")) {
		    user2Choice = "Rock";
		  }else if( user2aChoice.equalsIgnoreCase("2")) {
		    user2Choice = "Paper";
		  }else if( user2aChoice.equalsIgnoreCase("3")) {
		    user2Choice = "Scissors";
		  }else if( user2aChoice.equalsIgnoreCase("4")) {
			user2Choice = "Lizard";
		  }else if( user2aChoice.equalsIgnoreCase("5")) {
			user2Choice = "Spock";
		  }
		      
		  return user2Choice;
	  }

	  //function to get the User's Name
	  public static String getUser1Name() {
	  String userName1 = JOptionPane.showInputDialog("Enter Your Name:");
	  System.out.println(userName1);
	  //Returning the user choice
	  return userName1;
	  }
	  public static String getUser2Name() {
	  String userName2 = JOptionPane.showInputDialog("Enter Your Name:");
	  System.out.println(userName2);
	  //Returning the user choice
	  return userName2;
	  }
	  //Get Computer's Name
	  public static String getComputer1Name() {
		  String userName1 = "Computer 1";
		  //Returning the user choice
		  return userName1;
		  }
	  public static String getComputer2Name() {
		  String userName2 = "Computer 2";
		  //Returning the user choice
		  return userName2;
	  	  }
	  //decides whether the name should be computer or user's name
	  public static String gameUserName1(){
		 
		  //Get User names

		  String gameStartChoice= JOptionPane.showInputDialog("Player 1 is a (Use Numbers):\n1.Human\n2.Computer");
		  String fINALName1;
		  
		  int gameStartNum = Integer.parseInt(gameStartChoice);
		  switch (gameStartNum) {
		  case 1:
			  fINALName1=getUser1Name();
			  System.out.println("The First User is " +fINALName1);
			  break;
		  case 2:
			  fINALName1=getComputer1Name();
			  System.out.println("The First User is " +fINALName1);
			  break;
		  default:
			  System.out.println("Unknown ERROR");
			  fINALName1="UNKNOWN ERROR";
			  break;
		  }
	      //Returning the user choice
	      return fINALName1;
	  }
	  public static String gameUserName2(){
			 
		  //Get User names
		  String gameStartChoice1 = JOptionPane.showInputDialog("Player 2 is a (Use Numbers):\n1.Human\n2.Computer");
		  String fINALName2;
		  
		  int gameStartNum1 = Integer.parseInt(gameStartChoice1);
		  switch (gameStartNum1) {
		  case 1:
			  fINALName2=getUser2Name();
			  System.out.println("The Second User is " +fINALName2);
			  break;
		  case 2:
			  fINALName2=getComputer2Name();
			  System.out.println("The Second User is " +fINALName2);
			  break;
		  default:
			  System.out.println("Unknown ERROR");
			  fINALName2="UNKNOWN ERROR";
			  break;
		  }
	      //Returning the user choice
	      return fINALName2;
	  }  
	 //asks what kind of game you would like to play
	 public static String gameSpockOrNormal(){
		     String userStartMenuChoice;
			  userStartMenuChoice = JOptionPane.showInputDialog("Do you want to play (Use Numbers):\n1.Normal Rock, Paper, Scissors?\n2.Rock, Paper, Scissor, Lizard, Spock");
			  //Returning the user choice
		      return userStartMenuChoice;
		  }

	  //The Game Engine. 
	  public static String a_Game_Engine(  String user1, String user2, String user2Choice, String user1Choice ){
		  

		  //set winner string to "No winner" default
		  String winner = "No Winner";
	      String customMessage = "Both Choose Same";
	      String finalMessage = " ";
	//custom messages.
	      String rock_vs_scissorCustomMessage = "Rock Crushess Scissors";
	      String scissor_vs_paperCustomMessage = "Scissors cuts paper";
	      String paper_vs_rockCustomMessage = "Paper wraps rock";
	      String rock_vs_lizardCustomMessage = "Rock crushes Lizard";
	      String lizard_vs_spockCustomMessage = "Lizard poisons Spock";
	      String spock_vs_scissorsCustomMessage = "Spock smashes Scissors";      
	      String scissor_vs_lizardCustomMessage = "Scissors decapitates Lizard";
	      String lizard_vs_paperCustomMessage = "Lizard eats Paper";
	      String paper_vs_spockCustomMessage = "Paper disproves Spock";
	      String spock_vs_rockCustomMessage = "Spock vaporizes Rock";


	      //Winner Logic for the game
	      //Rock vs Scissors
	      if( user1Choice.equalsIgnoreCase( "Rock" ) && user2Choice.equalsIgnoreCase( "scissors" )  ){
	          winner = user1;
	          customMessage = rock_vs_scissorCustomMessage;
	      }
	      else if( user2Choice.equalsIgnoreCase( "rock" ) && user1Choice.equalsIgnoreCase( "Scissors" ) ){
	          winner = user2;
	          customMessage = rock_vs_scissorCustomMessage;
	      }
	     //scissors vs paper
	      if( user1Choice.equalsIgnoreCase( "Scissors" ) && user2Choice.equalsIgnoreCase( "paper" )  ){
	          winner = user1;
	          customMessage = scissor_vs_paperCustomMessage;
	      }
	      else if( user2Choice.equalsIgnoreCase( "scissors" ) && user1Choice.equalsIgnoreCase( "Paper" )  ){
	          winner = user2;
	          customMessage = scissor_vs_paperCustomMessage;
	      }
	      //paper vs rock
	      if( user1Choice.equalsIgnoreCase( "Paper" ) && user2Choice.equalsIgnoreCase( "rock" ) ){
	          winner = user1;
	          customMessage = paper_vs_rockCustomMessage;
	      }
	      else if( user2Choice.equalsIgnoreCase( "paper" ) && user1Choice.equalsIgnoreCase( "Rock" ) ){
	          winner = user2;
	          customMessage = paper_vs_rockCustomMessage;
	      }
	    //Rock vs Lizards
	      if( user1Choice.equalsIgnoreCase( "Rock" ) && user2Choice.equalsIgnoreCase( "Lizard" )  ){
	          winner = user1;
	          customMessage = rock_vs_lizardCustomMessage;
	      }else if( user2Choice.equalsIgnoreCase( "rock" ) && user1Choice.equalsIgnoreCase( "lizard" ) ){
	          winner = user2;
	          customMessage = rock_vs_lizardCustomMessage;
	      }
	     //lizards vs spock
	      if( user1Choice.equalsIgnoreCase( "lizard" ) && user2Choice.equalsIgnoreCase( "spock" )  ){
	          winner = user1;
	          customMessage = lizard_vs_spockCustomMessage;
	      }else if( user2Choice.equalsIgnoreCase( "lizard" ) && user1Choice.equalsIgnoreCase( "spock" )  ){
	          winner = user2;
	          customMessage = lizard_vs_spockCustomMessage;
	      }
	      //spock vs scissors
	      if( user1Choice.equalsIgnoreCase( "spock" ) && user2Choice.equalsIgnoreCase( "scissors" ) ){
	          winner = user1;
	          customMessage = spock_vs_scissorsCustomMessage;
	      }else if( user2Choice.equalsIgnoreCase( "spock" ) && user1Choice.equalsIgnoreCase( "scissors" ) ){
	          winner = user2;
	          customMessage = spock_vs_scissorsCustomMessage;
	      }
	      //scissors vs lizards
	      if( user1Choice.equalsIgnoreCase( "scissors" ) && user2Choice.equalsIgnoreCase( "lizard" )  ){
	          winner = user1;
	          customMessage = scissor_vs_lizardCustomMessage;
	      }else if( user2Choice.equalsIgnoreCase( "scissors" ) && user1Choice.equalsIgnoreCase( "lizard" ) ){
	          winner = user2;
	          customMessage = scissor_vs_lizardCustomMessage;
	      }
	     //lizard vs paper
	      if( user1Choice.equalsIgnoreCase( "lizard" ) && user2Choice.equalsIgnoreCase( "paper" )  ){
	          winner = user1;
	          customMessage = lizard_vs_paperCustomMessage;
	      }else if( user2Choice.equalsIgnoreCase( "lizard" ) && user1Choice.equalsIgnoreCase( "Paper" )  ){
	          winner = user2;
	          customMessage = lizard_vs_paperCustomMessage;
	      }
	      //paper vs spock
	      if( user1Choice.equalsIgnoreCase( "Paper" ) && user2Choice.equalsIgnoreCase( "spock" ) ){
	          winner = user1;
	          customMessage = paper_vs_spockCustomMessage;
	      }else if( user2Choice.equalsIgnoreCase( "paper" ) && user1Choice.equalsIgnoreCase( "spock" ) ){
	          winner = user2;
	          customMessage = paper_vs_spockCustomMessage;
	      }
	      //spock vs rock
	      if( user1Choice.equalsIgnoreCase( "spock" ) && user2Choice.equalsIgnoreCase( "rock" )  ){
	          winner = user1;
	          customMessage = spock_vs_rockCustomMessage;
	      }else if( user2Choice.equalsIgnoreCase( "spock" ) && user1Choice.equalsIgnoreCase( "rock" ) ){
	          winner = user2;
	          customMessage = spock_vs_rockCustomMessage;
	      }
	      //Winner Logic for the game ends
	finalMessage = winner + " won ( " + customMessage + " )";
	//Returning the final message
	return finalMessage;
	  }
	  
}
