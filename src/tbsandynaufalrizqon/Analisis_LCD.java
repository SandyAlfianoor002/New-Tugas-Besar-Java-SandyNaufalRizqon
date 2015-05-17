/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbsandynaufalrizqon;

/**
 *
 * @author Muhammad Sandy Alfianoor
 */
public class Analisis_LCD extends Warisan_jumlah_kondisi_posisi_sarana {
    

public Analisis_LCD(){
    System.out.println("\nAnalisis LCD");
    Input("Kabel LCD");
    Lihat("Kabel LCD");
}
//LCD
    
    public String Analisis(){
		System.out.println("\t*Analisis LCD*");
		if(jumlah>=1){
			System.out.println("Jumlah Kabel LCD Sesuai"); 
		}
		else{
			System.out.println("Jumlah Kabel LCD Tidak Sesuai");
		}
		if(kondisi.equals("Berfungsi")){
			System.out.println("Kondisi Kabel LCD Sesuai"); 
		}
		else{
			System.out.println("Kondisi Kabel LCD Tidak Sesuai");
		}
		if(posisi.equals("Dekat Dosen")){
			System.out.println("Posisi Kabel LCD Sesuai");
		}
		else{
			System.out.println("Posisi Kabel LCD Tidak Sesuai");
		}
                return Analisis();
}
}