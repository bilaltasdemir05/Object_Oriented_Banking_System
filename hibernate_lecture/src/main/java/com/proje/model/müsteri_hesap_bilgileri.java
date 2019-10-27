package com.proje.model;

import javax.persistence.Embeddable;

@Embeddable
public class müsteri_hesap_bilgileri {
	
	private int hesap_no;
	private int bakiye;
	private int nakit_avans;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public int getHesap_no() {
		return hesap_no;
	}
	public void setHesap_no(int hesap_no) {
		this.hesap_no = hesap_no;
	}
	public int getBakiye() {
		return bakiye;
	}
	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}
	public int getNakit_avans() {
		return nakit_avans;
	}
	public void setNakit_avans(int nakit_avans) {
		this.nakit_avans = nakit_avans;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public String toString() {
		return "müsteri_hesap_bilgileri [hesap_no=" + hesap_no + ", bakiye=" + bakiye + ", nakit_avans=" + nakit_avans
				+ "]";
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public müsteri_hesap_bilgileri(int hesap_no, int bakiye, int nakit_avans) {
		this.hesap_no = hesap_no;
		this.bakiye = bakiye;
		this.nakit_avans = nakit_avans;
	}
	public müsteri_hesap_bilgileri() {
		
	}
	

}
