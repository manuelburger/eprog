import java.util.Random;
import java.util.Scanner;

public class RechenUebungen {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie viele Terme maximal? ");
        int maxTerme = scanner.nextInt();
        System.out.print("Wie grosse Zahlen maximal? ");
        int maxZahl = scanner.nextInt();
        
        if(maxTerme < 2 || maxZahl < 1)
            System.out.println("Ungültige Eingabe");
        else
            rechenUebungen(maxTerme, maxZahl);
    }
    
    static void rechenUebungen(int maxTerme, int maxZahl) {
        
        //TODO: Implement Game
        
        
    }
    
    static int[] zufallsTerme(int maxTerme, int maxZahl, Random random) {
        
        //TODO: Generate array of random terms
        
    }
    
    static String aufgabe(int[] terme) {
        
        //TODO: Generate exercise string from term array
        
    }
    
    static int summe(int[] terme) {
        
        //TODO: return sum of input term array
        
    }
}
