package com.proje.test;



import java.util.ArrayList;
import java.util.List;

import com.proje.model.BankFactory;
import com.proje.model.M�steri;
import com.proje.model.M�steri.Builder;
import com.proje.model.m�steri_adres_bilgileri;
import com.proje.model.m�steri_hesap_bilgileri;
import com.proje.model.ziraat_bankasi;
import com.proje.model.�grenci;

import hibernate.m�steriRepository;
import hibernate.m�steriRepositoryImpl;

public class test {
	public static void main(String[] args) {
		
		m�steriRepository mus=new m�steriRepositoryImpl();
		List<String> phonenumbers=new ArrayList<>();
		phonenumbers.add("5455644280");
		phonenumbers.add("5455644786");
		
		m�steri_adres_bilgileri adres=new m�steri_adres_bilgileri("T�rkiye","Ankara","Fatih Mahallesi","H�srev Sokak");
		m�steri_hesap_bilgileri hesap_bilgi=new m�steri_hesap_bilgileri(12366,1500,300);
		M�steri z=new M�steri.Builder("Bilal").m�steri_adres_bilgileri(adres).m�steri_hesap_bilgileri(hesap_bilgi).araba_sayisi(15).tel_no(phonenumbers).build();
		
		
		mus.save(z);
		
		System.out.print(z);
		
	}
	
}

