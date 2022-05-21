package br.com.mariojp.game;

import java.util.Objects;

public class InimigoFactory implements AbstractFactory {
	
	private static AbstractFactory factory;
	
	private InimigoFactory() {
		
	}
	
	public static AbstractFactory getFactory() {
		if(Objects.isNull(factory)) {
			factory = new InimigoFactory();
		}
		return factory;
	}

	@Override
	public GameElement createGameElement(int x, int y, int alcance) {
		return new Inimigo(x, y);
	}

}
