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
     
        LogicKelas a = new LogicKelas();
                a.IdentitasRuangKelas();
                a.KondisiRuangKelas();
  
            Analisis_StopKontak sk = new Analisis_StopKontak() {};
		sk.analyticJumlah();
		sk.analyticKondisi();
		sk.analyticPosisi();
		sk.show(); 
     
            Analisis_LCD lcd = new Analisis_LCD() {};
		lcd.analyticJumlah();
		lcd.analyticKondisi();
		lcd.analyticPosisi();
		lcd.show(); 
             
            Analisis_Lampu lp = new Analisis_Lampu() {};
		lp.analyticJumlah();
                lp.analyticKondisi();
		lp.analyticPosisi();
		lp.show();
              
            Analisis_KipasAngin ka = new Analisis_KipasAngin() {};
		ka.analyticJumlah();
		ka.analyticKondisi();
		ka.analyticPosisi();
		ka.show();
                
            Analisis_AC ac = new Analisis_AC() {};
		ac.analyticJumlah();
                ac.analyticKondisi();
		ac.analyticPosisi();
		ac.show();

            Analisis_CCTV cctv = new Analisis_CCTV() {};
		cctv.analyticJumlah();
		cctv.analyticKondisi();
		cctv.analyticPosisi();
		cctv.show();

            LogicKelas b = new LogicKelas();
                b.LingkunganRuangKelas();
                b.KebersihanRuangKelas();
                b.KenyamananRuangKelas();
                b.KeamananRuangKelas();   
                
          /*
            LingkunganRuangKelas lrk = new LingkunganRuangKelas ();
		lrk.input();
		lrk.view();
		lrk.analisis();
                
            KenyamananRuangKelas nrk = new KenyamananRuangKelas();
 		nrk.input();
		nrk.view();
		nrk.analisis();           
            KebersihanRuangKelas brk = new KebersihanRuangKelas();
 		brk.input();
                brk.view();
		brk.analisis();           
            KeamananRuangKelas amk = new KeamananRuangKelas();
 		amk.input();
		amk.view();
		amk.analisis();    
                  */
    }
}
