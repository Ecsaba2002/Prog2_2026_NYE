public class Main3 {
    public static void main(String[] args) {

        Validator v = new Validator();

        try {
            v.checkPassword("abc123");   
        }
        catch (InvalidPasswordException e) {
            System.out.println("Hibás jelszó!");
            System.out.println("Hiba oka: " + e.getMessage());
        }
    }
}
