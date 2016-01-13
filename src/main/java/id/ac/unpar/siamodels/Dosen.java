package id.ac.unpar.siamodels;

public class Dosen {
	private String nik;
	private String nama;

	public Dosen(String nik, String nama) {
		super();
		this.nik = nik;
		this.nama = nama;
	}
	
	public String getNik() {
		return nik;
	}
	public void setNik(String nik) {
		this.nik = nik;
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}	
}
