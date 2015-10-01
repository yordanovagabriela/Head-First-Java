import javax.swing.*;
import java.awt.*;

public class Test1 {

	public static void main(String[] args) {
		Test1 gui = new Test1();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("shock me");
		JButton buttonTwo = new JButton("biss");

		panel.setBackground(Color.darkGray);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(button);
		panel.add(buttonTwo);

		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}