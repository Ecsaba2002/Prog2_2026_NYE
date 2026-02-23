import java.sql.SQLOutput;
import java.util.Calendar;

//Bankszámla osztály
class BankAccount {
    //példányváltozók
    String owner; //Tulajdonos
    double balance; //Egyenleg

    //Konstruktor
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
}


/**
 * Human osztály létrehozása
 */
class Human {
    //példányváltozók (adatok, attribútumok)
    String name; //nevük
    int birthYear; //születési évük

    //Konstruktor készítése, ez a konstruktor itt minden változót beállít a paraméterekben kapottakra:
    public Human(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    //példánymetódusok (függvények)
    // Számoljuk ki az aktuális életkort
    int getAge() {
        //Az aktuális évet a rendszeridőből vesszük.
        int current_year = Calendar.getInstance().get(Calendar.YEAR);
        return current_year - birthYear;
    }

}

public class Main {

    /**
     * Printrow függvény díszítősorokat ír a konzolra, adott betűből adott számút
     * @param n hányszor ismételje
     * @param c melyik karaktert
     */
    //Ezek a metódusok statikusok, a Main osztályon belül: nem kell objektumot készíteni ahhoz, hogy őket meghívjuk; osztálymetódusok más néven
    static void printrow(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    //Az előző metódus nevének túlterhelése
    /**
     *
     * Printrow függvény, díszítősorokat ír a konzolra, adott számban, a - karakterrel
     * @param n
     */
    static void printrow(int n) {
        printrow(n, '-'); // Meghívjuk az előző metódust
    }


    public static void main(String[] args) {
        //Human objektumok létrehozása
        Human mary = new Human("Maryanne Smith", 1999); //nemcsak definiálom, de le is foglalom a helyet a memóriában neki, megkonstruáljuk (new)
        //Innentől a következő utasítás felesleges:
        //mary.name = "Maryanne Smith"; //hozzáférés az objektum adataihoz: a pont operátoron keresztül
        //mary.birthYear = 1999;
        System.out.println("Maryanne Smith's name is: " + mary.name);
        System.out.println("Maryanne Smith's birth year is: " + mary.birthYear);
        //Újabb ember objektum készítése:
        Human peter; //Referencia, ami null értékű jelenleg
        peter = new Human("Peter Parker", 2007); //Az objektum tényleges létrehozása, megkonstruálása
        //peter.name = "Peter Parker";
        //peter.birthYear = 2007;
        System.out.println("Peter Parker's name is: " + peter.name);
        System.out.println("Peter Parker's birth year is: " + peter.birthYear);
        //Referencia másolat:
        Human clone = peter; //Nem egy új objektumba másol, hanem egy meglévőt hivatkozik
        clone.name = "Spiderman";
        System.out.println("Spiderman's name is: " + clone.name);
        System.out.println("Peter Parker's name is: " + peter.name); //A klón változása megváltoztatta az eredetit (mivel ugyanaz a kettő)
        //Az eredeti objektumreferenciát ha megsemmisítem:
        peter = null;
        //Már a nevét sem tudom kírni, mert nincs érvényes referenciája
        //System.out.println("Peter Parker's name is: " + peter.name);
        //A klónon keresztül az objektum továbbra is elérhető marad:
        System.out.println("Spiderman's name is: " + clone.name);

        //Az objektum metódusainak elérése:
        System.out.println("Spiderman's age is" + clone.getAge());

        System.out.println("A printrow használata:");
        //Ezek statikus metódusok, elég a nevük ahhoz, hogy meghívjuk őket:
        printrow(10);
        printrow(20, '*');
        //Fontos a paraméterek számának, típusának és sorrendjének egyezése!
        //printrow('x', 10);


        //Új bankszámla létrehozása:
        BankAccount peterSzamlaja = new BankAccount("Peter Parker", 250000); //Konstruálás
        System.out.println("Péter számlája: " + peterSzamlaja.owner);
        System.out.println("Egyenleg:" + peterSzamlaja.balance);
    }
}