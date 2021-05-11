package concretes;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService {

	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer) == true) {
			System.out.println("Oyuncu eklendi :" + gamer.getFirstName() + " " + gamer.getLastName());
		} else {
			System.out.println("Oyuncu ekleme baþarýsýz!");
		}

	}

	@Override
	public void remove(Gamer gamer) {
		System.out.println("Oyuncu silindi : " + gamer.getFirstName() + " " + gamer.getLastName());
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi : " + gamer.getFirstName() + " " + gamer.getLastName());

	}

}
