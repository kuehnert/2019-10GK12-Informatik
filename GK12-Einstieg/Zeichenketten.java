public class Zeichenketten {
    private String vokaleKlein = "aeiouäöü";
    private String vokaleGross = vokaleKlein.toUpperCase();
    private String vokale = vokaleKlein + vokaleGross;

    public boolean enthaelt(String s, char c) {
        for (int i = 0; i < s.length(); i = i + 1) {
            if (c == s.charAt(i) ) {
                return true;
            }
        }

        return false;
    }

    public boolean istGrosserVokal(char c) {
        return enthaelt(vokaleGross, c);
    }

    public boolean istKleinerVokal(char c) {
        return enthaelt(vokaleKlein, c);
    }

    public boolean istVokal(char c) {
        return enthaelt(vokale, c);
    }

    public void testIstVokal() {
        test(true, istVokal('a'));
        test(true, istVokal('ö'));
        test(true, istVokal('p'));
        test(false, istVokal('!'));
        test(false, istVokal(' '));
    }

    // "Hallo!" => 0.4
    public double anteilVokale(String t) {
        // ? Machen Sie mal!
        return 0.0;
    }
    
    public String doubleInProzent(double d) {
        return String.format("%f %%", d);
    }
    
    public void testAnteilVokale() {
        test("60 %", doubleInProzent(anteilVokale("Hallo")));
        test("0 %", doubleInProzent(anteilVokale("Hhhhh")));       
        test("100 %", doubleInProzent(anteilVokale("Aaaaaaaaaaa")));       
    }
    
    public String kopiere(String input) {
        String output = "";

        for (int i = 0; i < input.length(); i = i + 1) {
            char zeichen = input.charAt(i);
            output = output + zeichen;
        }

        return output;
    }

    public String reverse(String input) {
        String output = "";

        for (int i = 1; i <= input.length(); i = i + 1) {
            int stelle = input.length() - i;
            char zeichen = input.charAt( stelle );
            output = output + zeichen;
        }

        return output;
    }

    public String ersetze(String input, char gesucht) {
        String output = "";

        for (int i = 0; i < input.length(); i = i + 1) {
            char zeichen = input.charAt(i);

            if (zeichen == gesucht) {
                output = output + "X";
            } else {
                output = output + zeichen;
            }
        }

        return output;        
    }

    // 1. 2. Param für das Ersatzzeichen
    // 2. Chinesen mit dem Kontrabaß

    public void testeKopiere() {
        test("", kopiere(""));
        test("Hallo", kopiere("Hallo"));
        test("ABCDEFG", kopiere("ABCDEFG"));

        test("", reverse(""));
        test("Hallo", reverse("ollaH"));
        test("ABCDEFG", reverse("GFEDCBA"));

        test("XNDX", ersetze("ENDE", 'E'));
        test("TNDT", ersetze("ENDE", 'E'));
    }

    private void test(Object gewuenscht, Object ergebnis) {
        if (gewuenscht.equals(ergebnis)) {
            System.out.print(".");
        } else {
            System.out.print("FEHLER ");
            System.out.print("Erwartet: " + gewuenscht);
            System.out.println(", erhalten: " + ergebnis);
        }
    }
}

/*
 * Hausaufgaben: ✔
 * 
 * 1. Schreibe nach dem Muster oben eine Methode
 *    reverse(), die einen String rückwärts zurückgibt
 *    "Hallo" => "ollaH"
 * 
 * 2. Schreibe analog eine Methode, die jedes 2. Zeichen
 *    eines Texts ausgibt. Aus "Hollywood" wird "Hlyod"
 */

/*
 * Weitere Aufgaben:
 * 1. Besprechen die Hausaufgaben
 *  
 * 2. Schreiben Sie eine Methode „boolean istVokal(char zeichen)“,
 *    und zurückgibt, ob es sich dabei um einen Vokal handelt oder nicht
 *  
 * 3, Chinesen pimpen:
 *    a. unterscheiden nach Groß-Klein-Schreibung
 *       "Ächzen" => "Öchzön"
 *    b. Diphotonge (Doppelvokale):
 *       ´"Drei" => "Drö"
 */