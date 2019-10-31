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
        while (einbezahlterBetrag < gesamtpreis) {
            System.out.println("Es fehlen noch " + 
                (gesamtpreis - einbezahlterBetrag) + " €.");
            System.out.print("Welche Münze oder welchen Schein " +
                "werfen Sie ein? ");
            int wert = tastaturEingabe.nextInt();
            
            // Wenn wert 5 ist oder wert gleich 10 ist...
            if (wert == 1 || wert == 2 || wert == 5 || wert == 10 ||
                wert == 20 || wert == 50 || wert == 100) {
                einbezahlterBetrag = einbezahlterBetrag + wert;
            } else {
                System.out.println("Sorry, kann " + wert + " € nicht annehmen");
            }
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
        System.out.println("#########################################\n"); 
        try { Thread.sleep(1000); } catch (Exception e) {}
    }

    public void druckeKarten() {
        // Solange wie noch nicht alle Karten gedruckt sind
        // Drucke eine Karte
        // Verringere die Anzahl noch zu druckender Karten um eins
        int gedruckteKarten = 0;
        
        while (gedruckteKarten < anzahlKarten) {
            druckeKarte();
            gedruckteKarten = gedruckteKarten + 1;
            System.out.println("Es wurden schon " + gedruckteKarten +
            " von " + anzahlKarten + " Karten gedruckt");
        }
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
