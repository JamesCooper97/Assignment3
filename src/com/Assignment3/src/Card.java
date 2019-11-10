package com.Assignment3.src;

import java.util.ArrayList;
import java.util.Random;

public class Card {
	private boolean dealt;
	private String suit;
	private String value;
	public Object getNumericalValue;
	private static String[] suitArray = {"HEARTS", "SPADES","CLUBS", "DIAMONDS"};
	private static String[] valueArray = {"TWO", "THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING","ACE"};
	public Card(String suit, String value) {
		boolean dealt = false;
		this.suit = suit;
		this.value = value;
	}
	public String getSuit() {
		return suit;
	}
	public String getValue() {
		return value;
	}
	public ArrayList<Integer> getNumericalValue(){
		ArrayList<Integer> numericalValue = new ArrayList<Integer>();
		switch(value) {
		case ("ACE"):
			numericalValue.add(11);
			numericalValue.add(1);
			break;
		case("TWO"):
			numericalValue.add(2);
			break;
		case("THREE"):
			numericalValue.add(3);
			break;
		case("FOUR"):
			numericalValue.add(4);
			break;
		case("FIVE"):
			numericalValue.add(5);
			break;
		case("SIX"):
			numericalValue.add(6);
			break;
		case("SEVEN"):
			numericalValue.add(7);
			break;
		case("EIGHT"):
			numericalValue.add(8);
			break;
		case("NINE"):
			numericalValue.add(9);
			break;
		case("TEN"):
			numericalValue.add(10);
			break;
		case("JACK"):
			numericalValue.add(10);
			break;
		case("QUEEN"):
			numericalValue.add(10);
			break;
		case("KING"):
			numericalValue.add(10);
			break;
		}
	return numericalValue;
		
	}
	
	public boolean getDealt() {
		return this.dealt;
	}
	
	public void setDealt(boolean dealt) {
		this.dealt = dealt;
	}
	
	public String toString() {
		String card = suit + "\n" + value;
		return card;
	}
	
	public static String getRandomSuit() {
		Random r = new Random();
		return suitArray[r.nextInt(4)];
	}
	
	public static String getRandomValue() {
		Random r =  new Random();
		return valueArray[r.nextInt(13)];
	}
}