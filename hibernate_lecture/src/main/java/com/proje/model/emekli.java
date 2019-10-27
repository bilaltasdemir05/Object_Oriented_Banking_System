package com.proje.model;



public class emekli extends Müsteri {
	private int emeklilik_yasi;
	private int emekli_maasi;
	private int bakiye;
	
	public int getBakiye() {
		return bakiye;
	}



	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}



	public int getEmeklilik_yasi() {
		return emeklilik_yasi;
	}



	public void setEmeklilik_yasi(int emeklilik_yasi) {
		this.emeklilik_yasi = emeklilik_yasi;
	}



	public int getEmekli_maasi() {
		return emekli_maasi;
	}



	public void setEmekli_maasi(int emekli_maasi) {
		this.emekli_maasi = emekli_maasi;
	}



	
	
	
	
	public emekli(Builder builder) {
		super(builder);
		// TODO Auto-generated constructor stub
	}

	
	

}
