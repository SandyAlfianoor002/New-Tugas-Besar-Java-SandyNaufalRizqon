
package tbsandynaufalrizqon;

import java.util.Scanner;

public abstract class LingkunganRuangKelas extends induk_abstrak {
    Scanner input = new Scanner(System.in);
        private String Lantai;
	private String Dinding;
	private String Atap;
	private String Pintu;
	private String Jendela;

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getLantai() {
        return Lantai;
    }

    public void setLantai(String Lantai) {
        this.Lantai = Lantai;
    }

    public String getDinding() {
        return Dinding;
    }

    public void setDinding(String Dinding) {
        this.Dinding = Dinding;
    }

    public String getAtap() {
        return Atap;
    }

    public void setAtap(String Atap) {
        this.Atap = Atap;
    }

    public String getPintu() {
        return Pintu;
    }

    public void setPintu(String Pintu) {
        this.Pintu = Pintu;
    }

    public String getJendela() {
        return Jendela;
    }

    public void setJendela(String Jendela) {
        this.Jendela = Jendela;
    }
    
    
    @Override
    void input(){
      	System.out.println("\n=== LINGKUNGAN RUANG KELAS ===");
		System.out.println("masukkan kondisi lantai : ");
		Lantai = input.next();
		System.out.println("masukkan kondisi dinding : ");
		Dinding = input.next();
		System.out.println("masukkan kondisi atap : ");
		Atap = input.next();
		System.out.println("masukkan kondisi pintu : ");
		Pintu = input.next();
		System.out.println("masukkan kondisi jendela : ");
		Jendela = input.next();
    }
    
    @Override
    void view(){
    System.out.println("kondisi lantai : "+Lantai);
		System.out.println("kondisi dinding : "+Dinding);
		System.out.println("kondisi atap : "+Atap);
		System.out.println("kondisi pintu : "+Pintu);
		System.out.println("kondisi jendela : "+Jendela);
    }
               @Override
   public int analisis_pertama(){
        		System.out.println("\n*Analisis Kebersihan*");
		if(Lantai.equals("bersih")){
            return 1;
            }
            else{
            return 0;
            }
   }
   
               @Override
   public int analisis_kedua(){
		if(Dinding.equals("bersih")){
            return 1;
            }
            else{
            return 0;
            }
   }
   
               @Override
   public int analisis_ketiga(){
		if(Atap.equals("bersih")){
            return 1;
            }
            else{
            return 0;
            }
   }
   
               @Override
   public int analisis_keempat(){
		if(Pintu.equals("bersih")){
            return 1;
            }
            else{
            return 0;
            }
   }
   
               @Override
   public int analisis_kelima(){
		if(Jendela.equals("bersih")){
            return 1;
            }
            else{
            return 0;
            }
    }
}
