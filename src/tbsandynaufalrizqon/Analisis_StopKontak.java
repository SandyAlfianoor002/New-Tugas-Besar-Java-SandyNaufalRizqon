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
public class Analisis_StopKontak extends Warisan_jumlah_kondisi_posisi_sarana{
    
    public Analisis_StopKontak(){
        System.out.println("\nSTOP KONTAK");
        Input("Stop Kontak");
        Lihat("Stop Kontak");
    }
    
    //STOP KONTAK
    public void Analisis(){
		System.out.println("\n\t*Analisis StopKontak*");
		
		if (jumlah >= 4){
			System.out.println("Jumlah Stop Kontak Sesuai"); 
		}
		else if(jumlah  <4){
			System.out.println("Jumlah Stop Kontak Tidak Sesuai");
		}
		if(kondisi.equals("Baik") && jumlah ==4){
			System.out.println("Kondisi Stop Kontak Sesuai"); 
		}
		else{
			System.out.println("Kondisi Stop Kontak Tidak Sesuai");
		}
		if(posisi.equals("DekatDosen") || posisi.equals("DipojokRuangan")){
			System.out.println("Posisi Stop Kontak Sesuai");
		}
		else{
			System.out.println("Posisi Stop Kontak Tidak Sesuai");
		}
                
    }
}