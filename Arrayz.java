import java.util.Arrays;

public class Arrayz {

    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    //

    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe e)
        System.out.println("Aufgabe e)");
        System.out.println(Arrays.toString(sort(new double[] {2,3,4,5})));
        System.out.println(Arrays.toString(sort(new double[] {7,2,10,90})));
        System.out.println(Arrays.toString(sort(new double[] {-7,-1,5,20})));
        System.out.println(Arrays.toString(sort(new double[] {0,0,0,0})));
        // TODO: Schreibe mehr Testcode
        System.out.println(); }

    public static double[] sort(double[] array) {
        boolean sorted = false;
        while (sorted == false) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;

                }
            }
        }
        return array;
    
    }

        
   

    // Test-Code für Teilaufgabe f)
    // System.out.println("Aufgabe f)");
    // int[][] magicSquare = new int[][] { { 12, 6, 15, 1 },
    // { 13, 3, 10, 8 },
    // { 2, 16, 5, 11 },
    // { 7, 9, 4, 14 }
    // };
    // System.out.println(isMagicSquare(magicSquare));
    // int[][] nonMagicSquare = new int[][] { { 1, 6, 15, 1 },
    // { 13, 3, 10, 8 },
    // { 2, 16, 5, 11 },
    // { 7, 9, 4, 14 }
    // };
    // System.out.println(isMagicSquare(nonMagicSquare));
    // System.out.println();
    // }
}
