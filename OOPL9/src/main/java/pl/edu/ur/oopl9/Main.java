package src.main.java.pl.edu.ur.oopl9;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int w;
        Scanner s = new Scanner(System.in);
        System.out.println("Choose an exercise (1, 2 or 4)");
        w = s.nextInt();
        switch (w)
        {
            case 1:
                Zad1.Zad1();
                break;
            case 2:
                Zad2.Zad2();
                break;
            case 4:
                Zad4.Zad4();
                break;
            default:
                System.out.println("Invalid exercise number! Beginning shutdown sequence...");
                break;
        }
    }
}
