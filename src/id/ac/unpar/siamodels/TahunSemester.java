package id.ac.unpar.siamodels;

/**
 * Menyimpan konstanta untuk semester beserta tahunnya di UNPAR.
 * @author pascal
 *
 */
public final class TahunSemester implements Comparable<TahunSemester> {
	
	/**
	 * Kode semester 3 dijit, sesuai DPS:
	 * <ul>
	 *   <li>2 dijit pertama berupa tahun, 2 dijit terakhir</li>
	 *   <li>dijit terakhir: 1 untuk ganjil, 2 untuk genap, 4 untuk pendek.
	 * </ul>
	 */
	private String kodeTahunSemester;
	
	public TahunSemester(String kodeTahunSemester) throws IllegalArgumentException {
		validateKodeSemester(kodeTahunSemester);
		this.kodeTahunSemester = kodeTahunSemester;
	}
	
	public TahunSemester(int tahun, Semester semester) throws IllegalArgumentException {
		char kodeSemester = '\0';
		switch (semester) {
		case GANJIL:
			kodeSemester = '1';
			break;
		case GENAP:
			kodeSemester = '2';
			break;
		case PENDEK:
			kodeSemester = '4';
			break;
		}
		String kodeTahunSemester = ("" + tahun).substring(2, 4) + kodeSemester; 
		validateKodeSemester(kodeTahunSemester);
		this.kodeTahunSemester = kodeTahunSemester;
	}
	
	public Semester getSemester() {
		switch (kodeTahunSemester.charAt(2)) {
		case '1': return Semester.GANJIL;
		case '2': return Semester.GENAP;
		case '4': return Semester.PENDEK;
		}
		return null;
	}
	
	public int getTahun() {
		return 2000 + Integer.parseInt(kodeTahunSemester.substring(0, 2));
	}
	
	private static void validateKodeSemester(String kodeTahunSemester) throws IllegalArgumentException {
		if (!kodeTahunSemester.matches("[0-9][0-9][124]")) {
			throw new IllegalArgumentException("Kode semester tidak valid: " + kodeTahunSemester);
		}
	}

	@Override
	public int compareTo(TahunSemester o) {
		if (this.getTahun() < o.getTahun()) {
			return -1;
		}
		if (this.getTahun() > o.getTahun()) {
			return + 1;
		}
		if (this.getSemester().getOrder() < o.getSemester().getOrder()) {
			return -1;
		}
		if (this.getSemester().getOrder() > o.getSemester().getOrder()) {
			return +1;
		}
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof TahunSemester)) {
			return false;
		}
		return this.compareTo((TahunSemester)obj) == 0;
	}

	@Override
	public String toString() {
		return "TahunSemester [" + getTahun() + "/" + getSemester() + "]";
	}	
}
