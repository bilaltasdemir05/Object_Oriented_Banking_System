package com.proje.model;


public class ögrenci extends Müsteri{
	private String bölüm;
	private String okul_adi;
	private int bakiye;

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}

	public ögrenci(Builder builder) {
		super(builder);
	}

	public String getOkul_adi() {
		return okul_adi;
	}

	public void setOkul_adi(String okul_adi) {
		this.okul_adi = okul_adi;
	}

	public String getBölüm() {
		return bölüm;
	}

	public void setBölüm(String bölüm) {
		this.bölüm = bölüm;
	}
	

}
