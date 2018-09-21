package src;

import java.util.Scanner;


public class Player extends GuessGame
{
	static Scanner kboard = new Scanner (System.in);
	int number = 0; 
	
	public void guess()
	{
		//System.out.println("Please enter your guess: ");
		number = kboard.nextInt();
 	}
	
}
