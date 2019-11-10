package com.Assignment3.src;

import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> hand = new ArrayList<Card>();
	ArrayList<Integer> numericalValue = new ArrayList<Integer>();
	private Integer cardNumber = 0;
	
	public Hand() {
		ArrayList<Card> hand = new ArrayList<Card>();	
	}
	
	public void addCard(Card c) {
		hand.add(c);
	}
	
	public int getHandSize() {
		return hand.size();
	}
	
	public Card getCard(int i) {
		return hand.get(i);
	}
	
	public String showHand() {
		String str = "";
		for (int i = 0 ; i < hand.size(); i++) {
			str = str.concat(hand.get(i).toString() + " ");
		}
		return str;
	}
	
	public ArrayList<Integer> getNumericalValue (){
		System.out.println("This is the current hand size " + getHandSize());
		Card card = getCard(cardNumber);
		ArrayList<Integer> cardValue = card.getNumericalValue();
		System.out.println("The card value is:" + cardValue);
		if (numericalValue.size()==0) {
			System.out.println("First Card");
			for (int j : cardValue) {
				numericalValue.add(j);
			}
		} else {
			int initialNumericValueLength = numericalValue.size();
			for (int i = 0; i < initialNumericValueLength; i++) {
				if (cardValue.size()>1) {
					numericalValue.add(numericalValue.get(i) + cardValue.get(1));
					numericalValue.set(i, numericalValue.get(i) + cardValue.get(0));
				} else {
					System.out.println("I am in the adding section");
					numericalValue.set(i, numericalValue.get(i) + cardValue.get(0));
				}
			}
		}
		
		ArrayList<Integer> firstLast = new ArrayList<Integer>();
		
		firstLast.add(numericalValue.get(0));
		firstLast.add(numericalValue.get(numericalValue.size()-1));
		
		cardNumber++;
		System.out.println("The current list" + numericalValue);
		return firstLast;

	}
	
}