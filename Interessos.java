public class Interessos {

    public void calcularInteressos(int p, int t, double r, int n) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        String anys = " anys: ";
		System.out.println("Inter�s compost despr�s " + t + anys+cinterest);
        System.out.println("Import despr�s " + t + anys+amount);
    }
}