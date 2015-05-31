/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbsandynaufalrizqon;

/**
 *
 * @author Sand
 */
public class Analisis_Lampu extends Warisan_jumlah_kondisi_posisi_sarana{
    
    public Analisis_Lampu(){
        System.out.println("\nLampu");
        Input("Lampu");
        Lihat("Lampu");
    }
    public String Analisis(){
        //LAMPU
		System.out.println("\t*Analisis Lampu*");
		if(jumlah>=18){
			System.out.println("Jumlah Lampu Sesuai");
		}
		else{
			System.out.println("Jumlah Lampu Tidak Sesuai");
		}
		if(kondisi.equals("BAIK")&& jumlah == 18){
			System.out.println("Kondisi Lampu Sesuai");
		}
		else{
			System.out.println("Kondisi Lampu Tidak Sesuai");
		}
		if(posisi.equals("atap ruangan")){
			System.out.println("Posisi Lampu Sesuai");
		}
		else{
			System.out.println("Posisi Lampu Tidak Sesuai");
		}
		return Analisis();
		
}
}
