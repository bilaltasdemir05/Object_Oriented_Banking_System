package com.proje.model;


public class ziraat_bankasi implements banka {
	private static int �deme;
	private static int m�steri_sayisi=0;
	public static int getM�steri_sayisi() {
		return m�steri_sayisi;
	}
	public static void setM�steri_sayisi(int m�steri_sayisi) {
		ziraat_bankasi.m�steri_sayisi = m�steri_sayisi;
	}

	private float kazanc;
	public static boolean kredi_cikarmi(�grenci ogr) {
		�deme=ogr.getAraba_sayisi()+ogr.getArsa_sayisi()+ogr.getBakiye();
		if(�deme>=2002) {
			return true;
		}
		else return false;
	}
	public float kazanc_hesapla(�grenci ogr) {
		kazanc=(float) (ogr.getBakiye()*0.02);
		return kazanc;		
	}
	public float kazanc_hesapla(emekli emk) {
		kazanc=(float) (emk.getBakiye()*0.01);
		return kazanc;
	}

	@Override
	public void ev_kredisi() {
		System.out.println("Ziraat Banaksi Ev kredisi Hesaplama Alan�na Ho�geldiniz");
		
	}

	@Override
	public void araba_kredisi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borc_hesapla() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m�steri_sayisi() {
		m�steri_sayisi++;
		
	}

	@Override
	public void faiz_hesapla() {
		// TODO Auto-generated method stub
		
	}
	

}
