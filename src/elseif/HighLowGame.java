//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);		


		for (int i = 0; i <= 10; i++) {
			String ans = JOptionPane.showInputDialog(null, "guess a number");
			int anz = (Integer.parseInt(ans));

		
		// 2. Print out the random variable above
		if(anz==random){JOptionPane.showMessageDialog(null, "win");}else
		if (anz<=random) {
			JOptionPane.showMessageDialog(null, "too low");
		} else if(anz>=random) {
			JOptionPane.showMessageDialog(null, "too high");
		}
		else{		JOptionPane.showMessageDialog(null, "lose");

		}}
		
		
		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 

			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			
			// 5. if the guess is correct
				// 6. win
			// 7. if the guess is high
				// 8. tell them it's too high
			// 9. if the guess is low
				// 10. tell them it's too low

		// 12. tell them they lose
	}}




