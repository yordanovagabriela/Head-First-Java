import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Exercise {

	JFrame frame;
	JButton b;

	public static void main(String[] args) {
		Exercise gui = new Exercise();
		gui.go();
	}

	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOpertion(JFrame.EXIT_ON_CLOSE);

		b = new JButton("A");
		b.addActionListener(new BListener());

		frame.getContentPane().add(BorderLayout.SOUTH, b);
		frame.setSize(200, 100);
		frame.setVisible(true);
	}

	class BListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(b.getText().equals("A")) {
				b.setText("B");
			} else {
				b.setText("A");
			}
		}
	}
}