package src.main.java.pl.edu.ur.oopl9;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Zad2 {
    public static void Zad2()
    {
        Random rand = new Random();
        TreeSet<Integer> treeRand = new TreeSet<>();
        for(int i=0;i<100;i++)
        {
            treeRand.add(rand.nextInt(10));
        }

        Iterator tree = treeRand.iterator();

        while(tree.hasNext())
        {
            Integer value = (Integer)tree.next();
            System.out.println("Value: "+value);
        }
        Main.main(new String[0]);
        /**
         * Otrzymujemy jedną wartość tylko raz(duplikaty są ignorowane)
         */

    }
}
