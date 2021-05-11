package concretes;

import abstracts.GameService;
import entities.Games;

public class GameManager implements GameService {

	@Override
	public void add(Games game) {
		System.out.println(game.getNameOfTheGame() + " sisteme ba�ar�l� bir �ekilde eklendi.");
	}

	@Override
	public void remove(Games game) {
		System.out.println(game.getNameOfTheGame() + " kald�r�ld�.");

	}

	@Override
	public void update(Games game) {
		System.out.println(game.getNameOfTheGame() + " g�ncellendi.");

	}

}
