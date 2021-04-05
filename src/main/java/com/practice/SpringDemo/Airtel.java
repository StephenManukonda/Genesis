package com.practice.SpringDemo;

public class Airtel implements Sim {
	
	private int simNum;
	
	private Trai trai;

	public Airtel() {
	}

	public int getPrice() {
		return trai.price();
	}
	public void calling() {
		System.out.println("airtel sim calling");

	}

	public void data() {
		System.out.println("airtel data using");
	}

	/**
	 * @return the simNum
	 */
	public int getSimNum() {
		return simNum;
	}

	/**
	 * @param simNum the simNum to set
	 */
	public void setSimNum(int simNum) {
		System.out.println("setter method called");
		this.simNum = simNum;
	}

	/**
	 * @return the trai
	 */
	public Trai getTrai() {
		return trai;
	}

	/**
	 * @param trai the trai to set
	 */
	public void setTrai(Trai trai) {
		this.trai = trai;
	}
	


}
