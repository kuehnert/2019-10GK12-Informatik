/**
 * Hausaufgaben
 * Caesar entschlüsseln: Das Entschlüsseln ist das Gleiche wie
 * eine Verschlüsselung mit negativen Key.
 * D.h. a == caesar( caesar(a, 10), -10 )
 */

public class Verschluesssung {
    private char caesarBuchstabe(char zeichen, int key) {
        // Type casting: (double) 5.5f; 
        int verschluesselt = zeichen + key;

        if (verschluesselt < 'A') {
            verschluesselt = verschluesselt + 26;
        }

        if (verschluesselt > 'Z') {
            verschluesselt = verschluesselt - 26;
        }

        return (char) verschluesselt;
    }

    public String caesar(String text, int key) {
        if (key > 25) {
            return "FEHLER! Key " + key + " ist ungültig!";
        }

        String output = ""; // leerer String

        for (int i = 0; i < text.length(); i = i + 1) {
            char aktuellesZeichen = text.charAt(i);
            output = output + caesarBuchstabe(aktuellesZeichen, key);
        }

        return output;
    }

    public String decaesar(String text, int key) {
        return caesar(text, -key);
    }

    public static String clean(String input) {
        String out = "";
        input = input.toUpperCase();
        
        for (int i = 0; i < input.length(); i += 1) {
            char c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                out += c;
            } else if (c == 'Ä') {
                out += "AE";
            } else if (c == 'Ö') {
                out += "OE";
            } else if (c == 'Ü') {
                out += "UE";
            } 
        }
        
        return out;
    }

    public static String blockify(String input) {
        // Hausaufgabe für die nicht vom Pferd gefallenen
        // und Corona-Virus-Patientjetztinundinnen
        // input = "ABCDEFGHIJKL"
        return "ABCDE FGHIJ KL";
    }
    
    public void testCaesar() {
        Utils.test("PQRSTUFGHIJKLMNO", caesar("ABCDEFQRSTUVWXYZ", 15) );
        Utils.test("ABCDEFQRSTUVWXYZ", decaesar("PQRSTUFGHIJKLMNO", 15) );
        Utils.test("DASISTHUND", clean("Das ist (!) 1 Hund?") );
        Utils.test("", clean(",.-#+)0=&\"/732189") );
        Utils.test("UEOEAESSUEOEAE", clean("üöäßÜÖÄ") );
    }
}
