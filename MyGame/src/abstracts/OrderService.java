package abstracts;

import entities.Campaign;
import entities.Gamer;
import entities.Games;

public interface OrderService {
	void purchase(Gamer gamer, Games game);

	void purchase(Gamer gamer, Games game, Campaign campaign);
}
