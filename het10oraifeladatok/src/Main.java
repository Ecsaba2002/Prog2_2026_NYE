import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> guests = new TreeSet<>();

        while (true) {
            System.out.print("Add meg a vendég nevét (exit = kilépés): ");
            String name = sc.nextLine().trim();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            if (!name.isEmpty()) {
                guests.add(name);
            }
        }

        System.out.println("\nVendéglista ábécérendben:");
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
