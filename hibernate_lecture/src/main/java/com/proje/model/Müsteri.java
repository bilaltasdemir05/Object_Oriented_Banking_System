package com.proje.model;

import java.util.List;

import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Müsteri {// Encapsulation and builder design pattern
	private int yas;
	private String isim;
	private String soyisim;
	private int dogum_yili;
	private String cinsiyet;
	private int ev_sayisi;
	private int araba_sayisi;
	private int arsa_sayisi;
	private String medeni_hal;
	private int cocuk_sayisi;
	private int maas;
	private String meslek;
	private String banka_ismi;
	
	@ElementCollection //ayrı bir tablo oluşturup her müsteri için telefon  numarasını kaydeder
	@CollectionTable(name="müsteri_phoneNumber",joinColumns=@JoinColumn(name="personelId"))// yeni tablonun adı müsteri_phoneNumber, foreignkey=personelId
	@Column(name="phoneNumber",length=11)
	private List<String> tel_no;
	
	@Embedded //bu classın değişkenleri de aynı tabloya kaydedilsin
	private müsteri_hesap_bilgileri müsteri_hesap_bilgileri;
	
	@Embedded 
	@AttributeOverrides({
		@AttributeOverride(name="ülke", column=@Column(name="country",length=11)),//ülkeyi cuntry olarak değiştirir
		@AttributeOverride(name="sehir",column=@Column(name="city",length=18,nullable=true,unique=true))
	})
	private müsteri_adres_bilgileri müsteri_adres_bilgileri;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//////////////////////////////////////////////////////////////////////////////////////////
		
	public müsteri_adres_bilgileri getMüsteri_adres_bilgileri() {
		return müsteri_adres_bilgileri;
	}
	
	public müsteri_hesap_bilgileri getMüsteri_hesap_bilgileri() {
		return müsteri_hesap_bilgileri;
	}

	public void setMüsteri_hesap_bilgileri(müsteri_hesap_bilgileri müsteri_hesap_bilgileri) {
		this.müsteri_hesap_bilgileri = müsteri_hesap_bilgileri;
	}

	public void setMüsteri_adres_bilgileri(müsteri_adres_bilgileri müsteri_adres_bilgileri) {
		this.müsteri_adres_bilgileri = müsteri_adres_bilgileri;
	}
	
	public String getBanka_ismi() {
		return banka_ismi;
	}
	public void setBanka_ismi(String banka_ismi) {
		this.banka_ismi = banka_ismi;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	public String getMeslek() {
		return meslek;
	}
	public void setMeslek(String meslek) {
		this.meslek = meslek;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public int getDogum_yili() {
		return dogum_yili;
	}
	public void setDogum_yili(int dogum_yili) {
		this.dogum_yili = dogum_yili;
	}
	public int getEv_sayisi() {
		return ev_sayisi;
	}
	public void setEv_sayisi(int ev_sayisi) {
		this.ev_sayisi = ev_sayisi;
	}
	public int getAraba_sayisi() {
		return araba_sayisi;
	}
	public void setAraba_sayisi(int araba_sayisi) {
		this.araba_sayisi = araba_sayisi;
	}
	public int getArsa_sayisi() {
		return arsa_sayisi;
	}
	public void setArsa_sayisi(int arsa_sayisi) {
		this.arsa_sayisi = arsa_sayisi;
	}
	public String getMedeni_hal() {
		return medeni_hal;
	}
	public void setMedeni_hal(String medeni_hal) {
		this.medeni_hal = medeni_hal;
	}
	public int getCocuk_sayisi() {
		return cocuk_sayisi;
	}
	public void setCocuk_sayisi(int cocuk_sayisi) {
		this.cocuk_sayisi = cocuk_sayisi;
	}
	public List<String> getTel_no() {
		return tel_no;
	}

	public void setTel_no(List<String> tel_no) {
		this.tel_no = tel_no;
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public String toString() {
		return "Müsteri [yas=" + yas + ", isim=" + isim + ", soyisim=" + soyisim + ", dogum_yili=" + dogum_yili
				+ ", cinsiyet=" + cinsiyet + ", ev_sayisi=" + ev_sayisi + ", araba_sayisi=" + araba_sayisi
				+ ", arsa_sayisi=" + arsa_sayisi + ", medeni_hal=" + medeni_hal + ", cocuk_sayisi=" + cocuk_sayisi
				+ ", maas=" + maas + ", meslek=" + meslek + ", banka_ismi=" + banka_ismi + ", tel_no=" + tel_no
				+ ", müsteri_hesap_bilgileri=" + müsteri_hesap_bilgileri + ", müsteri_adres_bilgileri="
				+ müsteri_adres_bilgileri + ", id=" + id + "]";
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	public static class Builder{
		
		
		private int yas;
		private String cinsiyet;			
		private int maas;
		private String meslek;
		private String isim;
		private String soyisim;
		private int dogum_yili;
		private int ev_sayisi;
		private int araba_sayisi;
		private int arsa_sayisi;
		private String medeni_hal;
		private int cocuk_sayisi;
		private String banka_ismi;
		private List<String> tel_no;
		private müsteri_hesap_bilgileri müsteri_hesap_bilgileri;
		private müsteri_adres_bilgileri müsteri_adres_bilgileri;
		
		public Builder(String isim) {
			this.isim=isim;
		}
		public Builder tel_no(List z) {
			tel_no=z;
			return this;
		}
		public Builder cinsiyet(String y) {
			cinsiyet=y;
			return this;
		}
		public Builder maas(int z) {
			maas=z;
			return this;
		}
		public Builder meslek(String z) {
			meslek=z;
			return this;
		}
		public Builder yas(int z) {
			yas=z;
			return this;
		}
		public Builder soyisim(String z) {
			soyisim=z;
			return this;
		}
		public Builder dogum_yili(int z) {
			dogum_yili=z;
			return this;
		}
		public Builder ev_sayisi(int z) {
			ev_sayisi=z;
			return this;
		}
		public Builder araba_sayisi(int z) {
			araba_sayisi=z;
			return this;
		}
		public Builder arsa_sayisi(int z) {
			arsa_sayisi=z;
			return this;
		}
		public Builder medeni_hal(String z) {
			medeni_hal=z;
			return this;
		}
		public Builder cocuk_sayisi(int z) {
			cocuk_sayisi=z;
			return this;
		}
		public Builder müsteri_hesap_bilgileri(müsteri_hesap_bilgileri z) {
			müsteri_hesap_bilgileri=z;
			return this;
		}
		public Builder müsteri_adres_bilgileri(müsteri_adres_bilgileri z) {
			müsteri_adres_bilgileri=z;
			return this;
		}
		public Builder banka_ismi(String z) {
			banka_ismi=z;
			if(banka_ismi.equals("Ziraat")) {
				try {
					ziraat_bankasi ziraat=(ziraat_bankasi) BankFactory.createBanka(ziraat_bankasi.class);
					ziraat.müsteri_sayisi();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			return this;
		}
		public Müsteri build() {
			return new Müsteri(this);
			
		}
		public ögrenci build_ögrenci() {
			return new ögrenci(this);
			
		}
		public emekli build_emekli() {
			return new emekli(this);
			
		}
	}
	public Müsteri(Builder builder) {// Constructor for Müsteri Class
		tel_no=builder.tel_no;
		yas=builder.yas;
		cinsiyet=builder.cinsiyet;
		maas=builder.maas;
		meslek=builder.meslek;
		isim=builder.isim;
		soyisim=builder.soyisim;
		dogum_yili=builder.dogum_yili;
		ev_sayisi=builder.ev_sayisi;
		araba_sayisi=builder.araba_sayisi;
		arsa_sayisi=builder.arsa_sayisi;
		medeni_hal=builder.medeni_hal;
		cocuk_sayisi=builder.cocuk_sayisi;
		banka_ismi=builder.banka_ismi;
		müsteri_hesap_bilgileri=builder.müsteri_hesap_bilgileri;
		müsteri_adres_bilgileri=builder.müsteri_adres_bilgileri;
		
	}
}
