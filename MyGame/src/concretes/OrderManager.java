package concretes;

import abstracts.OrderService;
import entities.Campaign;
import entities.Gamer;
import entities.Games;

public class OrderManager implements OrderService {

	@Override
	public void purchase(Gamer gamer, Games game) {
		System.out.println("Tebrikler " + gamer.getFirstName() + ". " + game.getNameOfTheGame()
				+ " kütüphanenize eklendi. Ödenen miktar: " + game.getPrice());
	}

	@Override
	public void purchase(Gamer gamer, Games game, Campaign campaign) {
		System.out.println("Tebrikler " + gamer.getFirstName() + ". " + game.getNameOfTheGame()
				+ " kütüphanenize eklendi. Oyun fiyatý: " + game.getPrice() + "tl" + ", Kampanya indirimi: "
				+ game.getPrice() * campaign.getDiscountRate() + "tl" + ". Total fiyat: "
				+ (game.getPrice() - game.getPrice() * campaign.getDiscountRate()) + "tl");

	}

}
