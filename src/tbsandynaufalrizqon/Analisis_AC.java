/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbsandynaufalrizqon;

/**
 *
 * @author Yurizal Rizqon Rifani
 */
public class Analisis_AC extends Warisan_jumlah_kondisi_posisi_sarana{
    
    public Analisis_AC(){
        System.out.println("\nAC");
        Input("AC");
        Lihat("AC");
    }
    public String Analisis(){
        //AC
		System.out.println("\t*Analisis AC*");
		if(jumlah >= 1){
			System.out.println("Jumlah AC Sesuai");
		}
		else{
			System.out.println("Jumlah AC Tidak Sesuai");
		}
		if(kondisi.equals("BAIK")){
			System.out.println("Kondisi AC Sesuai");
		}
		else{
			System.out.println("Kondisi AC Tidak Sesuai");
		}
		if(posisi.equals("didepan")||posisi.equals("dibelakang")){
			System.out.println("Posisi AC Sesuai");
		}
		else{
			System.out.println("Posisi AC Tidak Sesuai");
		}
                return Analisis();
    }
}
