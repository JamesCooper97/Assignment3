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
		ArrayList<Integer> numValues = new ArrayList<Integer>();
		ArrayList<Integer> numericalValues = new ArrayList<Integer>();
		for (int i = 0; i < hand.size(); i++) {
			Card card = hand.get(i);
			numValues.addAll(card.getNumericalValue());
			
			if (card.getValue() == "ACE") {
				if (numericalValues.size() == 0) {
					numericalValues.add(0,1);
					numericalValues.add(1,11);
				}
				else if (numericalValues.size() > 0) {
					numericalValues.add(numericalValues.get(numericalValues.size()-1)+1);
					for (int j = 0; j < numericalValues.size()-1; j++) {
						numericalValues.set(j, numericalValues.get(j)+11);
					}
				}
			}
			else {
				if (numericalValues.size() == 0) {
					numericalValues.add(numValues.get(0));
				}
				else {
					for (int j = 0; j < numericalValues.size(); j++) {
						numericalValues.set(j, numericalValues.get(j)+numValues.get(0));
					}
				}
			}
		}
		return numericalValues;

	}
	
	public ArrayList<Integer> getNumericalValue2() {
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
		
		cardNumber++;
		System.out.println("The current list" + numericalValue);
		return numericalValue;
	}
}