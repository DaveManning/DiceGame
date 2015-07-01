
import java.util.Random;

import javax.swing.JOptionPane;

public class DiceGame {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int rollsremaining= 3;
		int[] dice = new int[5];
		String message;
		boolean six = false, five = false, four = false;
		int start = 0;
		int score = 0;
		
		do{
		 for(int i =start; i < 5; i++){

		 dice[i] = (int) (6*rand.nextDouble() + 1);
		 
		 if(dice[i] == 6) six = true;
		 if(dice[i] == 5) five = true;
		 if(dice[i] == 4) four = true;
		 }	
		
		
		if (six && !five){
		start = 1;
		dice[0] = 6;
		message = "You rolled 6, you need 5 and 4 and have 2 rolls left";
		JOptionPane.showMessageDialog(null, message, "Dice Game", JOptionPane.INFORMATION_MESSAGE);
		} else if (six && five && !four){
		start = 2;
		dice[0] = 6;
		dice[1] = 5;
		message = "You rolled 6 and 5, you need 4 and have 2 rolls left";
		JOptionPane.showMessageDialog(null, message, "Dice Game", JOptionPane.INFORMATION_MESSAGE);
		} else if (six && five && four){
		start = 3;
		dice[0] = 6;
		dice[1] = 5;
		dice[2] = 4;
		score = dice[3] + dice[4];
		message = "You rolled 6, 5, and 4, and your score is " + score +". Do you want to roll again?";
		JOptionPane.showConfirmDialog(null, message, "Dice Game", JOptionPane.INFORMATION_MESSAGE);
		} else {
		start = 0;
		message = "You didn't roll a 6, try again";
		}
		rollsremaining--;
		} while (rollsremaining >0);
		
		while (rollsremaining == 0){
		message = "You have no rolls left, your final score is"	+ score + "Thanks for playing";
		JOptionPane.showMessageDialog(null, message, "Dice Game", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		}


	
	} //end main

} //end DiceGame
