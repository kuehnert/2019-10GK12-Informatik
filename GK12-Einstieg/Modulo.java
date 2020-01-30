public class Modulo {
    public void moduloDemo() {
        for (int i = 1; i <= 100; i = i + 1) {
            System.out.println(i + " % 5 = " + (i % 5));
        }
    }

    public void dsajhdja() {
        int x = letzteStelle(12345);
        int y = letzteStelle(21334);
    }

    public int letzteStelle(int x) {
        int letzteStelle = x % 10;
        return letzteStelle;
    }

    public int letztenBeidenStelle(int x) {
        return x % 100;
    }

    public int vorLetzteStelle(int x) {
        return x % 100 / 10;
    }
}
