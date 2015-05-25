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
public class Analisis_LCD implements Warisan_jumlah_kondisi_posisi_sarana {
    
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
        System.out.println("masukkan jumlah Kabel LCD : ");
		jumlah = input.nextInt();
		if(jumlah >= 1){
			return 1;
		}
		else{
			return 0;
		}
    }

    @Override
    public int analyticKondisi() {
        System.out.println("masukkan kondisi Kabel LCD : ");
		posisi = input.next();
		if(kondisi.equals("berfungsi")){
			return 1;
		}
		else{
			return 0;
		}
    }

    @Override
    public int analyticPosisi() {
        System.out.println("masukkan posisi Kabel LCD : ");
		posisi = input.next();
		if(posisi.equals("dekat_dosen")){
			return 1;
		}
		else{
			return 0;
		}
    }

    @Override
    public void show() {
        System.out.println("jumlah Kabel LCD : "+jumlah);
		System.out.println("kondisi Kabel LCD : "+kondisi);
		System.out.println("posisi Kabel LCD : "+posisi);
    }
}