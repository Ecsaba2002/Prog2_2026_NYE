interface Message {
    void print();
}

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        m.showMessage();
    }

    public void showMessage() {
        Message msg = new Message() {
            @Override
            public void print() {
                System.out.println("Hello from the inner world!");
            }
        };

        msg.print();
    }
}
