package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Die Klasse HighScoreReader hat den Zweck die Highscores der Spieler aus einer
 * Datei auszulesen
 * 
 * @author samuw
 *
 */
public class HighScoreReader {

	public static void main(String[] args) {

		// Datei erstellen
		File liste = new File("highscore.txt");
		// try-catch für fehler abfangen
		try {
			FileReader reader = new FileReader(liste);
			BufferedReader bReader = new BufferedReader(reader);

			String zeile = "";
			while (bReader.ready()) { // nur die Zeilen mit Inhalt ausgeben
				zeile = bReader.readLine();
				System.out.println(zeile);
			}
			bReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fehler: Datei nicht gefunden...");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Fehler: Kann Datei nicht lesen...");
			// e.printStackTrace();
		}

	}
	
	/**
	 * lese Highscoreliste und gib ArrayList con HighScore-Objekten zurück
	 * @param file
	 * @return
	 */
	public ArrayList<HighScore> readHighscores(String filePath) {
		
		ArrayList<HighScore> result = new ArrayList<>();

		// Datei erstellen
		File liste = new File(filePath);
		
		// try-catch für fehler abfangen
		try {
			FileReader reader = new FileReader(liste);
			BufferedReader bReader = new BufferedReader(reader);

			String zeile = "";
			while (bReader.ready()) { // nur die Zeilen mit Inhalt ausgeben
				zeile = bReader.readLine();
				
				HighScore hs = parseHighScore(zeile);
				result.add(hs);
				
				System.out.println(zeile);
			}
			bReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fehler: Datei nicht gefunden...");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Fehler: Kann Datei nicht lesen...");
			// e.printStackTrace();
		}

		return result;
	}
	
	/**
	 * Zeichenkette in HighScore-Objekt umwandeln
	 * @param line
	 * @return
	 */
	private HighScore parseHighScore(String line) {
		HighScore result;
		String[] parts = line.split(";");
		String name = parts[0];
		int score = Integer.parseInt(parts[1]);
		
		result = new HighScore(name, score);
		
		return result;
	}

}
