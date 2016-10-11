package com.niit.homeshop.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.homeshop.modal.Card;

@Repository("CardDAO")
public class CardDAOImpl implements CardDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	public SessionFactory getSession()
	{
		return sessionFactory;
	}
	
	public CardDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory= sessionFactory; 
	}

	@Transactional
	public List<Card> getAllCard() {
		return sessionFactory.getCurrentSession().createQuery("from Card").list();
	}

	@Transactional
	public Card getCard(int card_id) {
		return(Card)sessionFactory.getCurrentSession().get(Card.class, card_id);
	}

	@Transactional
	public void insertCard(Card card) {
		sessionFactory.getCurrentSession().saveOrUpdate(card);
	}

	@Transactional
	public void updateCard(Card card) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void deleteCard(int id) {
		Card deleteCard=new Card();
		  deleteCard.setCard_Id(id);
		  sessionFactory.getCurrentSession().delete(deleteCard);
	}

	@Transactional
	public void deleteallCard(Card card) {
		// TODO Auto-generated method stub

	}

}
