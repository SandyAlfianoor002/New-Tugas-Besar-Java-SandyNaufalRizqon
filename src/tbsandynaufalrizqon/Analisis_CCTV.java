/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbsandynaufalrizqon;

import java.util.Scanner;

/**
 *
 * @author Ahmad Naufal
 */
public abstract class Analisis_CCTV implements Warisan_jumlah_kondisi_posisi_sarana {

    Scanner input = new Scanner(System.in);
        private int jumlah;
        private String kondisi;
        private String posisi;

        public void setJumlah(int jumlah){
            this.jumlah = jumlah;
        }
        public int getJumlah(){
            return jumlah;
        }
        public void setKondisi(String kondisi){
            this.kondisi = kondisi;
        }
        public String getKondisi(){
            return kondisi;
        }
        public void setPosisi(String posisi){
            this.posisi= posisi;
        }
        public String getPosisi(){
            return posisi;
        }

    @Override
    public int analyticJumlah() {
        System.out.println("\nMasukkan Jumlah CCTV:");
            jumlah = input.nextInt();
            if(jumlah == 2){
       
            return 1;
            }
            else {
 
            return 0;
            }               
    }
      
    @Override
    public int analyticKondisi() {
        System.out.println("\nMasukkan Kondisi CCTV : ");
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
        System.out.println("\nMasukkan Posisi CCTV : ");
            posisi = input.next();
            if (posisi.equals("dibelakang") || posisi.equals("disamping")){
       
            return 1;
            }
            else{
     
            return 0;
            }
    }

    @Override
    public void show() {
        System.out.println("\nJumlah CCTV :"+jumlah);
        System.out.println("Kondisi CCTV : "+kondisi);
        System.out.println("Posisi CCTV : "+posisi);
    }  
}
   