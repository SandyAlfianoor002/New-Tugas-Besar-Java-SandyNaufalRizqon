/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbsandynaufalrizqon;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author Yurizal Rizqon Rifani
 */
public class SavingObject {
    InstanceClass kelas = new InstanceClass();
        LogicKelas a = new LogicKelas();
        Analisis_StopKontak sk = new Analisis_StopKontak(){};
        Analisis_LCD lcd = new Analisis_LCD() {};     
        Analisis_Lampu lp = new Analisis_Lampu() {};      
        Analisis_KipasAngin ka = new Analisis_KipasAngin() {};        
        Analisis_AC ac = new Analisis_AC() {};
        Analisis_CCTV cctv = new Analisis_CCTV() {};
        LogicKelas b = new LogicKelas();
                
        LingkunganRuangKelas lrk = new LingkunganRuangKelas ();
	KenyamananRuangKelas nrk = new KenyamananRuangKelas();
	KebersihanRuangKelas brk = new KebersihanRuangKelas();
	KeamananRuangKelas amk = new KeamananRuangKelas();
	
    public void saveIdentitasRuangKelas(){
        String namafile = "identitaskelas.txt";
            try{
            try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile))) {
                os.writeObject("nama ruang : "+kelas.getNamaRuang[0]);
                os.writeObject("lokasi ruang : "+kelas.getLokasiRuang[0]);
            }
	}
	catch(FileNotFoundException e){
	}
	catch(Exception e){
	}
	}
	
    public void saveKondisiRuangKelas(){
        String namafile = "kondisikelas.txt";
            try{
            try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile))) {
                os.writeObject("panjang kelas : "+kelas.getPanjangRuangKelas());
                os.writeObject("lebar kelas : "+kelas.getLebarRuang());
                os.writeObject("jumlah kursi : "+kelas.getJumlahKursi());
                os.writeObject("jumlah pintu : "+kelas.getJumlahPintu());
                os.writeObject("jumlah jendela : "+kelas.getJumlahJendela());
            }
        }
	catch(FileNotFoundException e){
	}
	catch(Exception e){
	}
    }
	
    public void saveStopKontak(){
	String namafile = "stopkontak.txt";
            try{
            try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile))) {
                os.writeObject("jumlah stop kontak : "+sk.analyticJumlah());
                os.writeObject("kondisi stop kontak : "+sk.analyticKondisi());
                os.writeObject("posisi stop kontak : "+sk.analyticPosisi());
            }
	}
	catch(FileNotFoundException e){
	}
	catch(Exception e){
	}
    }

    public void saveKabelLCD(){
	String namafile = "kabelLCD.txt";
            try{
            try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile))) {
                os.writeObject("jumlah Kabel LCD : "+lcd.analyticJumlah());
                os.writeObject("kondisi Kabel LCD : "+lcd.analyticKondisi());
                os.writeObject("posisi Kabel LCD : "+lcd.analyticPosisi());
            }
	}
	catch(FileNotFoundException e){
	}
	catch(Exception e){
	}
    }
	
    public void saveLampu(){
	String namafile = "lampu.txt";
            try{
            try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile))) {
                os.writeObject("jumlah Lampu : "+lp.analyticJumlah());
                os.writeObject("kondisi Lampu : "+lp.analyticKondisi());
                os.writeObject("posisi Lampu : "+lp.analyticPosisi());
            }
	}
	catch(FileNotFoundException e){
	}
	catch(Exception e){
	}
    }
	public void saveKipasAngin(){
            String namafile = "kipasAngin.txt";
		try{
                try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile))) {
                    os.writeObject("jumlah Kipas angin : "+ka.analyticJumlah());
                    os.writeObject("kondisi Kipas angin : "+ka.analyticKondisi());
                    os.writeObject("posisi Kipas angin : "+ka.analyticPosisi());
            }
        }
	catch(FileNotFoundException e){
	}
	catch(Exception e){
	}
    }
	
    public void saveAC(){
        String namafile = "AC.txt";
            try{
            try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile))) {
                os.writeObject("jumlah AC : "+ac.analyticJumlah());
                os.writeObject("kondisi AC : "+ac.analyticKondisi());
                os.writeObject("posisi AC : "+ac.analyticPosisi());
            }
	}
	catch(FileNotFoundException e){
	}
	catch(Exception e){
	}
    }

    public void saveCCTV(){
	String namafile = "CCTV.txt";
            try{
            try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile))) {
                os.writeObject("jumlah CCTV : "+cctv.analyticJumlah());
                os.writeObject("kondisi CCTV : "+cctv.analyticKondisi());
                os.writeObject("posisi CCTV : "+cctv.analyticPosisi());
            }
	}
	catch(FileNotFoundException e){
	}
	catch(Exception e){
	}
    }

    public void saveLingkunganRuangKelas(){
	String namafile = "LingkunganRuangKelas.txt";
            try{
            try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile))) {
                os.writeObject("kondisi lantai : "+kelas.getKondisiLantai());
                os.writeObject("kondisi dinding : "+kelas.getKondisiDinding());
                os.writeObject("kondisi atap : "+kelas.getKondisiAtap());
                os.writeObject("kondisi pintu : "+kelas.getKondisiPintu());
                os.writeObject("kondisi jendela : "+kelas.getKondisiJendela());
            }
	}
	catch(FileNotFoundException e){
	}
	catch(Exception e){
	}
    }

    public void saveKenyamananRuangKelas(){
	String namafile = "KenyamananRuangKelas.txt";
            try{
            try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile))) {
                os.writeObject("kebisingan : "+kelas.Kebisingan());
                os.writeObject("bau : "+kelas.getBau());
                os.writeObject("kebocoran : "+kelas.getKebocoran());
                os.writeObject("kerusakan : "+kelas.getKerusakan());
                os.writeObject("keausan : "+kelas.getKeausan());
            }
	}
	catch(FileNotFoundException e){
	}
	catch(Exception e){
	}
    }
	
    public void saveKebersihanRuangKelas(){
	String namafile = "KebersihanRuangKelas.txt";
            try{
            try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile))) {
                os.writeObject("sirkulasi udara : "+kelas.getSirkulasiUdara());
                os.writeObject("nilai pencahayaan: "+kelas.getNilaiPencahayaan());
                os.writeObject("kelembapan : "+kelas.getKelembapan());
                os.writeObject("suhu : "+kelas.getSuhu());
            }
	}
	catch(FileNotFoundException e){
	}
	catch(Exception e){
	}
    }
	
    public void saveKeamananRuangKelas(){
	String namafile = "kipasAngin.txt";
            try{
            try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile))) {
                os.writeObject("kekokohan : "+kelas.getKekokohan());
                os.writeObject("kunci pintu dan jendela : "+kelas.getKunciPintuDanJendela());
                os.writeObject("bahaya : "+kelas.getBahaya());
            }
	}
	catch(FileNotFoundException e){
	}
	catch(Exception e){
	}
    }
}
