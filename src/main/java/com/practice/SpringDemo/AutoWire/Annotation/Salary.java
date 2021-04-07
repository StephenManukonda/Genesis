package com.practice.SpringDemo.AutoWire.Annotation;

public class Salary {
	
	private String flag;
	
	public void calculateSalar() {
		System.out.println("salary calculated " + flag);
	}

	/**
	 * @return the flagF
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * @param flag the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

}
