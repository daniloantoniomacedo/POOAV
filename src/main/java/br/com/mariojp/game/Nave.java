package br.com.mariojp.game;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Nave extends Sprite implements GameElement {
	private int dx;
	private int dy;

	private int alcance;
	
    private ArrayList<Missil> missiles;
    
	public Nave(int x, int y, int alcance) {
		super(x, y);
		this.alcance = alcance;
		init();
	}
	
	@Override
	public void init() {
		missiles = new ArrayList<Missil>(); 
		carregarImagem("/imagens/nave.png"); 
		getImageDimensions();
	}

	@Override
	public void move() {
		x += dx;
		y += dy;
	}


	public Image getImage() {
		return image;
	}

	public void keyPressed(KeyEvent e) { 
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_SPACE) {
			atira(); 
		}
		if (key == KeyEvent.VK_LEFT){ 
			dx= -1;
		}if(key==KeyEvent.VK_RIGHT){
			dx = 1;
		}if(key==KeyEvent.VK_UP){
			dy= -1;
		}if(key==KeyEvent.VK_DOWN){
			dy= 1;
		}
	}
	
	private void atira() {
		missiles.add( (Missil) MissilFactory.getFactory().createGameElement(x + width, y + height / 2, alcance ));		
	}

	public void keyReleased(KeyEvent e) { 
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT){ 
			dx =0;
		}if(key==KeyEvent.VK_RIGHT){
			dx =0;
		}if(key==KeyEvent.VK_UP){
			dy=0;
		}if(key==KeyEvent.VK_DOWN){
			dy=0;
		}
	}

	public ArrayList<Missil> getMissiles() {
		return missiles;
	}
}
