package Lecture2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClickAndDoubleClickEx extends JFrame {

	private JLabel la = new JLabel("No Mouse Event");

	public ClickAndDoubleClickEx() {

		setTitle("ClickAndDoubleClickEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyMouseListener Listener = new MyMouseListener();
		c.addMouseListener(Listener);
		c.addMouseWheelListener(Listener);
		c.add(la);

		setSize(300, 200);
		setVisible(true);
	}

	class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			la.setText(Integer.toString(e.getClickCount())+ "time Clicked");
			if (e.getClickCount() == 2) {
				la.setText("DoubleClick");
				int r = (int) (Math.random() * 256);
				int g = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);
				Component c = (Component) e.getSource();
				c.setBackground(new Color(r, g, b));
			}
			else if(e.getClickCount() == 1){
				la.setText("Single Click");
			}
		}
		public void MouseWheelMoved(MouseWheelEvent e) {
			if(e.getWheelRotation()>0) {
				la.setText("UP Scroll");
			}
			else {
				la.setText("Down Scroll");
			}
		}
	}

	public static void main(String[] args) {
		new ClickAndDoubleClickEx();
	}
}