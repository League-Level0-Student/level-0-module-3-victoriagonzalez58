
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		
		Robot rob = new Robot();
		rob.moveTo(10, 300);
		rob.penDown();
		rob.setSpeed(100);
		
		rob.setRandomPenColor();
		rob.setPenWidth(30);
		rob.turn(90);
		
				
		for (int i2 = 0; i2 < 5; i2++) {
			rob.penDown();
			rob.setSpeed(100);
			rob.setRandomPenColor();
			rob.setPenWidth(30);
			
			rob.move(100);
			rob.turn(144);
		}
rob.penUp();	
rob.move(100);
rob.turn(270);
rob.move(50);
for (int i2 = 0; i2 < 5; i2++) {
	rob.penDown();
	rob.setSpeed(100);
	rob.setRandomPenColor();
	
	rob.setPenWidth(30);
	rob.move(100);
	rob.turn(144);
}

}
	}
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: 144.

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * * http://bit.ly/walk-of-fame
e robot draw a line of stars like this:
		 * 
		 * Hint: The distance between stars is 50.
		 */

	


