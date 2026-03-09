public class CoffeeMachine {

    private int price;

    public CoffeeMachine(int price) {
        setPrice(price);
    }

    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Hiba: az ár nem lehet negatív!");
        }
    }

    public int getPrice() {
        return price;
    }
}
