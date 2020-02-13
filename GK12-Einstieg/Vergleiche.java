import java.util.Scanner;

public class Vergleiche {
    Scanner scanner = new Scanner(System.in);

    public void tippen() {
        String richtig = "England ist klein";
        System.out.print("Tippe  : „"+richtig+"“\nEingabe: ");
        String eingabe = scanner.nextLine();

        if ( richtig.equals(eingabe) ) {
            System.out.println("Super!");
        } else if (richtig.equalsIgnoreCase(eingabe)) {
            System.out.println("mUTTU großSCHREIBEN LERNEN");
        } else {
            System.out.println("Leider flasch");
        }
    }
}
