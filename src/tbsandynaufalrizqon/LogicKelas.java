/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbsandynaufalrizqon;

import java.util.Scanner;

/**
 *
 * @author Sand
 */
public class LogicKelas  {

    InstanceClass kelas = new InstanceClass();
	public void IdentitasRuangKelas(){
            Scanner input = new Scanner (System.in);

            System.out.println("\t\t\t\t\t\t\t~ IDENTITY OF THE CLASS ~\n");

            System.out.print("Silahkan Masukkan Nama Ruang : ");
		kelas.setNamaRuang(input.next());

            System.out.print("Silahkan Masukkan Lokasi Ruang : ");
                kelas.setLokasiRuang(input.next());

            System.out.println("1. Fakultas Agama Islam");
            System.out.println("2. Fakultas Peternakan dan Pertanian");
            System.out.println("3. Fakultas Teknik");
            System.out.println("4. Fakultas Ekonomi dan Bisnis");
            System.out.println("5. Fakultas Keguruan dan Ilmu Pendidikan");
            System.out.println("6. Fakultas Ilmu Sosial dan Pemerintahan");
            System.out.println("7. Fakultas Ilmu Kesehatan ");
            System.out.println("8. Fakultas Hukum ");
            System.out.print("Pilih Fakultas anda dengan memasukkan nomor Fakultas : ");
		kelas.ProgramSF = input.nextInt();

            System.out.println("\nNama Ruang : "+ kelas.getNamaRuang());
            System.out.println("Lokasi Ruang : "+ kelas.getLokasiRuang());

                if (kelas.ProgramSF == 1){
            System.out.println("Selamat Datang di Fakultas Agama Islam");
		}
		else if(kelas.ProgramSF == 2){
            System.out.println("Selamat Datang di Fakultas Peternakan dan Pertanian");
		}
		else if(kelas.ProgramSF == 3){
            System.out.println("Selamat Datang di Fakultas Teknik");
		}
		else if(kelas.ProgramSF == 4 ){
            System.out.println("Selamat Datang di Fakultas Ekonomi dan Bisnis");
		}
		else if(kelas.ProgramSF == 5 ){
            System.out.println("Selamat Datang di Fakultas Keguruan dan Ilmu Pendidikan");
		}
		else if(kelas.ProgramSF == 6 ){
            System.out.println("Selamat Datang di Fakultas Ilmu Sosial dan Pemerintahan");
		}
		else if(kelas.ProgramSF == 7 ){
            System.out.println("Selamat Datang diFakultas Ilmu Kesehatan");
		}
		else if(kelas.ProgramSF == 8 ){
            System.out.println("Selamat Datang di Fakultas Hukum\n");
		}
		else{
            System.out.println("Fakultas Anda Tidak Dikenali Sistem\n");
		}
        }

//////////////////////////////////////////////////////////////////////////////////////////////////////

 
   
	void KondisiRuangKelas(){
		kelas.inputKondisiRuangKelas();
		if (kelas.getPanjangRuangKelas()!= kelas.luas()){
            System.out.println("\nPanjang Ruang Kelas Sesuai");
                }
		else{
            System.out.println("Panjang Ruang Kelas Tidak Sesuai");
		}
		if (kelas.rasioLuas()>=0.5){
            System.out.println("Rasio Sesuai");
                }
		else{
            System.out.println("Rasio Tidak Sesuai");
		}
		if(kelas.getJumlahPintu()>=2){
            System.out.println("Jumlah Pintu Sesuai");
		}
		else{
            System.out.println("Jumlah Pintu Tidak Sesuai");
		}
		if(kelas.getJumlahJendela()>=1){
            System.out.println("Jumlah Jendela Sesuai");
		}
		else{
            System.out.println("Jumlah Jendela Tidak Sesuai");
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////

 
   
	void LingkunganRuangKelas(){
		kelas.inputLingkunganRuangKelas();

	//LANTAI
            System.out.println("\nKondisi Lantai : "+ kelas.getKondisiLantai());
		if(kelas.getKondisiLantai().equals("bersih")){
            System.out.println("Kondisi Lantai Sesuai");
		}
		else{
            System.out.println("Kondisi Lantai Tidak Sesuai");
		}

	//DINDING
            System.out.println("Kondisi Dinding : "+ kelas.getKondisiDinding());
                if(kelas.getKondisiDinding().equals("bersih")){
            System.out.println("Kondisi Dinding Sesuai");
		}
		else{
            System.out.println("Kondisi Dinding Tidak Sesuai");
		}

	//ATAP
            System.out.println("Kondisi Atap : "+ kelas.getKondisiAtap());
		if(kelas.getKondisiAtap().equals("bersih")){
            System.out.println("Kondisi Atap Sesuai");
		}
		else{
            System.out.println("Kondisi Atap Tidak Sesuai");
		}

	//PINTU
            System.out.println("Kondisi Pintu : "+ kelas.getKondisiPintu());
		if(kelas.getKondisiPintu().equals("bersih")){
            System.out.println("Kondisi Pintu Sesuai");
		}
		else{
            System.out.println("Kondisi Pintu Tidak Sesuai");
		}

	//JENDELA
            System.out.println("Kondisi Jendela : "+ kelas.getKondisiJendela());
		if(kelas.getKondisiJendela().equals("bersih")){
            System.out.println("Kondisi Jendela Sesuai");
		}
		else{
            System.out.println("Kondisi Jendela Tidak Sesuai");
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////

   
	void KebersihanRuangKelas(){
		kelas.inputKebersihanRuangKelas();

	//SIRKULASIUDARA
            System.out.println("\n\t*Analisis Sirkulasi Udara*");
		if(kelas.getSirkulasiUdara().equals("lancar")){
            System.out.println("Sirkulasi Udara Sesuai");
		}
		else{
            System.out.println("Sirkulasi Udara Tidak Sesuai");
		}

	//PENCAHAYAAN
            System.out.println("\t*Analisis Pencahayaan*");
		if(kelas.getNilaiPencahayaan() == 250){
            System.out.println("Pencahayaan Sesuai");
		}
		else{
            System.out.println("Pencahayaan Tidak Sesuai");
		}
		if(kelas.getNilaiPencahayaan() == 350){
            System.out.println("Pencahayaan Sesuai");
		}
		else{
            System.out.println("Pencahayaan Tidak Sesuai");
		}

	//KELEMBAPAN
            System.out.println("\t*Analisis Kelembapan*");
		if(kelas.getKelembapan() == 70 ){
            System.out.println("Kelembapan Sesuai");
		}
		else{
            System.out.println("Kelembapan Tidak Sesuai");
		}
		if(kelas.getKelembapan() == 80 ){
            System.out.println("Kelembapan Sesuai");
		}
		else{
            System.out.println("Kelembapan Tidak Sesuai");
		}

	//SUHU
            System.out.println("\t*Analisis Suhu*");
		if(kelas.getSuhu() == 25){
            System.out.println("Suhu Sesuai");
		}
		else{
            System.out.println("Suhu Tidak Sesuai");
		}
		if(kelas.getSuhu() == 35){
            System.out.println("Suhu Sesuai");
		}
		else{
            System.out.println("Suhu Tidak Sesuai");
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////

   
	void KenyamananRuangKelas(){
		kelas.inputKenyamananRuangKelas();

	//KEBISINGAN
            System.out.println("\n\t*Analisis Kebisingan*");
		if(kelas.Kebisingan().equals("tidak bising")){
            System.out.println("Kebisingan Sesuai");
		}
		else{
            System.out.println("Kebisingan Tidak Sesuai");
		}

	//BAU
            System.out.println("\t*Analisis Bau*");
		if(kelas.getBau().equals("tidak bau")){
            System.out.println("Bau Sesuai");
		}
		else{
            System.out.println("Bau Tidak Sesuai");
		}

	//KEBOCORAN
            System.out.println("\t*Analisis Kebocoran*");
		if(kelas.getKebocoran().equals("tidak bocor")){
            System.out.println("Kebocoran Sesuai");
		}
		else{
            System.out.println("Kebocoran Tidak Sesuai");
		}

	//KERUSAKAN
            System.out.println("\t*Analisis Kerusakan*");
		if(kelas.getKerusakan().equals("tidak rusak")){
            System.out.println("Kerusakan Sesuai");
		}
		else{
            System.out.println("Kerusakan Tidak Sesuai");
		}

	//KEAUSAN
            System.out.println("\t*Analisis Keausan*");
		if(kelas.getKeausan().equals("tidak aus")){
            System.out.println("Keausan Sesuai");
		}
		else{
            System.out.println("Keausan Tidak Sesuai");
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////

	void KeamananRuangKelas(){
		kelas.inputKeamananRuangKelas();

	//KEKOKOHAN
            System.out.println("\n\t*Analisis Kekokohan*");
		if(kelas.getKekokohan().equals("kokoh")){
            System.out.println("Kekokohan Sesuai");
		}
		else{
            System.out.println("Kekokohan Tidak Sesuai");
		}

	//KUNCI PINTU DAN JENDELA
            System.out.println("\t*Analisis Kunci Pintu dan Jendela*");
		if(kelas.getKunciPintuDanJendela().equals("ada")){
            System.out.println("Kunci Pintu dan Jendela Sesuai");
		}
		else{
            System.out.println("Kunci Pintu dan Jendela Tidak Sesuai");
		}

	//BAHAYA
            System.out.println("\t*Analisis Bahaya*");
		if(kelas.getBahaya().equals("aman")){
            System.out.println("Bahaya Sesuai");
		}
		else{
            System.out.println("Bahaya Tidak Sesuai");
		}
	}
}
