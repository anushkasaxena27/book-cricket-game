
import java.io.*;
import java.util.Random;
import java.util.Scanner;

import com.aurionpro.model.Player;

public class BookCricketTest {
	public static final int bookPages = 300;
	public static int  turnCounter;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		String player1Name = new String();
		String player2Name = new String();
		System.out.println("Welcome to Book Cricket Game");
		System.out.println("Rules for the Game:\r\n" + 
				"1. Assume a book of 300 pages\r\n" + 
				"2. Player 1 opens the book to read a page number (Randomly generated)\r\n" + 
				"3. Total score of a player = page number % 7 (number % 7 will always be between 0 - 6)\r\n" + 
				"4. Player 1 continues and keeps adding to the score untill page number results in a 0 score\r\n" + 
				"5. Player 2 starts the game and tries to beat the score of player 1\r\n" + 
				"6. In case of a tie, check the number of turns(player with lesser turns is winner)\r\n" + 
				"7. Show the winner of the game.");
		int ch = -1;
		while (ch!=0) {
			System.out.println("Enter 1 to start and 0 to exit");
			ch = sc.nextInt(); 
			Player player1 = new Player();
			Player player2 = new Player();
			System.out.println("Enter Player 1 Name : ");
			player1Name = br.readLine();
			player1.setPlayerName(player1Name);
			System.out.println("Enter Player 2 Name : ");
			player2Name = br.readLine();
			player2.setPlayerName(player2Name) ;
			int choice =1;
			System.out.println("Player : "+ player1.getPlayerName() );
			while (choice==1) {
				choice = player1.playGame();
			}
			System.out.println(player2.getPlayerName() +" Needs "+player1.getScore()+" Score In "+player1.getTurnCounter()+" rounds To WIN MATCH");
			System.out.println("Player : "+ player2.getPlayerName());
			choice =1;
			while (choice ==1 && player2.getScore()<=player1.getScore()+1) {
			int point = player2.playGame();
			if (point == 0)
				break;
			}
			if (player1.getScore()>player2.getScore())
				System.out.println(player1.getPlayerName()+" WIN MATCH !!");
			else if (player1.getScore()==player2.getScore())
			{
				if(player1.getTurnCounter()>player2.getTurnCounter())
					System.out.println(player1.getPlayerName()+" WIN MATCH !!");
				else
					System.out.println(player2.getPlayerName()+" WIN MATCH !!");
			}
			else 
				System.out.println(player2.getPlayerName()+" WIN MATCH !!");
			
			
		}
		
		
	}

	/*
	 * public static int playGame(String playerName) { Scanner sc = new Scanner
	 * (System.in); Random random = new Random();
	 * System.out.println("Player : "+playerName ); int ch =1; turnCounter =1; int
	 * score =0; while(ch==1) { System.out.print("Enter 1 to Open Book : "); ch =
	 * sc.nextInt(); int page = random.nextInt(bookPages) + 1; int point = page% 7;
	 * if (point == 0) { System.out.println("!!!        OOPS          !!!");
	 * System.out.println(playerName+" Total Score : "+score);
	 * System.out.println(playerName+" Takes "+turnCounter+" Rounds."); return 0; }
	 * else { score +=point; turnCounter+=1;
	 * System.out.println("Page Number "+page+"\tPoint : "+point+"\tScore : "+score)
	 * ; }
	 * 
	 * 
	 * } return score; }
	 */
	}

	