package project08;

//Notes
//Java program for Rock, Paper, Scissors Game
//can also play rock, paper scissors, lizard, spock
//Jacob Vaught
//Finished 10/20/2020
//Due 10/21/2020
//Submitted 4:45PM 10/21/2020

//Importing the Random package
import java.util.Random;


//Main Class of the program
public class Project08{

  //Function to generate the computer choice


  //Main Function of the program
  public static void main( String [] args ){
      int ties=0;
      int user1wins=0;
      int user2wins=0;
      Random random = new Random();
      String user1Choice="0";
      String user2Choice="0";
      String winnerMessage;
      String user1Name = Project08Engine.gameUserName1();
      String user2Name = Project08Engine.gameUserName2();
      String chooseGameType = Project08Engine.gameSpockOrNormal();

      //determines where the user1 and 2's input comes from, computer or human.
      do {
      if (chooseGameType.equals("1")) {
    	  if (user1Name.equals("Computer 1")&&user2Name.equals("Computer 2")) {
    		  user1Choice = Project08Engine.generateNormalComputer1Choice(random);
    		  user2Choice = Project08Engine.generateNormalComputer2Choice(random);
    	  }
    	  else if (user1Name.equals("Computer 1")) {
    		  user1Choice = Project08Engine.generateNormalComputer1Choice(random);
    		  user2Choice = Project08Engine.getUser2NormalGamePlayChoice();
    	  }
    	  else if (user2Name.equals("Computer 2")) {
    		  user2Choice = Project08Engine.generateNormalComputer2Choice(random);
    		  user1Choice = Project08Engine.getUser1NormalGamePlayChoice();
    	  }
    	  else {
    		  user2Choice = Project08Engine.getUser2NormalGamePlayChoice();
    		  user1Choice = Project08Engine.getUser1NormalGamePlayChoice();  
    	  }
      }
     
      else if (chooseGameType.equals("2")) {
    	  if (user1Name.equals("Computer 1")&&user2Name.equals("Computer 2")) {
    		  user1Choice = Project08Engine.generateSpockComputer1Choice(random);
    		  user2Choice = Project08Engine.generateSpockComputer2Choice(random);
    	  }
    	  else if (user1Name.equals("Computer 1")) {
    		  user1Choice = Project08Engine.generateSpockComputer1Choice(random);
    		  user2Choice = Project08Engine.getUser2SpockGamePlayChoice();
    	  }
    	  else if (user2Name.equals("Computer 2")) {
    		  user2Choice = Project08Engine.generateSpockComputer2Choice(random);
    		  user1Choice = Project08Engine.getUser1SpockGamePlayChoice();
    	  }
    	  else {
    		  user2Choice = Project08Engine.getUser2SpockGamePlayChoice();
    		  user1Choice = Project08Engine.getUser1SpockGamePlayChoice();
    		  
    	  }
      }
      
      winnerMessage = Project08Engine.a_Game_Engine(user1Name, user2Name, user2Choice, user1Choice);
      
      if (winnerMessage.contains(user1Name)) {
     	 ++user1wins; 
       }
       else if (winnerMessage.contains(user2Name)) {
     	  ++user2wins;
       }
       else {
     	  ++ties;
       }
      System.out.println();
      System.out.println( user1Name+ " chose : " + user1Choice + "\nAnd the " +user2Name+ " chose : " +user2Choice );
      System.out.println( winnerMessage );
      System.out.println();
      System.out.println("You have Tied "+ties+ " times!"
      				+ "\n"+user1Name+" has won "+user1wins+" times!"
      				+ "\n"+user2Name+" has won "+user2wins+" times!");
      // the program repeats itself until someone wins 5 times.
      }while(user2wins<5 && user1wins<5);

      
  }//closing bracket of main

} //closing bracket of class