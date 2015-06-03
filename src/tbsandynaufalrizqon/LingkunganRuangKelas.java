
package tbsandynaufalrizqon;

import java.util.Scanner;

public class LingkunganRuangKelas {
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
    
    void view(){
    System.out.println("kondisi lantai : "+Lantai);
		System.out.println("kondisi dinding : "+Dinding);
		System.out.println("kondisi atap : "+Atap);
		System.out.println("kondisi pintu : "+Pintu);
		System.out.println("kondisi jendela : "+Jendela);
    }
    
    void analisis(){
        		System.out.println("\n*Analisis Kebersihan*");
		if(Lantai.equals("bersih")){
			System.out.println("kondisi lantai SESUAI!");
		}
		else{
			System.out.println("kondisi lantai TIDAK SESUAI!");
		}
		if(Dinding.equals("bersih")){
			System.out.println("kondisi dinding SESUAI!");
		}
		else{
			System.out.println("kondisi dinding TIDAK SESUAI!");
		}
		if(Atap.equals("bersih")){
			System.out.println("kondisi atap SESUAI!");
		}
		else{
			System.out.println("kondisi atap TIDAK SESUAI!");
		}
		if(Pintu.equals("bersih")){
			System.out.println("kondisi pintu SESUAI!");
		}
		else{
			System.out.println("kondisi pintu TIDAK SESUAI!");
		}
		if(Jendela.equals("bersih")){
			System.out.println("kondisi jendela SESUAI!");
		}
		else{
			System.out.println("kondisi jendela TIDAK SESUAI!");
		}
    }
}
