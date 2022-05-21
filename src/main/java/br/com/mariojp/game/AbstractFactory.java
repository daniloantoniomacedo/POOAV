package br.com.mariojp.game;

public interface AbstractFactory {
	
	GameElement createGameElement(int x, int y, int alcance);

}
