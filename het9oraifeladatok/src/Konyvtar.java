import java.util.ArrayList;
import java.util.List;

public class Konyvtar {

    public static void main(String[] args) {

        List<Book> library = new ArrayList<>();

        library.add(new Book("A Gyűrűk Ura", "J. R. R. Tolkien"));
        library.add(new Book("Egri csillagok", "Gárdonyi Géza"));
        library.add(new Book("1984", "George Orwell"));

        Book found = findBookByTitle(library, "1984");

        if (found != null) {
            System.out.println("Megtalált könyv:");
            System.out.println(found);
        } else {
            System.out.println("Nincs ilyen című könyv a könyvtárban.");
        }
    }

    public static Book findBookByTitle(List<Book> library, String title) {
        for (Book b : library) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }
}
