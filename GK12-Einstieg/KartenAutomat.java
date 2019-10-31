import java.util.Scanner;

public class KartenAutomat {
    private Scanner tastaturEingabe;
    private int kartenpreis;
    private int einbezahlterBetrag;
    private int anzahlKarten;
    private int gesamtpreis;
    private int wechselgeld;

    // Konstruktor
    public KartenAutomat() {
        tastaturEingabe = new Scanner(System.in);
        kartenpreis = 37;
        hauptprogramm();
    }

    public void zeigeMenu() {
        einbezahlterBetrag = 0;

        System.out.println("Willkommen im Phantaseeland");
        System.out.println("Eine Karte kostet " + kartenpreis + " €");
    }

    public void berechneGesamtpreis() {
        gesamtpreis = kartenpreis * anzahlKarten;
        System.out.println("Sie müssen " + gesamtpreis + " € bezahlen");
    }

    public void nimmGeldAn() {
        // Der Benutzer wirft nacheinander Euro-Münzen oder Scheine ein
        // bis genügend Geld eingeworfen wurde
        // TODO: nimm nur gültige Werte an: 1, 2, 5, 10, 20, 50, 100
        while (einbezahlterBetrag < gesamtpreis) {
            System.out.println("Es fehlen noch " + 
                (gesamtpreis - einbezahlterBetrag) + " €.");
            System.out.print("Welche Münze oder welchen Schein " +
                "werfen Sie ein? ");
            int wert = tastaturEingabe.nextInt();
            einbezahlterBetrag = einbezahlterBetrag + wert;
        }
    }

    public void ermittleAnzahl() {
        System.out.print("Wieviele Karten möchten Sie? ");
        anzahlKarten = tastaturEingabe.nextInt();
    }

    public void gibWechselgeld() {
        int wechselgeld = einbezahlterBetrag - gesamtpreis;
        
        if (wechselgeld > 0) {
            System.out.println("Sie bekommen noch " + wechselgeld 
                + " € zurück.");
            // TODO: Gib Wechselgeld in echten Scheinen/Münzen
            // gestückelt zurück
        }
    }

    public void druckeKarte() {
        System.out.println("#########################################");
        System.out.println("# Eine Karte fürs Phantaseeland         #");
        System.out.println("#########################################"); 
    }

    public void druckeKarten() {
        // Solange wie noch nicht alle Karten gedruckt sind
        // Drucke eine Karte
        // Verringere die Anzahl noch zu druckender Karten um eins
    }
    
    public void hauptprogramm() {
        zeigeMenu();
        ermittleAnzahl();
        berechneGesamtpreis();
        nimmGeldAn();
        gibWechselgeld();
        druckeKarten();
    }
}
