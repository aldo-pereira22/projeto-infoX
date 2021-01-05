package telas;

import javax.swing.JFrame;

public class TelaLogin extends JFrame {
	
	public TelaLogin() {
		// TODO Auto-generated constructor stub
				setTitle("Tela de Login");
				setSize(700, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		
		new TelaLogin();
	}
}
