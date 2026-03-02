import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int gondolt = rand.nextInt(100) + 1; // 1-100
        Scanner sc = new Scanner(System.in);

        int tipp = 0;

        System.out.println("Gondoltam egy számra 1 és 100 között. Találd ki!");

        while (tipp != gondolt) {
            System.out.print("Tipped: ");
            tipp = sc.nextInt();

            if (tipp < gondolt) {
                System.out.println("Nagyobb!");
            } else if (tipp > gondolt) {
                System.out.println("Kisebb!");
            } else {
                System.out.println("Eltaláltad!");
            }
        }
    }
}
