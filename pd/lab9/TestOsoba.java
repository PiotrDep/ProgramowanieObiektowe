import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        grupa.add(new Osoba("a",LocalDate.of(2004,11,12)));
        grupa.add(new Osoba("b",LocalDate.of(2003,11,4)));
        grupa.add(new Osoba("c",LocalDate.of(2002,12,3)));
        grupa.add(new Osoba("d",LocalDate.of(2001,11,1)));
        grupa.add(new Osoba("Deptuła",LocalDate.of(2001,2,5)));
        System.out.print(grupa);
        System.out.print("\n");
        Collections.sort(grupa);
        System.out.print(grupa);
    }
}
