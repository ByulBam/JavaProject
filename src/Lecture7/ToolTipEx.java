package Lecture7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ToolTipManager;

public class ToolTipEx extends JFrame {
	private Container contentPane;

	public ToolTipEx() {

		setTitle("ToolTipEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = this.getContentPane();
		createToolBar();

		ToolTipManager m = ToolTipManager.sharedInstance();

		m.setEnabled(true);
		m.setInitialDelay(0);
		m.setDismissDelay(3000);

		setSize(500, 200);
		setVisible(true);
	}

	private void createToolBar() {

		JToolBar toolBar = new JToolBar("툴바 메뉴");
		toolBar.setBackground(Color.LIGHT_GRAY);

		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("파일을 생성합니다");
		toolBar.add(newBtn);

		JButton openBtn = new JButton(new ImageIcon("images/open.jpg"));
		openBtn.setToolTipText("파일을 엽니다");
		toolBar.add(openBtn);

		toolBar.addSeparator();

		JButton saveBtn = new JButton(new ImageIcon("images/save.jpg"));
		saveBtn.setToolTipText("파일을 저장합니다.");
		toolBar.add(saveBtn);
		toolBar.add(new JLabel("검색"));
		JTextField tf = new JTextField("검색할 내용을 입력하세요.");
		tf.setToolTipText("입력한 내용을 검색합니다.");
		toolBar.add(tf);

		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Java");
		combo.addItem("C/C++");
		combo.addItem("Python");
		toolBar.add(combo);

		contentPane.add(toolBar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ToolTipEx();
	}
}