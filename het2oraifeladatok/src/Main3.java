import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eletkor;

        // Életkor bekérése 1–20 között
        do {
            System.out.print("Hány éves vagy? (1-20 között): ");

            while (!sc.hasNextInt()) {
                System.out.println("Ez nem szám! Próbáld újra:");
                sc.next();
            }

            eletkor = sc.nextInt();

            if (eletkor < 1 || eletkor > 20) {
                System.out.println("Hibás érték, próbáld újra!");
            }

        } while (eletkor < 1 || eletkor > 20);

        // 1. sor: * csillagok
        for (int i = 0; i < eletkor; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // 2. sor: | vonalok
        for (int i = 0; i < eletkor; i++) {
            System.out.print("| ");
        }
        System.out.println();

        // 3. sor: _ alahuzas
        for (int i = 0; i < eletkor; i++) {
            System.out.print("_ ");
        }
        System.out.println();
    }
}
