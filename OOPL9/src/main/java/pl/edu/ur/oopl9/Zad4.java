package src.main.java.pl.edu.ur.oopl9;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad4 {
    public static void Zad4() {
        Map<String, String> words = new HashMap<>();
        words.put("tak", "yes");
        words.put("nie", "no");
        words.put("mieć", "have");
        words.put("człowiek", "human");
        words.put("mężczyzna", "man");
        words.put("kobieta", "woman");
        words.put("jeść", "eat");
        words.put("pić", "drink");
        words.put("grać", "play");
        words.put("owoce", "fruits");
        words.put("warzywa", "vegetables");
        words.put("spać", "sleep");
        words.put("sklep", "shop");
        words.put("proszę", "please");
        words.put("dziękuję", "thank you");
        words.put("oczywiście", "of course");
        words.put("imię", "name");
        words.put("nazwisko", "surname");
        words.put("to", "it");
        words.put("jest", "is");
        words.put("koniec!","Program will go back to main menu! ");

        Scanner s = new Scanner(System.in);
        String slowo;
        System.out.println("Type a word from list to translate(tak,nie,mieć,człowiek,mężczyzna,kobieta,jeść,pić,grać,owoce,warzywa,spać,sklep,proszę,dziękuje,oczywiście,imię,nazwisko,to,jest)");

        do {
            slowo = s.nextLine();
            System.out.println(slowo +" - "+ words.get(slowo));

        }while(!"koniec!".equals(slowo));
        Main.main(new String[0]);
    }
}