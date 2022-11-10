package Lecture1;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout(30, 20));

		c.add(new JButton("add"), BorderLayout.WEST);
		c.add(new JButton("sub"), BorderLayout.NORTH);
		c.add(new JButton("mul"), BorderLayout.SOUTH);
		c.add(new JButton("div"), BorderLayout.EAST);
		// c.add(new JButton("Calculate"), BorderLayout.WEST);

		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		c.add(p, BorderLayout.CENTER);
		p.add(new JButton("1"), BorderLayout.CENTER);
		p.add(new JButton("2"),BorderLayout.NORTH);
		p.add(new JButton("3"),BorderLayout.SOUTH);
		p.add(new JButton("4"),BorderLayout.EAST);
		p.add(new JButton("5"),BorderLayout.WEST);

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {

		BorderLayoutEx frame = new BorderLayoutEx();
	}
}