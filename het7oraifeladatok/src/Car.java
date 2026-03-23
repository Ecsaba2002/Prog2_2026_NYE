public class Car {

    private String fuelType;

    public Car(String fuelType) {
        this.fuelType = fuelType;
    }

    // Inner Class (nem statikus)
    public class Engine {
        public void start() {
            System.out.println("Starting with " + fuelType + "...");
        }
    }

    public static void main(String[] args) {
        Car car = new Car("diesel");
        Car.Engine engine = car.new Engine();
        engine.start();
    }
}
