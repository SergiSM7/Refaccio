public class Interessos {

    public void calculate(int p, int t, double r, int n) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Inter�s compost despr�s " + t + " anys: "+cinterest);
        System.out.println("Import despr�s " + t + " anys: "+amount);
    }
    public static void main(String args[]) {
    	Interessos obj = new Interessos();
    	obj.calculate(2000, 5, .08, 12);
    }
}