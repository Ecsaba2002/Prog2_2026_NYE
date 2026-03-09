public class Student {

    private static int studentCount = 0;

    public Student() {
        studentCount++;
    }

    public static void printStudentCount() {
        System.out.println("Létrehozott diákok száma: " + studentCount);
    }
}
