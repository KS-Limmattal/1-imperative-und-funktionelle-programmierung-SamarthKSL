public class Loops {
    

    public static void primeFactorisation(int n) {
        System.out.print("Prime factorisation of " + n + " = ");
        int den = 2;
        while (n != 1) {
            if(n % den == 0) {
                System.out.print(den);
                n = n/den;
                if (n !=  1){
                    System.out.print(" * ");
                    }
                 }
            else {
                den++;
            }
    }  
    System.out.println();

}


public static double pi(int digits) {
        double approx = 0.0;
        double term;
        int k = 0;

        double precision = Math.pow(10, -digits); 

        double oldPi;
        do {
            oldPi = approx;
            term = Math.pow(-1, k) * 4.0 / (2 * k + 1);
            approx += term;
            k++;
        } while (Math.abs(approx - oldPi) > precision);

        return approx;
    }




    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    
    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        primeFactorisation(12);
        primeFactorisation(75);
        primeFactorisation(34);
        primeFactorisation(300);
        primeFactorisation(13);
        primeFactorisation(2454);
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        for (int n = 0; n < 12; n++){
        System.out.println("Pi approximated to " + n + " digits with pi()  is " + pi(n));
        }
        System.out.println();
    }
    }


