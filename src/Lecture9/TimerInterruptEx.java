package Lecture9;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable2 implements Runnable {

	private JLabel timerLabel;

	public TimerRunnable2(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class TimerInterruptEx extends JFrame {

	private Thread th;

	public TimerInterruptEx() {

		setTitle("TimerInterruptEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);

		JButton btn = new JButton("Kill Timer");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();
				JButton btn = (JButton) e.getSource();
				btn.setEnabled(false);
			}
		});

		c.add(btn);

		setSize(250, 150);
		setVisible(true);

		TimerRunnable2 runnable = new TimerRunnable2(timerLabel);
		th = new Thread(runnable);

		th.start();
	}

	public static void main(String[] args) {

		new TimerInterruptEx();

	}

}
