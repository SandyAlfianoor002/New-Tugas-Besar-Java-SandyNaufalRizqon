/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbsandynaufalrizqon;

import java.util.Scanner;

/**
 *
 * @author Sandyalfianoor
 */
public class InstanceClass extends Hitung{
	
	
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
	double luas (){
	return PanjangRuangKelas*LebarRuang;
	}
double rasioLuas(){
	return luas()/JumlahKursi;
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
}