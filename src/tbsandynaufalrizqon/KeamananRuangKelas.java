
package tbsandynaufalrizqon;

import java.util.Scanner;

//@Author : Muhammad Sandy Alfianoor

public abstract class KeamananRuangKelas extends induk_abstrak{
    Scanner input = new Scanner(System.in);
	private String kekokohan;
	private String kunciPintu;
	private String kunciJendela;
	private String bahaya;
	
	public String getKekokohan() {
		return kekokohan;
	}
	public void setKekokohan(String kekokohan) {
		this.kekokohan = kekokohan;
	}
	public String getKunciPintu() {
		return kunciPintu;
	}
	public void setKunciPintu(String kunciPintu) {
		this.kunciPintu = kunciPintu;
	}
	public String getKunciJendela() {
		return kunciJendela;
	}
	public void setKunciJendela(String kunciJendela) {
		this.kunciJendela = kunciJendela;
	}
	public String getBahaya() {
		return bahaya;
	}
	public void setBahaya(String bahaya) {
		this.bahaya = bahaya;
	}
	@Override
	void input() {
			System.out.println("\n=== KEAMANAN RUANG KELAS ===");
			
			System.out.println("kekokohan : ");
			kekokohan = input.next();
			System.out.println("kunci pintu : ");
			kunciPintu = input.next();
			System.out.println("kunci jendela : ");
			kunciJendela = input.next();
			System.out.println("bahaya : ");
			bahaya = input.next();
	}
	@Override
	void view() {
		System.out.println("kekokohan : "+kekokohan);
		System.out.println("kunci pintu : "+kunciPintu);
		System.out.println("kunci jendela : "+kunciJendela);
		System.out.println("bahaya : "+bahaya);	
		
	}
	
        @Override
	public int analisis_pertama() {
		System.out.println("\n*Analisis*");
		if(kekokohan.equals("kokoh")){
            return 1;
            }
            else{
            return 0;
            }
        }
        
        @Override
	 public int analisis_kedua() {          
		if(kunciPintu.equals("ada")){
            return 1;
            }
            else{
            return 0;
            }
        }
         
        @Override
	 public int analisis_ketiga() {       
		if(kunciJendela.equals("ada")){
            return 1;
            }
            else{
            return 0;
            }
        }
         
        @Override
        public int analisis_keempat() {
		if(bahaya.equals("aman")){
            return 1;
            }
            else{
            return 0;
            }
        }	
}
