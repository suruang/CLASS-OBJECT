//main kotak objek java
public class objek {

	public static void main(String[] args) {
		kotak mhs = new kotak();
		double panjang=12;
		double lebar=12;
		mhs.getLuas(panjang, lebar);
	}

}
//main mahasiswa objek java
ublic class objek1M {

	public static void main(String[] args) {
		// objek
		Mahasiswa data = new Mahasiswa();
		data.setNama("nama=Abdul Wahab");
		data.setNim("nim=D0217025");
		data.setAlamat("alamat=Desa Suruang Kec.Campalagian");
		data.setGolonganDarah("golongan darah=AB");
		data.setStatus("status=belum menikah");
		data.setTinggiBadan("tinggi Badan=166 cm");
		data.setberatBadan("berat Badan=49 kg");
		
	
		
		
	}

}
//main Node objek java
public class objek2N {

	public static void main(String[] args) {
		// objek
		Node benda = new Node();
		benda.setLabel("saya mengambil jurusan teknik informatika di Universitas Sulawesi Barat");
		benda.setValue(27011998);

	}

}
//main Stack objek java

public class objek3S {

	private static String value;

	public static void main(String[] args, int top) {
		// objek
		Stack teknik = new Stack();
		teknik.setValueAt(top, value);

	}

}

