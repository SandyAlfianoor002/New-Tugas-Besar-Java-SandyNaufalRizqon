/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbsandynaufalrizqon;

import java.util.Scanner;

/**
 *
 * @author Sandy
 */
public class LogicKelas extends Hitung {

    InstanceClass kelas = new InstanceClass();
	
		
	void IdentitasRuangKelas(){
		input = new Scanner (System.in);
		
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

//////////////////////////////////////////////////////////////////////////////////////////////
	
	void KondisiRuangKelas(){
		kelas.inputKondisiRuangKelas();
		if (kelas.getPanjangRuangKelas()!= kelas.luas()){
		System.out.println("\nPanjang Ruang Kelas Sesuai");
                jumlah++;
		}
		else{
			System.out.println("Panjang Ruang Kelas Tidak Sesuai");
		}
		if (kelas.rasioLuas()>=0.5){
			System.out.println("Rasio Sesuai");
                        jumlah++;
		}
                
		else{
			System.out.println("Rasio Tidak Sesuai");
		}	
		if(kelas.getJumlahPintu()>=2){
			System.out.println("Jumlah Pintu Sesuai");
                        jumlah++;
		}
		else{
			System.out.println("Jumlah Pintu Tidak Sesuai");
		}
		if(kelas.getJumlahJendela()>=1){
			System.out.println("Jumlah Jendela Sesuai"); jumlah++;
		}
		else{
			System.out.println("Jumlah Jendela Tidak Sesuai");
		}
              
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////
	
	void LingkunganRuangKelas(){
		kelas.inputLingkunganRuangKelas();
		
		//LANTAI
		System.out.println("\n\t*Analisis Kebersihan*");
		if(kelas.getKondisiLantai().equals("BERSIH")){
			System.out.println("Kondisi Lantai Sesuai"); jumlah++;
		}
		else{
			System.out.println("Kondisi Lantai Tidak Sesuai");
		}
		
		//DINDING
		System.out.println("\t*Analisis Kebersihan*");
		if(kelas.getKondisiDinding().equals("BERSIH")){
			System.out.println("Kondisi Dinding Sesuai"); jumlah++;
		}
		else{
			System.out.println("Kondisi Dinding Tidak Sesuai");
		}
		
		//ATAP
		System.out.println("\t*Analisis Kebersihan*");
		if(kelas.getKondisiAtap().equals("BERSIH")){
			System.out.println("Kondisi Atap Sesuai"); jumlah++;
		}
		else{
			System.out.println("Kondisi Atap Tidak Sesuai");
		}
		
		//PINTU
		System.out.println("\t*Analisis Kebersihan*");
		if(kelas.getKondisiPintu().equals("BERSIH")){
			System.out.println("Kondisi Pintu Sesuai"); jumlah++;
		}
		else{
			System.out.println("Kondisi Pintu Tidak Sesuai");
		}
		
		//JENDELA
		System.out.println("\t*Analisis Kebersihan*");
		if(kelas.getKondisiJendela().equals("BERSIH")){
			System.out.println("Kondisi Jendela Sesuai"); jumlah++;
		}
		else{
			System.out.println("Kondisi Jendela Tidak Sesuai");
		}
	}
}