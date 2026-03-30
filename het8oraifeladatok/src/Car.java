class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Az autó négy keréken gurul");
    }
}

class Bicycle extends Vehicle {
    @Override
    void move() {
        System.out.println("A bicikli két keréken halad");
    }
}
