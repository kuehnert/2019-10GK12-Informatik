public class Kommazahlen {
    public void m1() {
        float r = 0.1234567f;
        System.out.println( r );

        r = 0.12345672901234567890f;
        System.out.println( r );

        r = 0.0000000034000000f;
        System.out.println( r );

        r = 10.0f/3f;
        System.out.println(r);

        r = 10.0f/6f;
        System.out.println(r);

        r = 10/3;
        System.out.println(r);

    }

    public void m2() {
        double r = 0.1234567d;
        System.out.println( r );

        r = 0.12345672901234567890d;
        System.out.println( r );

        r = 0.0000000034000000d;
        System.out.println( r );

        r = 10.0d/3d;
        System.out.println(r);

        r = 10.0d/6d;
        System.out.println(r);

        r = 10/3;
        System.out.println(r);

    }
    
    public void darstellung() {
        double d = 10.35d;
        
        System.out.printf("Hallo Welt\n");
        System.out.printf("-->Hallo<--\n");
        System.out.printf("-->%f<--\n", d);
        System.out.printf("-->%.2f<--\n", d);
        System.out.printf("-->%.2f %.2f %.2f<--\n", d, 1.1, 1.2);
        System.out.printf("-->%2d<--\n", 100);
    }
    
    public void weltbevoelkerung() {
        double pop = 7600000000d;
        double delta = 80000000d;
        double factor = 1 + delta / pop;
        int jahr = 2019;
        
        while (jahr < 2050) {
            pop = pop * factor;
            jahr = jahr + 1;
            
            // System.out.println(jahr + ": Bevölkerung " + pop);
            System.out.printf("%d: Bevölkerung %.0f Menchen\n", jahr, pop);
        }
    }
    
    
    
    
    
}