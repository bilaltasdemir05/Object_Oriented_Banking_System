package com.proje.model;

import javax.persistence.Embeddable;

@Embeddable
public class m�steri_adres_bilgileri {
	
	private String �lke;
	private String sehir;
	private String mahalle;
	private String sokak;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public m�steri_adres_bilgileri(String �lke, String sehir, String mahalle, String sokak) {
		super();
		this.�lke = �lke;
		this.sehir = sehir;
		this.mahalle = mahalle;
		this.sokak = sokak;
	}
	
	public m�steri_adres_bilgileri() {
		
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public String toString() {
		return "m�steri_adres_bilgileri [�lke=" + �lke + ", sehir=" + sehir + ", mahalle=" + mahalle + ", sokak="
				+ sokak + "]";
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String get�lke() {
		return �lke;
	}
	public void set�lke(String �lke) {
		this.�lke = �lke;
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
