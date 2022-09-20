package gui;

import javax.swing.JFrame;
import gui.LoginForm;
public class Window {
	
	private JFrame window;
	private LoginForm loginForm;
	int width = 720, height = 580;
	
	
	
	
	public Window(){
		
		JFrame window = new JFrame("Library Management System");
		window.setSize(width, height);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		window.setResizable(false);
	
		
		loginForm = new LoginForm();
		loginForm.initLoginForm(window, width, height);
		
		
	}
	
	
	
	
	
	
}
