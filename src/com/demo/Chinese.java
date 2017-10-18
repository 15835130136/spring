package com.demo;

public class Chinese implements Person {
	
	private Axe axe;
	

	public Axe getAxe() {
		return axe;
	}


	public void setAxe(Axe axe) {
		this.axe = axe;
	}


	@Override
	public void useAxe() {
		
		axe.chop();

		
	}

}
