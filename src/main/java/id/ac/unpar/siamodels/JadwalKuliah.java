package id.ac.unpar.siamodels;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class JadwalKuliah {
	protected MataKuliah mataKuliah;
	protected Character kelas;
	protected DayOfWeek hari;
	protected LocalTime waktuMulai;
	protected LocalTime waktuSelesai;
	protected String lokasi;
	protected Dosen pengajar;

	public MataKuliah getMataKuliah() {
		return mataKuliah;
	}

	public void setMataKuliah(MataKuliah mataKuliah) {
		this.mataKuliah = mataKuliah;
	}

	public Character getKelas() {
		return kelas;
	}

	public void setKelas(Character kelas) {
		this.kelas = kelas;
	}

	public DayOfWeek getHari() {
		return hari;
	}

	public void setHari(DayOfWeek hari) {
		this.hari = hari;
	}

	public LocalTime getWaktuMulai() {
		return waktuMulai;
	}

	public void setWaktuMulai(LocalTime waktuMulai) {
		this.waktuMulai = waktuMulai;
	}

	public LocalTime getWaktuSelesai() {
		return waktuSelesai;
	}

	public void setWaktuSelesai(LocalTime waktuSelesai) {
		this.waktuSelesai = waktuSelesai;
	}

	public String getLokasi() {
		return lokasi;
	}

	public void setLokasi(String lokasi) {
		this.lokasi = lokasi;
	}

	public Dosen getPengajar() {
		return pengajar;
	}

	public void setPengajar(Dosen pengajar) {
		this.pengajar = pengajar;
	}
}
