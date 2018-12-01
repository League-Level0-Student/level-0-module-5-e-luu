package extra;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot sandy = new Robot();
		// 2. Set the speed to 100
		sandy.setSpeed(75);
		int colorChoice = JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE,
				JOptionPane.DEFAULT_OPTION, null, new String[] { "Green", "Blue", "Pink" }, 0);

		// 3. Use if statements to check the the value of colorChoice and set the pen
		// color accordingly
		if (colorChoice == 0) {
			sandy.setPenColor(Color.GREEN);
		} else if (colorChoice == 1) {
			sandy.setPenColor(Color.BLUE);
		} else if (colorChoice == 2) {
			sandy.setPenColor(Color.PINK);
		}
		// 4. Ask the use how many polygons they want to be drawn.
		String polygon = JOptionPane.showInputDialog("How may polygons should the robot draw?");
		int num = Integer.parseInt(polygon);
		// 5. Use the robot to draw the number of polygons the user requested.
		sandy.penDown();
		
		for (int i = 0; i < num; i++) {
			sandy.setX(i*10);
			sandy.setY(200);
			for (int j = 0; j < 5; j++) {
				sandy.move(100);
				sandy.turn(72);
			}
				}
		// 6. Make it so your shapes do not overlap

		// 7. Challenge: add more colors to the Option Dialog.
	}
}
