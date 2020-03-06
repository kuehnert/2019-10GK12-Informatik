public class Verschluesssung {
    private char caesarBuchstabe(char zeichen, int key) {
        // Type casting: (double) 5.5f; 
        int verschluesselt = zeichen + key;
        
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
    
    public void testCaesar() {
        System.out.println("FEHLER! Key 75 ist ungültig <-> " + caesar("", 75) );
        System.out.println("B <-> " + caesar("A", 1) );
        System.out.println(" <-> " + caesar("Z", 1) );
        System.out.println(caesar("ABCDEFQRSTUVWXYZ", 15) );
    }
}
