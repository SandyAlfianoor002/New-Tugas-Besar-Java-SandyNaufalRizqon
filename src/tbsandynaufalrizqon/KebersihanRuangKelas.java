
package tbsandynaufalrizqon;

import java.util.Scanner;
        
public abstract class KebersihanRuangKelas extends induk_abstrak{
    Scanner input = new Scanner (System.in);
    private String SirkulasiUdara;
    private int Pencahayaan;
    private int Kelembapan;
    private int Suhu;

    public Scanner getInput() {
        return input;
    }
    public void setInput(Scanner input) {
        this.input = input;
    }
    public String getSirkulasiUdara() {
        return SirkulasiUdara;
    }
    public void setSirkulasiUdara(String SirkulasiUdara) {
        this.SirkulasiUdara = SirkulasiUdara;
    }
    public int getPencahayaan() {
        return Pencahayaan;
    }
    public void setPencahayaan(int Pencahayaan) {
        this.Pencahayaan = Pencahayaan;
    }
    public int getKelembapan() {
        return Kelembapan;
    }
    public void setKelembapan(int Kelembapan) {
        this.Kelembapan = Kelembapan;
    }
    public int getSuhu() {
        return Suhu;
    }
    public void setSuhu(int Suhu) {
        this.Suhu = Suhu;
    }
    
    @Override
   void input(){
   System.out.println("\n=== KEBERSIHAN RUANG KELAS ===");
		System.out.println("masukkan kondisi sirkulasi Udara : ");
		SirkulasiUdara = input.next();
		System.out.println("masukkan nilai pencahayaan : ");
		Pencahayaan = input.nextInt();
		System.out.println("masukkan kelembapan (%) : ");
		Kelembapan = input.nextInt();
		System.out.println("masukkan suhu : ");
		Suhu = input.nextInt();
   }   
   
    @Override
   void view(){
       System.out.println("kondisi sirkulasi Udara : "+SirkulasiUdara);
			System.out.println("nilai pencahayaan : "+Pencahayaan);
			System.out.println("kelembapan : "+Kelembapan);
			System.out.println("suhu : "+Suhu);
   }
   
    @Override
   public int analisis_pertama(){
   System.out.println("\n*Analisis*");
	if(SirkulasiUdara.equals("lancar")){
            return 1;
            }
            else{
            return 0;
            }
   }
   
    @Override
   public int analisis_kedua(){
	if(Pencahayaan >= 250 && Pencahayaan <= 300 ){
            return 1;
            }
            else{
            return 0;
            }
   }
   
            @Override
   public int analisis_ketiga(){
	if(Kelembapan >=70 && Kelembapan <=80){
            return 1;
            }
            else{
            return 0;
            }
   }
   
            @Override
   public int analisis_keempat(){
	if(Suhu >=25 && Suhu <= 35){
            return 1;
            }
            else{
            return 0;
            }
   }
}
