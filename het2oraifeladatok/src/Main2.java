import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int masodperc;

        do {
            System.out.print("Hány másodperc telt el a villámlás és a dörgés között? ");
            masodperc = sc.nextInt();

            if (masodperc < 0) {
                System.out.println("Negatív érték nem lehet, próbáld újra!");
            }

        } while (masodperc < 0);

        int tavolsag = masodperc * 300;
        System.out.println("A villám kb. " + tavolsag + " méterre csapott be.");
    }
}
