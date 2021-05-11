package concretes;

import abstracts.GameService;
import entities.Games;

public class GameManager implements GameService {

	@Override
	public void add(Games game) {
		System.out.println(game.getNameOfTheGame() + " sisteme baþarýlý bir þekilde eklendi.");
	}

	@Override
	public void remove(Games game) {
		System.out.println(game.getNameOfTheGame() + " kaldýrýldý.");

	}

	@Override
	public void update(Games game) {
		System.out.println(game.getNameOfTheGame() + " güncellendi.");

	}

}
