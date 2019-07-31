package _00_IntroToArrays;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] robby = new Robot[10];

		for (int i = 0; i < robby.length; i++) {
			robby[i] = new Robot();
			robby[i].setX(i * 110+50);
			robby[i].setY(1000);
			robby[i].setSpeed(50);
		}
		Robot.setWindowSize(robby.length*110, 1000);
		boolean y = true;
		Random r = new Random();
		while (y) {

			

			
			for (int i = 0; i < robby.length; i++) {
				if (robby[i].getY() <= 0) {
					y=false;
					JOptionPane.showMessageDialog(null, "Yay " + (i+1) + " halth won");
				}
				robby[i].move(r.nextInt(100));

			}
		}

	}

	// 4. make each robot start at the bottom of the screen, side by side, facing up

	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.

}
