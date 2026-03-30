public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
                new Car(),
                new Bicycle()
        };

        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
