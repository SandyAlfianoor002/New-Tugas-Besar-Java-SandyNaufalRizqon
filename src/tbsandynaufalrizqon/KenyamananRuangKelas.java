
package tbsandynaufalrizqon;

import java.util.Scanner;

public abstract class KenyamananRuangKelas extends induk_abstrak{
   Scanner input = new Scanner (System.in);
    private String Kebisingan;
    private String Bau;
    private String Kebocoran;
    private String Kerusakan;
    private String Keausan;

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getKebisingan() {
        return Kebisingan;
    }

    public void setKebisingan(String Kebisingan) {
        this.Kebisingan = Kebisingan;
    }

    public String getBau() {
        return Bau;
    }

    public void setBau(String Bau) {
        this.Bau = Bau;
    }

    public String getKebocoran() {
        return Kebocoran;
    }

    public void setKebocoran(String Kebocoran) {
        this.Kebocoran = Kebocoran;
    }

    public String getKerusakan() {
        return Kerusakan;
    }

    public void setKerusakan(String Kerusakan) {
        this.Kerusakan = Kerusakan;
    }

    public String getKeausan() {
        return Keausan;
    }

    public void setKeausan(String Keausan) {
        this.Keausan = Keausan;
    }
   
   @Override
   void input(){
       System.out.println("\n=== KENYAMANAN RUANG KELAS ===");
		System.out.println("kebisingan : ");
		Kebisingan = input.next();
		System.out.println("bau : ");
		Bau = input.next();
		System.out.println("kebocoran : ");
		Kebocoran = input.next();
		System.out.println("kerusakan : ");
		Kerusakan = input.next();
		System.out.println("keausan : ");
		Keausan = input.next();
   }
   
   @Override
   void view(){
       System.out.println("kenyamanan kebisingan: "+Kebisingan);
		System.out.println("kenyamanan bau: "+Bau);
		System.out.println("kenyamanan kebocoran : "+Kebocoran);
		System.out.println("kenyamanan kerusakan : "+Kerusakan);
		System.out.println("kenyamanan keausan : "+Keausan);
   }
   
   @Override
   public int analisis_pertama(){   
   System.out.println("\n*Analisis*");
		if(Kebisingan.equals("tidak_bising")){
            return 1;
            }
            else{
            return 0;
            }
   }
   
      @Override
   public int analisis_kedua(){ 
		if(Bau.equals("tidak_bau")){
            return 1;
            }
            else{
            return 0;
            }
   }
   
      @Override
   public int analisis_ketiga(){ 
		if(Kebocoran.equals("tidak_bocor")){
            return 1;
            }
            else{
            return 0;
            }
   }
   
      @Override
   public int analisis_keempat(){ 
		if(Kerusakan.equals("tidak_rusak")){
            return 1;
            }
            else{
            return 0;
            }
   }
   
      @Override
   public int analisis_kelima(){ 
		if(Keausan.equals("tidak_aus")){
            return 1;
            }
            else{
            return 0;
            }
   }
}
