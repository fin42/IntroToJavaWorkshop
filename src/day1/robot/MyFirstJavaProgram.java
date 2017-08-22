package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		System.out.println("Hello World");
		Robot myRobot = new Robot("mini");
		myRobot.setPenColor(255, 0, 0);
		myRobot.penDown();
		myRobot.turn(90);
		myRobot.move(50);
		myRobot.turn(90);
		myRobot.setPenColor(0, 255, 0);
		myRobot.move(50);
		myRobot.turn(90);
		myRobot.setPenColor(0, 0, 255);
		myRobot.move(50);
		myRobot.setPenColor(10, 78, 59);
		myRobot.turn(90);
		myRobot.move(50);

	}
}
