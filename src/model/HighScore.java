package model;

/**
 * Klasse zur Verwaltung von Highscore-Daten
 * @author samuw
 *
 */
public class HighScore {
	
	String name;
	int score;
	
	/**
	 * 
	 * @param name
	 * @param score
	 */
	public HighScore(String name, int score) {
		this.name = name;
		this.score = score;
		
	}

	/**
	 * @return the name of the Player
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the score of the Player
	 */
	public int getScore() {
		return score;
	}

	
}
