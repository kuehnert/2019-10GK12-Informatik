public class Roemisch extends Object {
    public void toRoman(int n) {
        while (n >= 1000) {
            System.out.print("M");
            n = n - 1000;
        }

        if (n >= 500) {
            System.out.print("D");
            n = n - 500;
        }

        while (n >= 100) {
            System.out.print("C");
            n = n - 100;
        }

        if (n >= 50) {
            System.out.print("L");
            n = n - 50;
        }

        while (n >= 10) {
            System.out.print("X");
            n = n - 10;
        }

        if (n >= 5) {
            System.out.print("V");
            n = n - 5;
        }

        while (n > 0) {
            System.out.print("I");
            n = n - 1;
        }
    }

    public String toRomanSubtract(int n) {
        String ausgabe = "";

        while (n >= 1000) {
            ausgabe = ausgabe + "M";
            n = n - 1000;
        }

        if (n >= 900)  {
            ausgabe = ausgabe +"CM";
            n = n - 900;
        }

        if (n >= 500) {
            ausgabe = ausgabe +"D";
            n = n - 500;
        }

        while (n >= 400) {
            ausgabe = ausgabe +"CD";
            n = n - 400;
        }

        while (n >= 100) {
            ausgabe = ausgabe +"C";
            n = n - 100;
        }

        if (n >= 90) {
            ausgabe = ausgabe + "XC";
            n = n - 90;
        }

        if (n >= 50) {
            ausgabe = ausgabe +"L";
            n = n - 50;
        }

        if (n >= 40) {
            ausgabe = ausgabe +"XL";
            n = n - 40;
        }

        while (n >= 10) {
            ausgabe = ausgabe +"X";
            n = n - 10;
        }

        if (n >= 9) {
            ausgabe = ausgabe +"IX";
            n = n - 9;
        }

        if (n >= 5) {
            ausgabe = ausgabe +"V";
            n = n - 5;
        }

        if (n >= 4) {
            ausgabe = ausgabe +"IV";
            n = n - 4;
        }

        while (n > 0) {
            ausgabe = ausgabe +"I";
            n = n - 1;
        }
        
        return ausgabe;
    }

    private void test(Object gewuenscht, Object ergebnis) {
        if (gewuenscht.equals(ergebnis)) {
            System.out.print(".");
        } else {
            System.out.println("\nFEHLER ");
            System.out.println("Erwartet: " + gewuenscht);
            System.out.println("Erhalten: " + ergebnis);
        }
    }
    
    public void testeRoemischSubtract() {
        test("MMMCMXCIX", toRomanSubtract(3999));
        test("XXXV", toRomanSubtract(35));
        test("X", toRomanSubtract(10));
    }

    public int toArabic(String roemisch) {
        for (int i = 0; i < roemisch.length(); i = i + 1) {
            System.out.println( roemisch.charAt(i) );
        }

        char aktuellesZeichen = roemisch.charAt(2);
        if (aktuellesZeichen == 'M') {
            return 1000;
        } else {
            return -1000;
        }
    }

    public void testeToArabic() {
        test(3398, toArabic("MMMCCCLXXXXVIII"));
        test(1666, toArabic("MDCLXVI"));
        test(8, toArabic("VIII"));
    }

    public void zeigWasDuDraufHast() {
        System.out.println( toString() );
        System.out.println( equals(this));
        System.out.println( equals(new Roemisch()));
        System.out.println( equals("dhjkshdjashd"));
    }
}
