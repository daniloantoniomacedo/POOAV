package br.com.mariojp.game;

public class Missil extends Sprite implements GameElement {

	private final int MISSILE_SPEED = 2;
	private int alcance;
	
	public Missil(int x, int y, int alcance) {
		super(x, y);
		this.alcance = alcance;
	    init();
	}
	
	@Override
	public void init() { 
		carregarImagem("/imagens/missil.png"); 
		getImageDimensions();
	}
	
	@Override
	public void move() {
		x += MISSILE_SPEED;
		if (x > this.alcance) {
			visibilty = false; 
		}
	}
}
