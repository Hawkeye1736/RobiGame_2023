package model;

import processing.core.PApplet;

public class Robi {
	// Eigenschaften definieren
	int x;
	int y;
	int myColor;
	int speed = 5;
	int speed2 = 1;
	private int score = 0;
	PApplet window;

	public int getScore() {
		return score;
	}
	
	/**
	 * punktestand um value erhöhen
	 */
	public void addScore(int value) {
		score += value;
	}
	
	// Konstruktor mit Parametern 
	public Robi(PApplet window,  int xPos, int yPos, int c){
		this.window = window;
		x = xPos; // Parameterwerte an Attribute übergeben
		y = yPos;
		myColor = c;
	}

	// Fähigkeiten	  
	public void moveDown(){
		y += speed;
	}

	public void moveUp(){
		y -= speed;
	}

	public void moveLeft(){
		x = getX() - speed;
	}

	public void moveRight(){
		x = getX() + speed;
	}
	// Fähigkeiten	  
	public void moveDownKI(){
		y +=   speed2;
	}

	public void moveUpKI(){
		y -= speed2;
	}

	public void moveLeftKI(){
		x = getX() - speed2;
	}

	public void moveRightKI(){
		x = getX() + speed2;
	}

	public void drawRobi(){
		window.rectMode(window.CENTER);
		window.fill(myColor);
		window.stroke(myColor);
		window.rect(getX(), y, 60,40,10);
		window.noStroke();
		window.fill(255);
		window.ellipse(getX()+15, y, 25,25);
		window.ellipse(getX()-15, y, 25,25);
		window.fill(0);
		window.ellipse(getX()+15, y, 15,15);
		window.ellipse(getX()-15, y, 15,15);
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
