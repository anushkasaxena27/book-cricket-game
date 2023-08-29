package com.aurionpro.model;

import java.util.Random;
import java.util.Scanner;

public class Player {

		private static final int bookPages = 300;
		private String playerName;
		private int turnCounter;
		private int score;
		
		public Player() {
			playerName = "";
			turnCounter = 1;
			score =0;
		}

		public String getPlayerName() {
			return playerName;
		}

		public void setPlayerName(String playerName) {
			this.playerName = playerName;
		}

		public int getTurnCounter() {
			return turnCounter;
		}

		public void setTurnCounter(int turnCounter) {
			this.turnCounter = turnCounter;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}
		public int  playGame() {
				Scanner sc = new Scanner (System.in);
				Random random = new Random();
				System.out.print("Enter 1 to Open Book : ");
				int ch = sc.nextInt();
				if(ch==1) {
				 int page = random.nextInt(bookPages) + 1;
				int point =  page% 7;
				if (point == 0) {
					System.out.println("!!!        OOPS          !!!");
					System.out.println("Page Number "+page+"\tPoint : "+point+"\tScore : "+score);
					System.out.println(playerName+" Total Score : "+score);
					System.out.println(playerName+" Takes "+turnCounter+" Rounds.");
					return 0;
				}
				else {
				score +=point;
				turnCounter+=1;
				System.out.println("Page Number "+page+"\tPoint : "+point+"\tScore : "+score);
				}
				}
				return ch;
			}
			
		
	

}
