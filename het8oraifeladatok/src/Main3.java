public class Main3 {
    public static void main(String[] args) {
        Pair<Integer, String> student = new Pair<>(123, "Kiss Péter");

        System.out.println("ID: " + student.getKey());
        System.out.println("Név: " + student.getValue());
    }
}
