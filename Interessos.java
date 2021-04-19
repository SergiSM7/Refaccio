public class Interessos {

    private static final String IMPORT_DESPRÉS = "Import després ";
	private static final String IMPORT_DESPRÉS_2 = IMPORT_DESPRÉS;
	private static final String TEXT_INTERES = "Interès compost després ";
	private static final String TEXT_INTERES_2 = TEXT_INTERES;
	private double amount;

	public void calcularInteressos(int p, int t, double r, int n) {
        amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        String anys = " anys: ";
		System.out.println(TEXT_INTERES_2 + t + anys+cinterest);
        System.out.println(IMPORT_DESPRÉS_2 + t + anys+amount);
    }
}