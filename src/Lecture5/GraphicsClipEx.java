package Lecture5;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsClipEx extends JFrame {

	private MyPanel panel = new MyPanel();

	public GraphicsClipEx() {

		setTitle("GraphicsClipEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);

		setSize(300, 400);
		setVisible(true);
	}

	class MyPanel extends JPanel {

		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image image = icon.getImage();

		@Override
		public void paintComponent(Graphics g) {

			super.paintComponent(g);
			g.setClip(100, 20, 150, 150);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);

			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Let's go!", 10, 150);

		}
	}

	public static void main(String[] args) {
		new GraphicsClipEx();
	}
}