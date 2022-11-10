package Lecture5;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawLineMouseEx extends JFrame {

	private MyPanel panel = new MyPanel();

	public GraphicsDrawLineMouseEx() {

		setTitle("GraphicsDrawLineMouseEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);

		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {

		private Vector<Point> vStart = new Vector<Point>();
		private Vector<Point> vEnd = new Vector<Point>();

		public MyPanel() {
			this.addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {
					vStart.add(e.getPoint());
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					vEnd.add(e.getPoint());
					repaint();
				}
			});
		}

		@Override
		public void paintComponent(Graphics g) {

			super.paintComponent(g);

			g.drawString(": " + Integer.toString(vEnd.size()), 10, 10);

			for (int i = 0; i < vEnd.size(); i++) {
				Point s = vStart.elementAt(i); // Point 는 Double 값, int로 형변환 해야
				Point e = vEnd.elementAt(i);
				g.drawLine((int) s.getX(), (int) s.getY(), (int) e.getX(), (int) e.getY());
			}
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}
}