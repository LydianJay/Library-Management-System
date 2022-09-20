package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class LoginForm extends JPanel {
	private JFrame frame;
	private JPanel container;
	private int windowWidth, windowHeight;
	private int frameWidht, frameHeigth;
	
	
	void initLoginForm(JFrame j, int w, int h) {
		this.frame = j;
		this.windowHeight = h;
		this.windowWidth = w;
		
		
		this.setSize(j.getSize());
		
		this.setVisible(true);
		this.setBackground(new Color(106,192,107));
		this.setOpaque(true);
		this.setLayout(null);
		
		this.frame.add(this);
		
		
		container = new JPanel();
		int width = (int) (this.getWidth() * 0.65), height = (int) (this.getHeight() * 0.30);
		int x = this.getWidth() / 2 - width / 2, y = this.getHeight() / 4 + height / 4;
		container.setBounds(x, y, width, height);
		container.setVisible(true);
		container.setBackground(new Color(0 ,172,67));
		container.setOpaque(true);
		container.setLayout(null);
		this.add(container);
		
		
		JPanel c = container;
		JLabel l1 = new JLabel("UserID");
		l1.setLayout(null);
		l1.setFont(new Font(l1.getFont().getName(), Font.BOLD, 14));
		l1.setVisible(true);
		l1.setForeground(Color.white);
		width = (int) (c.getWidth() * 0.65);	height = (int) (c.getHeight() * 0.30);
		x = 20; y = 10;
		l1.setBounds(x, y, width, height);
		container.add(l1);
		
		
		JTextField tx1 = new JTextField(25);
		tx1.setLayout(null);
		tx1.setFont(l1.getFont());
		tx1.setOpaque(true);
		tx1.setVisible(true);
		width = (int) (c.getWidth() * 0.65);	height = (int) (c.getHeight() * 0.25);
		x = 100; y = 10;
		tx1.setBounds(x, y, width, height);
		container.add(tx1);
		
		
		JLabel l2 = new JLabel("Password");
		l2.setLayout(null);
		l2.setFont(l1.getFont());
		l2.setVisible(true);
		l2.setForeground(Color.white);
		width = (int) (c.getWidth() * 0.65);	height = (int) (c.getHeight() * 0.30);
		x = 20; y = 70;
		l2.setBounds(x, y, width, height);
		container.add(l2);
		
		

		JPasswordField tx2 = new JPasswordField(25);
		tx2.setLayout(null);
		tx2.setEchoChar('*');
		tx2.setFont(l1.getFont());
		tx2.setOpaque(true);
		tx2.setVisible(true);
		width = (int) (c.getWidth() * 0.65);	height = (int) (c.getHeight() * 0.25);
		x = 100; y = 70;
		tx2.setBounds(x, y, width, height);
		container.add(tx2);
		
		container.repaint();
	}
	
	
	
	
	
	
}
