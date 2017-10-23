//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {

	public static void main(String[] args) {

	String ans = JOptionPane.showInputDialog(null, "How dizzy"
			+ " do you want the robot \n to be on a scale of 1-10?");
	Robot tim = new Robot();
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
int anss = Integer.parseInt(ans);
for (int j = 0; j < anss; j++) {
	tim.setSpeed(100);
	tim.turn(360);
}
 // 1. Use the dance method to make the robot spin.
	

	}


}

