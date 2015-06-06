/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbsandynaufalrizqon;

import java.util.Scanner;

/**
 *
 * @author Ahmad Naufal
 */
public abstract class Analisis_KipasAngin implements Warisan_jumlah_kondisi_posisi_sarana{
    
    Scanner input = new Scanner (System.in);
    private int jumlah;
    private String kondisi;
    private String posisi;

    public int getJumlah() {
		return jumlah;
	}
	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}
	public String getKondisi() {
		return kondisi;
	}
	public void setKondisi(String kondisi) {
		this.kondisi = kondisi;
	}
	public String getPosisi() {
		return posisi;
	}
	public void setPosisi(String posisi) {
		this.posisi = posisi;
	}

    @Override
    public int analyticJumlah() {
        System.out.println("masukkan jumlah Kipas Angin : ");
		jumlah = input.nextInt();
		if(jumlah >= 2){
			return 1;
		}
		else{
			return 0;
		}
    }

    @Override
    public int analyticKondisi() {
        System.out.println("masukkan kondisi Kipas Angin : ");
		kondisi = input.next();
		if(kondisi.equals("baik") && jumlah == 2){
			return 1;
		}
		else{
			return 0 ;
		}
    }

    @Override
    public int analyticPosisi() {
        System.out.println("masukkan posisi Kipas Angin: ");
		posisi = input.next();
		if(posisi.equals("atap_ruangan")){
			return 1;
		}
		else{
			return 0;
		}
    }

    @Override
    public void show() {
       System.out.println("jumlah Kipas Angin : "+jumlah);
		System.out.println("kondisi Kipas Angin : "+kondisi);
		System.out.println("posisi Kipas Angin : "+posisi);
    }
    
}