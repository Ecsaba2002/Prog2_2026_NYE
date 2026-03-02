public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Használat: <művelet> <szám1> <szám2>");
            return;
        }

        String muvelet = args[0];
        double a = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);
        double eredmeny;

        switch (muvelet) {
            case "összeadás":
                eredmeny = a + b;
                break;
            case "kivonás":
                eredmeny = a - b;
                break;
            case "szorzás":
                eredmeny = a * b;
                break;
            case "osztás":
                if (b == 0) {
                    System.out.println("Nullával nem lehet osztani!");
                    return;
                }
                eredmeny = a / b;
                break;
            default:
                System.out.println("Ismeretlen művelet!");
                return;
        }

        System.out.println("Eredmény: " + eredmeny);
    }
}
