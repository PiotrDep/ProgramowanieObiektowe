import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> grupa = new ArrayList<Student>();
        grupa.add(new Student("a",LocalDate.of(2004,11,12),3.2));
        grupa.add(new Student("b",LocalDate.of(2003,11,4)),5.2);
        grupa.add(new Student("c",LocalDate.of(2002,12,3),4.2));
        grupa.add(new Student("d",LocalDate.of(2001,11,1),3.2));
        grupa.add(new Student("Deptuła",LocalDate.of(2001,2,5),2.2));
        System.out.print(grupa);
        System.out.print("\n");
        Collections.sort(grupa);
        System.out.print(grupa);
    }
}

