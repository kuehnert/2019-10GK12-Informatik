import java.util.Scanner;

public class RateSpiel {
    public void rateSpiel() {
        Scanner tastaturEingabe = new Scanner(System.in);
        int richtigeZahl = (int) (Math.random() * 100) + 1;
        int benutzerZahl = -1;
        System.out.println("Willkommen beim Ratespiel! Rate eine Zahl zwischen eins und hundert");

        while (benutzerZahl != richtigeZahl) {
            System.out.print("Dein Tipp? ");
            benutzerZahl = tastaturEingabe.nextInt();

            if ( benutzerZahl == richtigeZahl )  {
                System.out.println("Gratuliere, Du hast meine Zahl erraten!");
            } else if (richtigeZahl < benutzerZahl ) {
                System.out.println("Meine Zahl ist kleiner!");
            } else {
                System.out.println("Meine Zahl ist größer!");
            }
        }
    }
}

// TODO: 
// 1. Versuche-Zähler
// 2. Man soll mehrere Spiele hintereinander spielen können
// 3. Highscore mit Namen speichern