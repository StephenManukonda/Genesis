package com.practice.SpringDemo.AutoWire.xml;

public class Human {

	private Heart heart;

	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	public void startPumping() {
		heart.pump();
	}

	/**
	 * @return the heart
	 */
	public Heart getHeart() {
		return heart;
	}

	/**
	 * @param heart the heart to set
	 */
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

}
