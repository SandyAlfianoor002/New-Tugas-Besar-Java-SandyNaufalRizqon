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
        
        
        Analisis_StopKontak SK = new Analisis_StopKontak();
        SK.Analisis();
        
        Analisis_LCD proyektor = new Analisis_LCD();
        proyektor.Analisis();
        
        Analisis_KipasAngin KA = new Analisis_KipasAngin();
        KA.Analisis();
        
        Analisis_CCTV pantau = new Analisis_CCTV();
        pantau.Analisis();
        
        Analisis_Lampu terang = new Analisis_Lampu();
        terang.Analisis();
        
        Analisis_AC suhu = new Analisis_AC();
        suhu.Analisis();
        
        LogicKelas play = new LogicKelas();
		//play.IdentitasRuangKelas();
		//play.LingkunganRuangKelas();
		//play.KebersihanRuangKelas();
		//play.KenyamananRuangKelas();
		//play.KeamananRuangKelas();
	}
    
    
    

}
