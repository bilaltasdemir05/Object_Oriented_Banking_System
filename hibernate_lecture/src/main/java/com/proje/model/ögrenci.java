package com.proje.model;


public class �grenci extends M�steri{
	private String b�l�m;
	private String okul_adi;
	private int bakiye;

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}

	public �grenci(Builder builder) {
		super(builder);
	}

	public String getOkul_adi() {
		return okul_adi;
	}

	public void setOkul_adi(String okul_adi) {
		this.okul_adi = okul_adi;
	}

	public String getB�l�m() {
		return b�l�m;
	}

	public void setB�l�m(String b�l�m) {
		this.b�l�m = b�l�m;
	}
	

}
