package com.proje.test;



import java.util.ArrayList;
import java.util.List;

import com.proje.model.BankFactory;
import com.proje.model.Müsteri;
import com.proje.model.Müsteri.Builder;
import com.proje.model.müsteri_adres_bilgileri;
import com.proje.model.müsteri_hesap_bilgileri;
import com.proje.model.ziraat_bankasi;
import com.proje.model.ögrenci;

import hibernate.müsteriRepository;
import hibernate.müsteriRepositoryImpl;

public class test {
	public static void main(String[] args) {
		
		müsteriRepository mus=new müsteriRepositoryImpl();
		List<String> phonenumbers=new ArrayList<>();
		phonenumbers.add("5455644280");
		phonenumbers.add("5455644786");
		
		müsteri_adres_bilgileri adres=new müsteri_adres_bilgileri("Türkiye","Ankara","Fatih Mahallesi","Hüsrev Sokak");
		müsteri_hesap_bilgileri hesap_bilgi=new müsteri_hesap_bilgileri(12366,1500,300);
		Müsteri z=new Müsteri.Builder("Bilal").müsteri_adres_bilgileri(adres).müsteri_hesap_bilgileri(hesap_bilgi).araba_sayisi(15).tel_no(phonenumbers).build();
		
		
		mus.save(z);
		
		System.out.print(z);
		
	}
	
}

