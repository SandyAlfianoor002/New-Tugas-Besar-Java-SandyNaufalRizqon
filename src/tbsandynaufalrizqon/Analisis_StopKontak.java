/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbsandynaufalrizqon;

import java.util.Scanner;

/**
 *
 * @author Muhammad Sandy Alfianoor
 */
public abstract class Analisis_StopKontak implements Warisan_jumlah_kondisi_posisi_sarana{
    
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
        System.out.println("\nMasukkan Jumlah Stop Kontak : ");
            jumlah = input.nextInt();
            if(jumlah >= 4){
            return 1;
            }
            else{
            return 0;
            }
    }

    @Override
    public int analyticKondisi() {
        System.out.println("\nMasukkan Kondisi Stop Kontak : ");
            kondisi = input.next();
            if(kondisi.equals("BAIK")){
            return 1;
            }
            else{
            return 0;
            }
    }

    @Override
    public int analyticPosisi() {
        System.out.println("\nMasukkan Posisi Stop Kontak : ");
            posisi = input.next();
            if(posisi.equals("dekatdosen") || posisi.equals("dipojokruangan")){
            return 1; 
            }
            else{
            return 0;
            }
    }

    @Override
    public void show() {
        System.out.println("\nJumlah Stop Kontak : "+jumlah);
	System.out.println("Kondisi Stop Kontak : "+kondisi);
	System.out.println("Posisi Stop Kontak : "+posisi);
    }
}