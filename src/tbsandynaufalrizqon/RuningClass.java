/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
package tbsandynaufalrizqon;

/**
 *
 * @author Sand
 */
package tbsandynaufalrizqon;
public class RuningClass {
    public static void main (String [] Naufal_Rizqon_Sandy){
     
        Warisan_jumlah_kondisi_posisi_sarana STK = new Analisis_StopKontak();
        Warisan_jumlah_kondisi_posisi_sarana LCD = new Analisis_LCD();
        Warisan_jumlah_kondisi_posisi_sarana KPA = new Analisis_KipasAngin();
        Warisan_jumlah_kondisi_posisi_sarana LAM = new Analisis_Lampu();
        Warisan_jumlah_kondisi_posisi_sarana AC = new Analisis_AC();
        Warisan_jumlah_kondisi_posisi_sarana CCTV = new Analisis_CCTV();
        
        Warisan_jumlah_kondisi_posisi_sarana fasilitas [] = { STK, LCD, KPA, LAM, AC, CCTV};
        
        for(Warisan_jumlah_kondisi_posisi_sarana go : fasilitas){
    
            go.Input("");
            go.Lihat("");
            
            
		//play.IdentitasRuangKelas();
		//play.LingkunganRuangKelas();
		//play.KebersihanRuangKelas();
		//play.KenyamananRuangKelas();
		//play.KeamananRuangKelas();
	
    
    
        }
        }
}
