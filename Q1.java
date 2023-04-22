import java.applet.Applet;
import java.awt.Graphics;
import java.util.*;

public class Q1 extends Applet {
	public void paint(Graphics g) {
		Scanner inputs = new Scanner(System.in);
		g.drawString("Enter Your Name : ", 350, 300);
		String s = inputs.nextLine();
		g.drawString("Hello"+s, 350, 350);
	}
}