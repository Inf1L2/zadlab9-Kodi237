package src.main.java.pl.edu.ur.oopl9;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zad1 {

    public static Integer[] sort(Integer[] tab)
    {
        Arrays.sort(tab);
        System.out.println("Sorting complete!");
        return tab;
    }

    public static void list(Integer[] tab)
    {
        for(int i=0;i<tab.length;i++)
        {
            System.out.println("tab["+i+"]: "+tab[i]);
        }
    }

    public static void Zad1()
    {
        int w;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        Integer[] tab = new Integer[100];
        for(int i=0;i<tab.length;i++)
        {
            tab[i] = rand.nextInt(100);
        }
        System.out.println("Array of 100 random numbers have been created!");
        do {
            System.out.println("\n1.Display\n2.Sort\n3.Go back to main menu\n");
            System.out.println("Your choice:" );
            w = in.nextInt();
            switch (w) {
                case 1:
                    list(tab);
                    break;
                case 2:
                    sort(tab);
                    break;
                case 3:
                    Main.main(new String[0]);
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }while(w!=3);
    }
}
