package com.niit.homeshop.service;

import java.util.List;

import com.niit.homeshop.model.Card;




public interface CardDAO {
	
	 public List<Card> getAllCard();
	   public  Card getCard(int card_id);
	   public void insertCard(Card card);
	   public void updateCard(Card card);
	   public void deleteCard(int id);
	   public void deleteallCard(Card card);

}
