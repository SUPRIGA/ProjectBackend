package com.niit.homeshop.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Card")
@Component
public class Card {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int card_id;
	@Column
		private String cardholder_name;
	@Column
		private int card_number ; 
	@Column
		private int cvv_number ; 
	@Column
		private String cardtype;
		
		
		public int getCard_Id() {
			return card_id;
		}
		public void setCard_Id(int card_id) {
		   this.card_id= card_id;
		}
		
	 public String getCardHolder_Name() {
		 return cardholder_name;
	 }
	public void setCardHolder_Name(String cardholder_name) {
		this.cardholder_name = cardholder_name;
	}
	public int getCard_Number() {
		return card_number;
	}
	public void setCard_Number(int card_number) {
	   this.card_number = card_number;
	}
	public int getCvv_Number() {
		return cvv_number;
	}
	public void setCvv_number(int cvv_number) {
	   this.cvv_number = cvv_number;
	}
	public String getCardType() {
		 return cardtype;
	}
	public void setCardType(String cardtype) {
		this.cardtype = cardtype;
	}
	}



