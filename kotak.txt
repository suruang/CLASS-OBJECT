
public class kotak {
	private double panjang,lebar,luas,keliling;
	
	
	double getPanjang () {
		System.out.println(panjang);
		return panjang;
		
	}
	double getLebar () {
		System.out.println(lebar);
		return lebar;
		
	
	
	}
	double getLuas (double panjang, double lebar) {
		System.out.println("Luas Bangun datar:"+panjang*lebar);
	  this.panjang=panjang;
		return this.lebar = lebar;
		
	
	}
	double getKeliling () {
		System.out.println(keliling);
		return keliling;
	}
	void setPanjang(double panjang) {
		this.panjang = panjang;
	}
	void setLebar (double lebar) {
		this.lebar = lebar;
	}
	void setLuas (double luas) {
		this.luas = luas;
	}
	void setKeliling(double keliling) {
		this.keliling = keliling;
	}
	
			
}





