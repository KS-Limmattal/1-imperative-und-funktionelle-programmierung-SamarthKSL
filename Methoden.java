public class Methoden {
    public static void hours(int Seconds){
        int hours = Seconds/3600;
        int minutes = (Seconds % 3600)/60;
        int seconds = Seconds % 60;

         String output = hours + ":" 
                      + (minutes < 10 ? "0" + minutes : minutes) + ":" 
                      + (seconds < 10 ? "0" + seconds : seconds);

        System.out.println(output);
    }

    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    
    public static void main(String[] args){
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        hours(3);
        hours(75);
        hours(0);
        hours(59);
        hours(360);
        hours(456);
        hours(1200);
        hours(4423);
        hours(14039283);
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");
        distance(0,0,3,4);
        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println(distance(0,0,3,4));
        System.out.println(distance(1,1,3,4));
        System.out.println(distance(4,3,0,0));
        System.out.println(distance(0,0,0,0));

        
    }
    
    public static double distance(int x1, int y1, int x2, int y2){
        int dx = x2 - x1;
        int dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

   
    

}

