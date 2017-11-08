import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot rob = new Robot();
	rob.setSpeed(10);
	rob.setRandomPenColor();
	rob.penDown();
	rob.move(100);
	rob.turn(90);
	rob.move(200);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(200);
	
		
		
	}
}
