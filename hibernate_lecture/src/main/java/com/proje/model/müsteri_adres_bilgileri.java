package com.proje.model;

import javax.persistence.Embeddable;

@Embeddable
public class müsteri_adres_bilgileri {
	
	private String ülke;
	private String sehir;
	private String mahalle;
	private String sokak;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public müsteri_adres_bilgileri(String ülke, String sehir, String mahalle, String sokak) {
		super();
		this.ülke = ülke;
		this.sehir = sehir;
		this.mahalle = mahalle;
		this.sokak = sokak;
	}
	
	public müsteri_adres_bilgileri() {
		
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public String toString() {
		return "müsteri_adres_bilgileri [ülke=" + ülke + ", sehir=" + sehir + ", mahalle=" + mahalle + ", sokak="
				+ sokak + "]";
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String getÜlke() {
		return ülke;
	}
	public void setÜlke(String ülke) {
		this.ülke = ülke;
	}
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	public String getMahalle() {
		return mahalle;
	}
	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}
	public String getSokak() {
		return sokak;
	}
	public void setSokak(String sokak) {
		this.sokak = sokak;
	}

}
