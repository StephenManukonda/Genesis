package com.practice.SpringDemo;

public class Trai {
	
	private int frequency;
	
	private int wavelength;

	/**
	 * @return the frequency
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * @param frequency the frequency to set
	 */
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	/**
	 * @return the wavelength
	 */
	public int getWavelength() {
		return wavelength;
	}

	/**
	 * @param wavelength the wavelength to set
	 */
	public void setWavelength(int wavelength) {
		this.wavelength = wavelength;
	}
	
	public int price() {
		return this.frequency+this.wavelength;
	}

}
