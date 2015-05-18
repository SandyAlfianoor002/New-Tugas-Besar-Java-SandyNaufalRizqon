/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbsandynaufalrizqon;

/**
 *
 * @author Ahmad Naufal
 */
public class Analisis_CCTV extends Warisan_jumlah_kondisi_posisi_sarana {

    public Analisis_CCTV(){
        System.out.println("\nCCTV");
        Input("CCTV");
        Lihat("CCTV");
    
}
    public String Analisis(){
        //CCTV
		System.out.println("\t*Analisis CCTV*");
		if(jumlah == 2){
			System.out.println("Jumlah CCTV Sesuai");
		}
		else{
			System.out.println("Jumlah CCTV Tidak Sesuai");
		}
		if(kondisi.equals("BAIK")){
			System.out.println("Kondisi CCTV Sesuai");
		}
		else{
			System.out.println("Kondisi CCTV Tidak Sesuai");
		}
		if(posisi.equals("dibelakang")||posisi.equals("disamping")){
			System.out.println("Posisi CCTV Sesuai");
		}
		else{
			System.out.println("Posisi CCTV Tidak Sesuai");
                        
		}
                return Analisis();
    }
}
