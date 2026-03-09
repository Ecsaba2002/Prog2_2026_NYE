public class Main2 {
    public static void main(String[] args) {
        CoffeeMachine cm = new CoffeeMachine(1200);
        System.out.println(cm.getPrice());

        cm.setPrice(-500); // hibát jelez
        System.out.println(cm.getPrice()); // továbbra is 1200
    }
}
