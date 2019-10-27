package com.proje.model;


public class is_bankasi implements banka {
	private float kazanc;
	@Override
	public void ev_kredisi() {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void faiz_hesapla() {
		// TODO Auto-generated method stub
		
	}
	public float kazanc_hesapla(ögrenci ogr) {
		kazanc=(float) (ogr.getBakiye()*0.02);
		return kazanc;		
	}
	public float kazanc_hesapla(emekli emk) {
		kazanc=(float) (emk.getBakiye()*0.01);
		return kazanc;
	}

}
