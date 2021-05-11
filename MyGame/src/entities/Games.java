package entities;

public class Games {
	private int productId;
	private String nameOfTheGame;
	private double price;

	public Games() {
	}

	public Games(int productId, String nameOfTheGame, double price) {
		super();
		this.productId = productId;
		this.nameOfTheGame = nameOfTheGame;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getNameOfTheGame() {
		return nameOfTheGame;
	}

	public void setNameOfTheGame(String nameOfTheGame) {
		this.nameOfTheGame = nameOfTheGame;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
