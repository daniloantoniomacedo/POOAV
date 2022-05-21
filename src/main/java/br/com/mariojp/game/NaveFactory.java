package br.com.mariojp.game;

import java.util.Objects;

public class NaveFactory implements AbstractFactory{
	
	private static AbstractFactory factory;
	
	private NaveFactory() {
		
	}
	
	public static AbstractFactory getFactory() {
		if(Objects.isNull(factory)) {
			factory = new NaveFactory();
		}
		return factory;
	}

	@Override
	public GameElement createGameElement(int x, int y, int alcance) {
		return new Nave(x, y, alcance);
	}

}
