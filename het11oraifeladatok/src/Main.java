class TemperatureSensor {
    private double temperature;

    public void setTemperature(double temp) {
        if (temp < -273.15) {
            throw new IllegalArgumentException("A megadott hőmérséklet túl alacsony!");
        }
        this.temperature = temp;
    }
}

public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        try {
            sensor.setTemperature(-300);
        } catch (IllegalArgumentException e) {
            System.out.println("Nem állítható be ilyen alacsony hőmérséklet.");
            System.out.println("Hiba oka: " + e.getMessage());
        }
    }
}
