package gameArea.Entities;

public class Game {
	private int _gameId;
	private String _name;
	private double _price;

	public Game() {

	}

	public Game(int gameId, String name, double price) {

		this._gameId = gameId;
		this._name = name;
		this._price = price;
	}

	public int getGameId() {
		return _gameId;
	}

	public void setGameId(int gameId) {
		this._gameId = gameId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		this._price = price;
	}
}
