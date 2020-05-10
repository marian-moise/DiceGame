import java.util.Scanner;

public class Main {
    /**
     Scrieti o clasa numita JocZaruri, care sa aiba urmatoarele campuri:
     private int valoareZar; 1….6
     private static int numarTotalAruncari;
     private int sumaJucator;

     */

    public static void main(String[] args) {
        JocZaruri jucator1 = new JocZaruri(100);
        JocZaruri jucator2 = new JocZaruri(100);
        Scanner tastatura = new Scanner(System.in);
        String raspuns;
        System.out.println("Doriti sa jucati? ");
        raspuns = tastatura.next();
        while (raspuns.toLowerCase().equals("da")) {
            jucator1.aruncareZar();
            jucator2.aruncareZar();
            System.out.println("Jucatorul 1 a dat: " + jucator1.getValoareZar());
            System.out.println("Jucatorul 2 a dat: " + jucator2.getValoareZar());
            switch (JocZaruri.comparareZaruri(jucator1, jucator2)) {
                case -1: {
                    jucator1.adaugaCastig(10);
                    jucator2.scadePierdere(10);
                    break;
                }
                case 1: {
                    jucator2.adaugaCastig(10);
                    jucator1.scadePierdere(10);
                    break;
                }
            }
            if (jucator1.getSumaJucator() == 0) {
                System.out.println("Jucatorul 2 a castigat! ");
                break;
            }
            if (jucator2.getSumaJucator() == 0) {
                System.out.println("Jucatorul 1 a castigat! ");
                break;
            }
            System.out.println("Doriti sa jucati? ");
            raspuns = tastatura.next();
        }
//        System.out.println("Numar total de aruncari: " + JocZaruri.getNumarTotalaruncari());
//        System.out.println("Jucatorul 1 a ramas cu: " + jucator1.getSumaJucator());
//        System.out.println("Jucatorul 2 a ramas cu: " + jucator2.getSumaJucator());
    }
}
