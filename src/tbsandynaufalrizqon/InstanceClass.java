/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbsandynaufalrizqon;

import java.util.Scanner;

/**
 *

 */
public class InstanceClass extends Warisan_jumlah_kondisi_posisi_sarana {
	
	
	//IdentitasRuangKelas
		private String NamaRuang;
		private String LokasiRuang;
		int ProgramSF;
			
		void setNamaRuang(String NR) {
			this.NamaRuang = NR;
		}
		String getNamaRuang () {
			return NamaRuang;
		}
		void setLokasiRuang(String LR) {
			this.LokasiRuang = LR;
		}
		String getLokasiRuang () {
			return LokasiRuang;
		}
		
	//KondisiRuangKelas
		private int PanjangRuangKelas;
		private int LebarRuang;
		private int JumlahKursi;
		private int JumlahPintu;
		private int JumlahJendela;
		
		public void inputKondisiRuangKelas(){
			System.out.print("\nMasukkan Panjang Kelas : ");
			PanjangRuangKelas = input.nextInt();
			System.out.print("Masukkan Lebar Kelas : ");
			LebarRuang = input.nextInt();
			System.out.print("Masukkan Jumlah Kursi : ");
			JumlahKursi = input.nextInt();
			System.out.print("Masukkan Jumlah Pintu : ");
			JumlahPintu = input.nextInt();
			System.out.print("Masukkan Jumlah Jendela : ");
			JumlahJendela = input.nextInt();
			System.out.print("\nluas kelas : "+luas());
			System.out.print("\nrasio luas kelas : "+rasioLuas());	
		}
		
		public void setPanjangRuangKelas(int panjangRuangKelas) {
			PanjangRuangKelas = panjangRuangKelas;
		}
		public int getPanjangRuangKelas() {
			return PanjangRuangKelas;
		}
		public void setLebarRuang(int lebarRuang) {
			LebarRuang = lebarRuang;
		}
		public int getLebarRuang() {
			return LebarRuang;
		}
		public void setJumlahKursi(int jumlahKursi) {
			JumlahKursi = jumlahKursi;
		}
		public int getJumlahKursi() {
			return JumlahKursi;
		}
		public void setJumlahPintu(int jumlahPintu) {
			JumlahPintu = jumlahPintu;
		}
		public int getJumlahPintu() {
			return JumlahPintu;
		}
		public void setJumlahJendela(int jumlahJendela) {
			JumlahJendela = jumlahJendela;
		}
		public int getJumlahJendela() {
			return JumlahJendela;
		}
	
	//KondisidanPosisiSarana 
		private int JumlahStopKontak;
		private String KondisiStopKontak;
		private String PosisiStopKontak;
		private int JumlahKabelLCD;
		private String KondisiKabelLCD;
		private String PosisiKabelLCD;
		private int JumlahLampu;
		private String KondisiLampu;
		private String PosisiLampu;
		private int JumlahKipasAngin;
		private String KondisiKipasAngin;
		private String PosisiKipasAngin;
		private int JumlahAC;
		private String KondisiAC;
		private String PosisiAC;
		private String SSID;
		private String Bandwith;
		private int JumlahCCTV;
		private String KondisiCCTV;
		private String PosisiCCTV;
	
		public void jumlahKondisiPosisiSarana(){
			//Stop kontak
			System.out.print("\n~ Masukkan Jumlah Stop Kontak : ");
			JumlahStopKontak = input.nextInt();
			System.out.println("\nBaik (4 stop kontak baik)");
			System.out.println("Rusak (ada salah satu yang rusak)");
			System.out.print("\n~ Kondisi Stop Kontak : ");
			KondisiStopKontak = input.next();
			System.out.println("__________________");
			System.out.println("| DekatDosen	 |");
			System.out.println("| DipojokRuangan |");
			System.out.println("| Lainnya	 |");
			System.out.println("------------------");
			System.out.print("\n~ Posisi Stop kontak : ");
			PosisiStopKontak = input.next();

			//Kabel LCD
			System.out.print("\nMasukkan Jumlah Kabel LCD : ");
			JumlahKabelLCD = input.nextInt();
			System.out.print("\n~ Kondisi Kabel LCD : ");
			KondisiKabelLCD = input.next();
			System.out.println("~ Posisi Kabel LCD : ");
			PosisiKabelLCD = input.next();

			//Lampu
			System.out.print("\nMasukkan Jumlah Lampu : ");
			JumlahLampu = input.nextInt();
			System.out.print("kondisi Lampu : ");
			KondisiLampu = input.next();
			System.out.print("posisi Lampu : ");
			PosisiLampu = input.next();

			//Kipas Angin 
			System.out.print("\nMasukkan Jumlah Kipas Angin : ");
			JumlahKipasAngin = input.nextInt();
			System.out.print("kondisi Kipas Angin : ");
			KondisiKipasAngin = input.next();
			System.out.print("posisi Kipas Angin : ");
			PosisiKipasAngin = input.next();

			//AC
			System.out.print("\nMasukkan Jumlah AC : ");
			JumlahAC = input.nextInt();
			System.out.print("kondisi AC : ");
			KondisiAC = input.next();
			System.out.print("posisi AC : ");
			PosisiAC = input.next();

			//CCTV
			System.out.print("\nMasukkan Jumlah CCTV: ");
			JumlahCCTV = input.nextInt();
			System.out.print("kondisi CCTV : ");
			KondisiCCTV = input.next();
			System.out.print("posisi CCTV : ");
			PosisiCCTV = input.next();
		}
		
		//StopKontak
		public void setJumlahStopKontak(int jumlahStopKontak) {
			this.JumlahStopKontak = jumlahStopKontak;
		}
		public int getJumlahStopKontak() {
			return JumlahStopKontak;
		}
		public void setKondisiStopKontak(String kondisiStopKontak) {
			this.KondisiStopKontak = kondisiStopKontak;
		}
		public String getKondisiStopKontak() {
			return KondisiStopKontak;
		}
		public void setPosisiStopKontak(String posisiStopKontak) {
			this.PosisiStopKontak = posisiStopKontak;
		}
		public String getPosisiStopKontak() {
			return PosisiStopKontak;
		}

	
		//KabelLCD
		public void setJumlahKabelLCD(int jumlahKabelLCD) {
			this.JumlahKabelLCD = jumlahKabelLCD;
		}
		public int getJumlahKabelLCD() {
			return JumlahKabelLCD;
		}
		public void setKondisiKabelLCD(String kondisiKabelLCD) {
			this.KondisiKabelLCD = kondisiKabelLCD;
		}
		public String getKondisiKabelLCD() {
			return KondisiKabelLCD;
		}
		public void setPosisiKabelLCD(String posisiKabelLCD) {
			this.PosisiKabelLCD = posisiKabelLCD;
		}
		public String getPosisiKabelLCD() {
			return PosisiKabelLCD;
		}

		
		//KondisiLampu
		public void setJumlahLampu(int jumlahLampu) {
			this.JumlahLampu = jumlahLampu;
		}
		public int getJumlahLampu() {
			return JumlahLampu;
		}
		public void setKondisiLampu(String kondisiLampu) {
			this.KondisiLampu = kondisiLampu;
		}
		public String getKondisiLampu() {
			return KondisiLampu;
		}
		public void setPosisiLampu(String posisiLampu) {
			this.PosisiLampu = posisiLampu;
		}
		public String getPosisiLampu() {
			return PosisiLampu;
		}

	
		//KipasAngin
		public void setJumlahKipasAngin(int jumlahKipasAngin) {
			this.JumlahKipasAngin = jumlahKipasAngin;
		}
		public int getJumlahKipasAngin() {
			return JumlahKipasAngin;
		}
		public void setKondisiKipasAngin(String kondisiKipasAngin) {
			this.KondisiKipasAngin = kondisiKipasAngin;
		}
		public String getKondisiKipasAngin() {
			return KondisiKipasAngin;
		}
		public void setPosisiKipasAngin(String posisiKipasAngin) {
			this.PosisiKipasAngin = posisiKipasAngin;
		}
		public String getPosisiKipasAngin() {
			return PosisiKipasAngin;
		}

	
		//AC
		public void setJumlahAC(int jumlahAC) {
			this.JumlahAC = jumlahAC;
		}
		public int getJumlahAC() {
			return JumlahAC;
		}
		public void setKondisiAC(String kondisiAC) {
			this.KondisiAC = kondisiAC;
		}
		public String getKondisiAC() {
			return KondisiAC;
		}
		public void setPosisiAC(String posisiAC) {
			this.PosisiAC = posisiAC;
		}
		public String getPosisiAC() {
			return PosisiAC;
		}

		
		//SSID
		public void setSSID(String sSID) {
			SSID = sSID;
		}
		public String getSSID() {
			return SSID;
		}
		public void setBandwith(String bandwith) {
			Bandwith = bandwith;
		}
		public String getBandwith() {
			return Bandwith;
		}

		
		//CCTV
		public void setJumlahCCTV(int jumlahCCTV) {
			this.JumlahCCTV = jumlahCCTV;
		}
		public int getJumlahCCTV() {
			return JumlahCCTV;
		}
		public void setKondisiCCTV(String kondisiCCTV) {
			this.KondisiCCTV = kondisiCCTV;
		}
		public String getKondisiCCTV() {
			return KondisiCCTV;
		}
		public void setPosisiCCTV(String posisiCCTV) {
			this.PosisiCCTV = posisiCCTV;
		}
		public String getPosisiCCTV() {
			return PosisiCCTV;
		}

				
	//LingkunganRuangKelas
		private String KondisiLantai;
		private String KondisiDinding;
		private String KondisiAtap;
		private String KondisiPintu;
		private String KondisiJendela;

		void inputLingkunganRuangKelas(){
			System.out.print("\nMasukkan KondisiLantai : ");
			KondisiLantai= input.nextLine();
			System.out.print("\nMasukkan Kondisi Dinding : ");
			KondisiDinding = input.nextLine();
			System.out.print("Masukkan Kondisi Atap : ");
			KondisiAtap = input.nextLine();
			System.out.print("Masukkan Kondisi Pintu : ");
			KondisiPintu = input.nextLine();
			System.out.print("Masukkan Kondisi Jendela : ");
			KondisiJendela = input.nextLine();
		}
		
		public void setKondisiLantai(String kondisiLantai) {
			KondisiLantai = kondisiLantai;
		}
		public String getKondisiLantai() {
			return KondisiLantai;
		}
		public void setKondisiDinding(String kondisiDinding) {
			KondisiDinding = kondisiDinding;
		}
		public String getKondisiDinding() {
			return KondisiDinding;
		}
		public void setKondisiAtap(String kondisiAtap) {
			KondisiAtap = kondisiAtap;
		}
		public String getKondisiAtap() {
			return KondisiAtap;
		}
		public void setKondisiPintu(String kondisiPintu) {
			KondisiPintu = kondisiPintu;
		}
		public String getKondisiPintu() {
			return KondisiPintu;
		}
		public void setKondisiJendela(String kondisiJendela) {
			KondisiJendela = kondisiJendela;
		}
		public String getKondisiJendela() {
			return KondisiJendela;
		}
	
	//KebersihanRuangKelas
		private String SirkulasiUdara;
		private int NilaiPencahayaan;
		private int Kelembapan;
		private int Suhu;
	
		void inputKebersihanRuangKelas(){
			System.out.print("\nMasukkan Sirkulasi Udara : ");
			SirkulasiUdara= input.nextLine();
			System.out.print("Masukkan Nilai Pecahan : ");
			NilaiPencahayaan= input.nextInt();
			System.out.print("Masukkan Kelembapan : ");
			Kelembapan= input.nextInt();
			System.out.print("Masukkan Suhu : ");
			Suhu= input.nextInt();
		}

		public void setSirkulasiUdara(String sirkulasiUdara) {
			SirkulasiUdara = sirkulasiUdara;
		}
		public String getSirkulasiUdara() {
			return SirkulasiUdara;
		}
		public void setNilaiPencahayaan(int nilaiPencahayaan) {
			NilaiPencahayaan = nilaiPencahayaan;
		}
		public int getNilaiPencahayaan() {
			return NilaiPencahayaan;
		}
		public void setKelembapan(int kelembapan) {
			Kelembapan = kelembapan;
		}
		public int getKelembapan() {
			return Kelembapan;
		}
		public void setSuhu(int suhu) {
			Suhu = suhu;
		}
		public int getSuhu() {
			return Suhu;
		}

	//KenyamananRuangKelas	
		private String Kebisingan;
		private String Bau;
		private String Kebocoran;
		private String Kerusakan;
		private String Keausan;
		
		void inputKenyamananRuangKelas(){
			System.out.print("\nMasukkan Kebisingan : ");
			Kebisingan= input.nextLine();
			System.out.print("Masukkan Bau : ");
			Bau= input.nextLine();
			System.out.print("Masukkan Kebocoran : ");
			Kebocoran= input.nextLine();
			System.out.print("Masukkan Kerusakan : ");
			Kerusakan = input.nextLine();
			System.out.print("Masukkan Keausan : ");
			Keausan = input.nextLine();
		}
		
		public void setKebisingan(String kebisingan) {
			Kebisingan = kebisingan;
		}
		public String Kebisingan() {
			return Kebisingan;
		}
		public void setBau(String bau) {
			Bau = bau;
		}
		public String getBau() {
			return Bau;
		}
		public void setKebocoran(String kebocoran) {
			Kebocoran = kebocoran;
		}
		public String getKebocoran() {
			return Kebocoran;
		}
		public void setKerusakan(String kerusakan) {
			Kerusakan = kerusakan;
		}
		public String getKerusakan() {
			return Kerusakan;
		}
		public void setKeausan(String keausan) {
			Keausan = keausan;
		}
		public String getKeausan() {
			return Keausan;
		}
		
	//KeamananRuangKelas
		private String Kekokohan;
		private String KunciPintuDanJendela;
		private String Bahaya;
		
		void inputKeamananRuangKelas(){
			System.out.print("\nMasukkan Kekokohan : ");
			Kekokohan = input.nextLine();
			System.out.print("Masukkan Kunci Dan Jendela : ");
			KunciPintuDanJendela = input.nextLine();
			System.out.print("Masukkan Bahaya : ");
			Bahaya = input.nextLine();
		}

		public void setKekokohan(String kekokohan) {
			Kekokohan = kekokohan;
		}
		public String getKekokohan() {
			return Kekokohan;
		}
		public void setKunciPintuDanJendela(String kunciDanJendela) {
			KunciPintuDanJendela = kunciDanJendela;
		}
		public String getKunciPintuDanJendela() {
			return KunciPintuDanJendela;
		}
		public void setBahaya(String bahaya) {
			Bahaya = bahaya;
		}	
		public String getBahaya() {
			return Bahaya;
		}
	
//########################################################################################################//

double luas (){
	return PanjangRuangKelas*LebarRuang;
	}
double rasioLuas(){
	return luas()/JumlahKursi;
	}
}

