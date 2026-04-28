public class Main2 {

    public static void processData(String input, int index) {
        if (input == null) {
            throw new NullPointerException("A bemenet null értékű.");
        }
        if (index < 0 || index >= input.length()) {
            throw new ArrayIndexOutOfBoundsException("Érvénytelen index: " + index);
        }

        System.out.println("A kiválasztott karakter: " + input.charAt(index));
    }

    public static void main(String[] args) {

        try {
            processData(null, 2);        // NullPointerException
            //processData("Hello", 10);  // ArrayIndexOutOfBoundsException
        }
        catch (NullPointerException e) {
            System.out.println("Null értéket adtál meg bemenetként.");
            System.out.println("Hiba: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Rossz indexet adtál meg.");
            System.out.println("Hiba: " + e.getMessage());
        }
    }
}
