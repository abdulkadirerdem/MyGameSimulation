import java.time.LocalDate;

import adapters.MernisServiceAdapter;
import concretes.CampaignManager;
import concretes.GameManager;
import concretes.GamerManager;
import concretes.OrderManager;
import entities.Campaign;
import entities.Gamer;
import entities.Games;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		gamer.setFirstName("Abdulkadir");
		gamer.setLastName("Erdem");
		gamer.setDateOfBirth(LocalDate.of(2000, 11, 11));
		gamer.setNationalityId("14561215726");
		gamer.setEmail("test@test.com");
		gamer.setPassword("123");
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);
		System.out.println("-----");

		Games game = new Games(11, "Valorant", 50);
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		System.out.println("-----");

		Campaign campaign1 = new Campaign(21, "Hafta Sonu Kampanyasý", 0.10);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		System.out.println("-----");

		OrderManager orderManager = new OrderManager();
		orderManager.purchase(gamer, game, campaign1);
	}

}
