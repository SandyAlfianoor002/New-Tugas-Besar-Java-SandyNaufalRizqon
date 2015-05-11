/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbsandynaufalrizqon;

/**
 *
 * @author Ahmad Naufal/
 */
public class Analisis_KipasAngin extends Warisan_jumlah_kondisi_posisi_sarana{
    
    public Analisis_KipasAngin(){
        System.out.println("\nKipas Angin");
        Input();
        Lihat();
    }
    public String Analisis(){
    //KIPAS ANGIN
		System.out.println("\t*Analisis Kipas Angin*");
		if(jumlah== 2){
			System.out.println("Jumlah Kipas Angin Sesuai");
		}
		else{
			System.out.println("Jumlah Kipas Angin Tidak Sesuai");
		}
		if(kondisi.equals("BAIK") && jumlah== 2){
			System.out.println("Kondisi Kipas Angin Sesuai");
		}
		else{
			System.out.println("Kondisi Kipas Angin Tidak Sesuai");
		}
		if(posisi.equals("atap ruangan")){
			System.out.println("Posisi Kipas Angin Sesuai");
		}
		else{
			System.out.println("Posisi Kipas Angin Tidak Sesuai");
		}
                return Analisis();
}
}