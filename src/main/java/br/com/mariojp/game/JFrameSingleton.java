package br.com.mariojp.game;

import java.util.Objects;

import javax.swing.JFrame;

public class JFrameSingleton extends JFrame{
	
	private static final long serialVersionUID = -8283559141533608386L;
	
	private JFrame ex;
	
	public JFrame getJFrame() {
		if(Objects.isNull(ex)) {
			ex = new JFrame();
			initUI(ex); 
		}
		return ex;
	}
	
	 private void initUI(JFrame ex) {
        ex.add(JogoSingleton.getJogo());
        ex.setResizable(false);
        ex.pack();
        ex.setTitle("Game");    
        ex.setLocationRelativeTo(null);
        ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
	  }


}
