package id.ac.unpar.siamodels;

public enum Semester {
	PENDEK(0), GANJIL(1), GENAP(2);

	public static Semester fromString(String text) {
		return Semester.valueOf(text.toUpperCase());
	}
	
	private int order;
	
	private Semester(int order) {
		this.order = order;
	}
	
	int getOrder() {
		return order;
	}
	
}
