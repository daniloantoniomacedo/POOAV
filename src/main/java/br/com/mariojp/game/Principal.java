package br.com.mariojp.game;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Principal {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                
            	JFrameSingleton singleton = new JFrameSingleton();
            	JFrame ex = singleton.getJFrame();
                ex.setVisible(true);                
            }
        });
    }
}