public class Diak {
    private String nev;
    private double[] osztalyzatok;

    // Konstruktor
    public Diak(String nev, double[] osztalyzatok) {
        this.nev = nev;
        this.osztalyzatok = osztalyzatok;
    }

    // Átlag számítása
    public double calculateAverage() {
        double osszeg = 0;

        for (double jegy : osztalyzatok) {
            osszeg += jegy;
        }

        return osszeg / osztalyzatok.length;
    }
}
