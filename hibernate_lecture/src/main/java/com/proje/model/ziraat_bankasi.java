package com.proje.model;


public class ziraat_bankasi implements banka {
	private static int ödeme;
	private static int müsteri_sayisi=0;
	public static int getMüsteri_sayisi() {
		return müsteri_sayisi;
	}
	public static void setMüsteri_sayisi(int müsteri_sayisi) {
		ziraat_bankasi.müsteri_sayisi = müsteri_sayisi;
	}

	private float kazanc;
	public static boolean kredi_cikarmi(ögrenci ogr) {
		ödeme=ogr.getAraba_sayisi()+ogr.getArsa_sayisi()+ogr.getBakiye();
		if(ödeme>=2002) {
			return true;
		}
		else return false;
	}
	public float kazanc_hesapla(ögrenci ogr) {
		kazanc=(float) (ogr.getBakiye()*0.02);
		return kazanc;		
	}
	public float kazanc_hesapla(emekli emk) {
		kazanc=(float) (emk.getBakiye()*0.01);
		return kazanc;
	}

	@Override
	public void ev_kredisi() {
		System.out.println("Ziraat Banaksi Ev kredisi Hesaplama Alanýna Hoþgeldiniz");
		
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
	public void müsteri_sayisi() {
		müsteri_sayisi++;
		
	}

	@Override
	public void faiz_hesapla() {
		// TODO Auto-generated method stub
		
	}
	

}
