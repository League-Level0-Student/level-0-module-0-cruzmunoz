import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot C3P0 = new Robot();
         for (int i = 0; i < 180; i++) {
			C3P0.setAngle(-90);
        	 C3P0.penDown();
			C3P0.move(1);
			C3P0.turn(1);
		}	
}
}
