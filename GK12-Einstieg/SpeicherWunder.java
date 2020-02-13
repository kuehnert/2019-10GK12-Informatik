public class SpeicherWunder {
    // Das macht Java intern auch so ähnlich, wenn 
    // man Variabeln kopiert
    public String kopiere(String input) {
        String output = "";

        for (int i = 0; i < input.length(); i = i + 1) {
            char zeichen = input.charAt(i);
            output = output + zeichen + zeichen;
        }

        return output;
    }

    public void serienBrief () {
        String as = "AA";
        String bs = as;
        as = as + "BB";
        System.out.println(as); // AABB 
        System.out.println(bs); // AA

        int ia = 10;
        int ib = ia;        
        ia = ia + 10;
        System.out.println(ia); // 20
        System.out.println(ib); // 10

        Hilfe a = new Hilfe(10);
        Hilfe b = a;
        a.wert = a.wert + 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.wert); //? 20
        System.out.println(b.wert); //? 20

        String as2 = "Hallo";
        String bs2 = as2; //?
        String cs2 = kopiere(as2); //?
    }
}

class Hilfe {
    int wert;

    public Hilfe(int neuerWert) {
        wert = neuerWert;
    }
}
