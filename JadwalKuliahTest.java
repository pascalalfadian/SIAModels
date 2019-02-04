package main.java.id.ac.unpar.siamodels;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.time.DayOfWeek;
import java.time.LocalTime;
//import main.java.id.ac.unpar.siamodels.Dosen;
//import main.java.id.ac.unpar.siamodels.JadwalKuliah;
//import main.java.id.ac.unpar.siamodels.MataKuliah;
//import main.java.id.ac.unpar.siamodels.MataKuliahFactory;
//import main.java.id.ac.unpar.siamodels.matakuliah.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class JadwalKuliahTest {
    
    public JadwalKuliahTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMataKuliah method, of class JadwalKuliah.
     */
    @Test
    public void testGetMataKuliah() {
        System.out.println("getMataKuliah");
        String kode = "AIF101";
        Dosen pengajar = new Dosen("10560", "Keenan");
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance2.createMataKuliah(kode, 6, "Pemrograman Berorientasi Objek");
        JadwalKuliah instance = new JadwalKuliah(matkul, 'A', pengajar, "senin", "08:00-11:00", "9122");
        MataKuliah expResult = matkul;
        MataKuliah result = instance.getMataKuliah();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMataKuliah method, of class JadwalKuliah.
     */
    @Test
    public void testSetMataKuliah() {
        System.out.println("setMataKuliah");
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        MataKuliah mataKuliah = instance2.createMataKuliah("AIF102", 4, "Algoritma dan Struktur Data");
        JadwalKuliah instance = new JadwalKuliah();
        instance.setMataKuliah(mataKuliah);
    }

    /**
     * Test of getKelas method, of class JadwalKuliah.
     */
    @Test
    public void testGetKelas() {
        System.out.println("getKelas");
        String kode = "AIF101";
        Dosen pengajar = new Dosen("10560", "Keenan");
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance2.createMataKuliah(kode, 6, "Pemrograman Berorientasi Objek");
        JadwalKuliah instance = new JadwalKuliah(matkul, 'A', pengajar, "senin", "08:00-11:00", "9122");
        Character expResult = 'A';
        Character result = instance.getKelas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setKelas method, of class JadwalKuliah.
     */
    @Test
    public void testSetKelas() {
        System.out.println("setKelas");
        Character kelas = 'A';
        JadwalKuliah instance = new JadwalKuliah();
        instance.setKelas(kelas);
    }

    /**
     * Test of getHari method, of class JadwalKuliah.
     */
    @Test
    public void testGetHari() {
        System.out.println("getHari");
        String kode = "AIF101";
        Dosen pengajar = new Dosen("10560", "Keenan");
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance2.createMataKuliah(kode, 6, "Pemrograman Berorientasi Objek");
        JadwalKuliah instance = new JadwalKuliah(matkul, 'A', pengajar, "senin", "08:00-11:00", "9122");
        DayOfWeek expResult = DayOfWeek.MONDAY;
        DayOfWeek result = instance.getHari();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHari method, of class JadwalKuliah.
     */
    @Test
    public void testSetHari() {
        System.out.println("setHari");
        DayOfWeek hari = DayOfWeek.MONDAY;
        JadwalKuliah instance = new JadwalKuliah();
        instance.setHari(hari);
    }

    /**
     * Test of getWaktuMulai method, of class JadwalKuliah.
     */
    @Test
    public void testGetWaktuMulai() {
        System.out.println("getWaktuMulai");
        String kode = "AIF101";
        String waktu = "08:00-11:00";
        Dosen pengajar = new Dosen("10560", "Keenan");
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance2.createMataKuliah(kode, 6, "Pemrograman Berorientasi Objek");
        JadwalKuliah instance = new JadwalKuliah(matkul, 'A', pengajar, "Senin", waktu, "9122");
        LocalTime expResult = LocalTime.of(8, 0);
        LocalTime result = instance.getWaktuMulai();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWaktuMulai method, of class JadwalKuliah.
     */
    @Test
    public void testSetWaktuMulai() {
        System.out.println("setWaktuMulai");
        LocalTime waktuMulai = LocalTime.of(8, 0);
        JadwalKuliah instance = new JadwalKuliah();
        instance.setWaktuMulai(waktuMulai);
    }

    /**
     * Test of getWaktuSelesai method, of class JadwalKuliah.
     */
    @Test
    public void testGetWaktuSelesai() {
        System.out.println("getWaktuSelesai");
        String kode = "AIF101";
        String waktu = "08:00-11:00";
        Dosen pengajar = new Dosen("10560", "Keenan");
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance2.createMataKuliah(kode, 6, "Pemrograman Berorientasi Objek");
        JadwalKuliah instance = new JadwalKuliah(matkul, 'A', pengajar, "Senin", waktu, "9122");
        LocalTime expResult = LocalTime.of(11, 0);
        LocalTime result = instance.getWaktuSelesai();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWaktuSelesai method, of class JadwalKuliah.
     */
    @Test
    public void testSetWaktuSelesai() {
        System.out.println("setWaktuSelesai");
        LocalTime waktuSelesai = LocalTime.of(11, 0);
        JadwalKuliah instance = new JadwalKuliah();
        instance.setWaktuSelesai(waktuSelesai);
    }

    /**
     * Test of getLokasi method, of class JadwalKuliah.
     */
    @Test
    public void testGetLokasi() {
        System.out.println("getLokasi");String kode = "AIF101";
        String waktu = "08:00-11:00";
        Dosen pengajar = new Dosen("10560", "Keenan");
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance2.createMataKuliah(kode, 6, "Pemrograman Berorientasi Objek");
        JadwalKuliah instance = new JadwalKuliah(matkul, 'A', pengajar, "Senin", waktu, "9122");
        String expResult = "9122";
        String result = instance.getLokasi();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLokasi method, of class JadwalKuliah.
     */
    @Test
    public void testSetLokasi() {
        System.out.println("setLokasi");
        String lokasi = "9122";
        JadwalKuliah instance = new JadwalKuliah();
        instance.setLokasi(lokasi);
    }

    /**
     * Test of getPengajar method, of class JadwalKuliah.
     */
    @Test
    public void testGetPengajar() {
        System.out.println("getPengajar");
        String kode = "AIF101";
        String waktu = "08:00-11:00";
        Dosen pengajar = new Dosen("10560", "Keenan");
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance2.createMataKuliah(kode, 6, "Pemrograman Berorientasi Objek");
        JadwalKuliah instance = new JadwalKuliah(matkul, 'A', pengajar, "Senin", waktu, "9122");
        Dosen expResult = pengajar;
        Dosen result = instance.getPengajar();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPengajar method, of class JadwalKuliah.
     */
    @Test
    public void testSetPengajar() {
        System.out.println("setPengajar");
        Dosen pengajar = new Dosen("141401", "Keenan");
        JadwalKuliah instance = new JadwalKuliah();
        instance.setPengajar(pengajar);
    }

    /**
     * Test of getWaktuString method, of class JadwalKuliah.
     */
    @Test
    public void testGetWaktuString() {
        System.out.println("getWaktuString");
        String kode = "AIF101";
        String waktu = "08:00-11:00";
        Dosen pengajar = new Dosen("10560", "Keenan");
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance2.createMataKuliah(kode, 6, "Pemrograman Berorientasi Objek");
        JadwalKuliah instance = new JadwalKuliah(matkul, 'A', pengajar, "Senin", waktu, "9122");
        String expResult = "08:00-11:00";
        String result = instance.getWaktuString();
        assertEquals(expResult, result);
    }

    /**
     * Test of indonesianToDayOfWeek method, of class JadwalKuliah.
     */
    @Test
    public void testIndonesianToDayOfWeek() {
        System.out.println("indonesianToDayOfWeek");
        String indonesian = "senin";
        DayOfWeek expResult = DayOfWeek.MONDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
}
