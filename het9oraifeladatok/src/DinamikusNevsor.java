import java.util.ArrayList;
import java.util.List;

public class DinamikusNevsor {
    public static void main(String[] args) {

        List<String> nevsor = new ArrayList<>();

        nevsor.add("Kiss Péter");
        nevsor.add("Nagy Anna");
        nevsor.add("Szabó Márton");
        nevsor.add("Tóth Lilla");
        nevsor.add("Varga Dénes");

        nevsor.remove(2);

        System.out.println("A lista mérete: " + nevsor.size());

        System.out.println("Megmaradt nevek:");
        for (String nev : nevsor) {
            System.out.println(nev);
        }
    }
}
