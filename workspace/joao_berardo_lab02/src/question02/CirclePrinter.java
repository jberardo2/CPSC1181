package question02;

import javax.swing.JFrame;

public class CirclePrinter {

	public static void main(String[] args) {
	      JFrame frame = new JFrame();

	      frame.setSize(400, 400);
	      frame.setTitle("Lab 02 - Circle");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      CirclesComponent circlesComponent = new CirclesComponent();

	      frame.add(circlesComponent);
	      
	      frame.setVisible(true);
	}
}