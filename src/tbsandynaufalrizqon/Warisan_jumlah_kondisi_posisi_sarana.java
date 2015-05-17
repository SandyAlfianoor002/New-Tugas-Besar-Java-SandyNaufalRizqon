/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbsandynaufalrizqon;
import java.util.*;
/**
 *
 * @author Sand
 */
public class Warisan_jumlah_kondisi_posisi_sarana {
    Scanner input = new Scanner(System.in);
    int jumlah;
    String kondisi;
    String posisi;
    String fasilitas;
    
    public void Input(String fasilitas){
        this.fasilitas = fasilitas;
        System.out.println("Masukkan Jumlah "+fasilitas+": ");
        jumlah = input.nextInt();
        System.out.println("Kondisi nya "+fasilitas+": ");
        kondisi = input.next();
        System.out.println("Posisi nya  "+fasilitas+": ");
        posisi = input.next();
    }
    
    public void Lihat(String fasilitas){
        this.fasilitas = fasilitas;
        System.out.println("\nJumlah nya"+fasilitas+": "+jumlah);
        System.out.println("Kondisi nya "+fasilitas+": "+kondisi);
        System.out.println("Posisi nya "+fasilitas+": "+posisi);
    }
}
