package com;

public class CurrencyConverter {

	private float rupees;
	private float dollars;
	
	public float getRupees() {
		return dollars * 50;
	}
	public void setRupees(float rupees) {
		this.rupees = rupees;
	}
	public float getDollars() {
		return rupees/50 ;
	}
	public void setDollars(float dollars) {
		this.dollars = dollars;
	}
	
}
