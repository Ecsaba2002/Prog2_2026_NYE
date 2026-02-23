public class Auto {
    private String marka;
    private String modell;
    private int evjarat;

    public Auto(String marka, String modell, int evjarat) {
        this.marka = marka;
        this.modell = modell;
        this.evjarat = evjarat;
    }

    public void displayInfo() {
        System.out.println("Márka: " + marka);
        System.out.println("Modell: " + modell);
        System.out.println("Évjárat: " + evjarat);
    }

    public void startEngine() {
        System.out.println("Az autó indul!");
    }

    public void stopEngine() {
        System.out.println("Az autó megáll!");
    }
}
