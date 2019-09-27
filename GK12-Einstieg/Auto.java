public class Auto {
    private String marke;
    private String kennzeichen;
    private int ps;
    private int preis;
    
    public Auto(String neueMarke, String neuesKennzeichen, 
            int neuePS, int neuerPreis) {
        marke = neueMarke;
        kennzeichen = neuesKennzeichen;
        ps = neuePS;
        preis = neuerPreis;
    }
    
    public String gibMarke() {
        return marke;
    }
    
    public String gibKennzeichen() {
        return kennzeichen;
    }
    
    public int gibPreis() {
        return preis;
    }
}
