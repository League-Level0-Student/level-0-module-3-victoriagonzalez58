//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	
		// 1. Ask the user how many cats they have
String ans = JOptionPane.showInputDialog(null, "How many cats do you have?");
		// 2. Convert their answer into an int
int anss =Integer.parseInt(ans);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady

if(anss >=3){
	JOptionPane.showMessageDialog(null, "You're crazy");
}if(anss ==0){
	JOptionPane.showMessageDialog(null, "jds");
	
}if(anss <=3){
	JOptionPane.showMessageDialog(null, "You're crazy");
	playVideo();
}


}
	}


		// 4. If they have 3 or less, call the method below to show them a cat video

		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		
	





