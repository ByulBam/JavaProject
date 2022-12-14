package Lecture5;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx2 extends JFrame {

	private MyPanel panel = new MyPanel();

	public GraphicsDrawImageEx2() {

		setTitle("GraphicsDrawImageEx2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);

		setSize(300, 200);
		setVisible(true);
	}

	class MyPanel extends JPanel {

		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image image = icon.getImage();

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawImageEx2();
	}
}