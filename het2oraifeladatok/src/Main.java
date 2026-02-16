import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Add meg az aktuális hőmérsékletet: ");
        int homerseklet = sc.nextInt();

        if (homerseklet < 0) {
            System.out.println("Fagypont alatti");
        } else if (homerseklet < 30) {
            System.out.println("Átlagos");
        } else {
            System.out.println("Túl meleg");
        }
    }
}
