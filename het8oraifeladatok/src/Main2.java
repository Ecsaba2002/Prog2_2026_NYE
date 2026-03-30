public class Main2 {
    static void testSound(SoundMaker sm) {
        sm.makeSound();
    }

    public static void main(String[] args) {
        testSound(new Radio());
        testSound(new Dog());
    }
}
