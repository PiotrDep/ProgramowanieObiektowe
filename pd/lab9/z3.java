import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Collections;

public class z3 {
    public static void main(String[] args) {
    ArrayList<String> plik = new ArrayList<String>();
    File file = new File("zed3.txt");
    try {
        Scanner in = new Scanner(file);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            plik.add(line);
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    System.out.print(plik+"\n");
    Collections.sort(plik);
    System.out.print(plik);
}
}

