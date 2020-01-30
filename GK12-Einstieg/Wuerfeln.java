public class Wuerfeln {
    // Ziel:
    // 1000 Würfeln mit einem 6-seitigen Würfel
    // Festhalten, wie oft jede Zahl geworfen wurde
    // Wie bewertet man die Qualität der geworfenen Zufallszahlen?
    
    public void tausendWuerfel() {
        int durchgang = 0;
        
        // Schleife, die 1000 Mal läuft
        while (durchgang < 1000) {
            // Generiere eine Zufallszahl zwischen 1..6
            int w = (int) (Math.random() * 6.0) + 1;
            // Math.random() => 0.0 <= w < 1.0
            // * 6 =>           0.0 <= w < 6.0
            // (int)            0   <= w <= 5
            // + 1   =>         1   <= w <= 6
            
            System.out.print(w + ", ");
            
            durchgang = durchgang + 1;
        }
    }
}
