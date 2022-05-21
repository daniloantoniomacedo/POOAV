package br.com.mariojp.game;

import java.util.Objects;

public class MissilFactory implements AbstractFactory {
	
	private static AbstractFactory factory;
	
	private MissilFactory() {
		
	}
	
	public static AbstractFactory getFactory() {
		if(Objects.isNull(factory)) {
			factory = new MissilFactory();
		}
		return factory;
	}

	@Override
	public GameElement createGameElement(int x, int y, int alcance) {
		return new Missil(x, y, alcance);
	}

}
