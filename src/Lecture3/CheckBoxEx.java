package Lecture3;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame {

	public CheckBoxEx() {

	setTitle("CheckBoxEx");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());


	ImageIcon appleIcon = new ImageIcon("images/apple.jpg");
	ImageIcon pearIcon = new ImageIcon("images/pear.jpg");
	ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
	ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");

	JCheckBox apple = new JCheckBox("apple", appleIcon);
	JCheckBox pear = new JCheckBox("pear", pearIcon);
	JCheckBox cherry = new JCheckBox("cherry", cherryIcon, true);

	cherry.setSelectedIcon(selectedCherryIcon);
	apple.setBorderPainted(true);
	pear.setBorderPainted(true);
	cherry.setBorderPainted(true);

	c.add(apple);
	c.add(pear);
	c.add(cherry);

	setSize(900,600);
	setVisible(true);

	}

	public static void main(String[] args) {

		new CheckBoxEx();

	}

}
