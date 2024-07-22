import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa");
        String primaStringa=scanner.nextLine();
        System.out.println("Inserisci la seconda stringa");
        String secondaStringa=scanner.nextLine();
        System.out.println("Inserisci la terza stringa");
        String terzaStringa=scanner.nextLine();

        System.out.println("Le stringhe concatenate in ordine corretto sono: " + primaStringa+secondaStringa+terzaStringa);
        System.out.println("Le stringhe concatenate in ordine inverso sono: " + terzaStringa+secondaStringa+primaStringa);

    }


}
