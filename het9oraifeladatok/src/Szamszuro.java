import java.util.ArrayList;
import java.util.List;

public class Szamszuro {
    public static void main(String[] args) {

        List<Integer> szamok = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            szamok.add(i);
        }

        szamok.removeIf(szam -> szam % 2 == 0);

        System.out.println("A megmaradt számok:");
        for (int szam : szamok) {
            System.out.println(szam);
        }
    }
}
