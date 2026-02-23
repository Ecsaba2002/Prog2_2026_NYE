public class Main2 {
    public static void main(String[] args) {

        double[] jegyek = {5, 4, 3, 5, 4};

        Diak diak = new Diak("Kiss Péter", jegyek);

        System.out.println("Átlag: " + diak.calculateAverage());
    }
}
