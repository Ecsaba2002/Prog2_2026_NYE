import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Student> students = new HashMap<>();

        students.put("ID001", new Student("Kiss Péter", 20, "Programtervező informatikus"));
        students.put("ID002", new Student("Nagy Anna", 21, "Gazdaságinformatikus"));
        students.put("ID003", new Student("ID003", 22, "Mérnökinformatikus"));

        System.out.print("Add meg a hallgató azonosítóját: ");
        String id = sc.nextLine().trim();

        if (students.containsKey(id)) {
            System.out.println("\nHallgató adatai:");
            System.out.println(students.get(id).toString());
        } else {
            System.out.println("\nNincs ilyen azonosító az adatbázisban.");
        }
    }
}
