package abstracts;

import entities.Games;

public interface GameService {
	void add(Games game);

	void remove(Games game);

	void update(Games game);
}
