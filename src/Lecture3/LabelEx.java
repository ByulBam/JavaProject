package Lecture3;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {

	public LabelEx() {

	setTitle("LableEx");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());

	JLabel textLabel = new JLabel("LOVE");

	ImageIcon beauty = new ImageIcon("images/beauty.jpg");
	JLabel imageLabel = new JLabel(beauty);

	ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
	JLabel label = new JLabel("Call me if you want", normalIcon, SwingConstants.CENTER);

	c.add(textLabel);
	c.add(imageLabel);
	c.add(label);

	setSize(400,600);
	setVisible(true);
	}

	public static void main(String[] args) {

		new LabelEx();

	}

}
