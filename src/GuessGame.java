package src;

public class GuessGame 
{
	Player p1;  //calling the public class "Player" and assigning a variable for each player
	Player p2;
	Player p3;


	public void startgame()
	{
		p1 = new Player(); //creates objects for the 3 players and assigns them the 3 instance variables
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int)(Math.random() * 10 + 1);
		System.out.println("Guess a number between 1 - 10");
		
		while(true)
		{
			//System.out.println("Number to guess is " + targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;
			System.out.println("Player one guessed the number " + guessp1);
			
			guessp2 = p2.number;
			System.out.println("Player two guessed the number " + guessp2);
			
			guessp3 = p3.number;
			System.out.println("Player three guessed the number " + guessp3);
			
			if (guessp1 == targetNumber)
			{
				p1isRight = true;
			}
			
			if (guessp2 == targetNumber)
			{
				p2isRight = true;
			}
			
			if (guessp3 == targetNumber)
			{
				p3isRight = true;
			}
			
			if (p1isRight || p2isRight || p3isRight)
			{
				System.out.println("We have a winner");
				System.out.println("Did player one get it right? " + p1isRight);
				System.out.println("Did player two get it right? " + p2isRight);
				System.out.println("Did player three get it right? " + p3isRight);
				System.out.println("Gameover.");
				break;
			}
			
			else
			{
				System.out.println("Players will have to try again.");
			}
		}
		
	}
}	