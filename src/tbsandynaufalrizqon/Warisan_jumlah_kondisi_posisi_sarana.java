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
    
    public void Input(){
        System.out.println("Masukkan Jumlah : ");
        jumlah = input.nextInt();
        System.out.println("Kondisi nya : ");
        kondisi = input.next();
        System.out.println("Posisi nya : ");
        posisi = input.next();
    }
    
    public void Lihat(){
        System.out.println("\nJumlah nya : "+jumlah);
        System.out.println("Kondisi nya : "+kondisi);
        System.out.println("Posisi nya : "+posisi);
    }
}
