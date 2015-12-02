package id.ac.unpar.siamodels;

public class Dosen {
	protected String nik;
	protected final String nama;
	protected String email;
	
	public Dosen(String nama) {
		this.nama = nama;
	}

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNama() {
		return nama;
	}
}
