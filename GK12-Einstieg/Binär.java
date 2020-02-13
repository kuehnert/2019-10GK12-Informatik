public class Binär {
    private String toBinaryAlt(int n) {
        if (n == 0) {
            return "00000";
        }

        // 1. Erzeuge einen leeren String
        String output = "";

        // 2. 
        int wert = 16;
        while (n > 0) {
            // System.out.println(wert + ", " + n);

            if (n >= wert) {
                output = output + "1";
                n = n - wert;
            } else {
                output = output + "0";
            }

            wert = wert / 2;
        }

        // 3. Gib den fertigen String zurück
        return output;
    }

    private String toBinary(int n) {
        // 1. Erzeuge einen leeren String
        String output = "";

        // 2. 
        do {
            // System.out.println(n);

            if (n % 2 == 0) {
                output = "0" + output;
            } else {
                output = "1" + output;
            }

            n = n/ 2;
        } while (n > 0);

        // 3. Gib den fertigen String zurück
        return output;
    }

    public void testToBinary() {
        test("00000", toBinaryAlt(0));
        test("0", toBinary(0));
        
        test("00001", toBinaryAlt(1));
        test("1", toBinary(1));
        
        test("00101", toBinaryAlt(5));
        test("101", toBinary(5));
        
        test("10111", toBinaryAlt(23));
        test("10111", toBinary(23));
        
        test("11101", toBinaryAlt(29));
        test("11101", toBinary(29));
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
}
