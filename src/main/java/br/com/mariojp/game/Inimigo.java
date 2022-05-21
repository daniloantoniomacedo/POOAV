package br.com.mariojp.game;

public class Inimigo extends Sprite implements GameElement {

	private int initX;
	
	public Inimigo(int x, int y) {
		super(x, y);
		this.initX = x;
		init();
	}
	
	@Override
	public void init() {
		carregarImagem("/imagens/alien.png");
		getImageDimensions();
	}

	@Override
	public void move() {
		if (x < 0) {
			x = initX;
		}
		x -= 1;
	}

}
