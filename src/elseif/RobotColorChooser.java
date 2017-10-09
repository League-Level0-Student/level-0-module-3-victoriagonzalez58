
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

Robot jim = new Robot();
jim.setPenWidth(10000);
jim.penDown();
for (int i = 0; i < 10; i++) {
String color = JOptionPane.showInputDialog(null, "what color would you like the robot to draw in?");
jim.setRandomPenColor();
if(color.equalsIgnoreCase("blue")){
	jim.setPenColor(0, 0, 255);	
}
if(color.equalsIgnoreCase("pink")){
	jim.setPenColor(255, 175, 211);
}
jim.setSpeed(10);
jim.move(100);
jim.turn(90);
jim.move(100);
jim.turn(90);
jim.move(100);
jim.turn(90);
jim.move(100);
jim.turn(90);
}
	}
		//3. ask the user what color they would like the robot to draw
		
		//4. use an if/else statement to set the pen color that the user requested

        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)

}

