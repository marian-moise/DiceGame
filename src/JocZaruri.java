import java.util.Random;

public class JocZaruri {

    private int valoareZar;
    private static int numarTotalAruncari = 0;
    private int sumaJucator;

    /**
     * 1) un constructor JocZaruri(int sumaJucator)
     * ce va initializa campul sumaJucator al obiectului JocZaruri
     * cu suma disponibila pentru joc
     */

    public JocZaruri(int sumaJucator) {
        this.sumaJucator = sumaJucator;
    }

    /**
     * 2) aruncareZar()
     * ce va genera atribui campului valoareZar, al obiectului de tipul JocZaruri,
     * un numar aleator
     * intre 1 si 6 si va incrementa cu 1 campul static numarTotalAruncari;
     */
    public void aruncareZar() {
        Random random = new Random();
        int zar = random.nextInt(7);
        while (zar == 0) {
            zar = random.nextInt(7);
        }
        valoareZar = zar;
        numarTotalAruncari++;
    }

    /**
     * 3) static int comparareZaruri(JocZaruri zar1, JocZaruri zar2)
     * care va primi ca si parametru 2 obiecte de tipulJocZaruri si va intoarce:
     * -1 daca zar1.valoareZar e mai mare
     * 0 daca zarurile sunt egale
     * 1 daca zar2.valoareZar e mai mare
     */

    public static int comparareZaruri(JocZaruri zar1, JocZaruri zar2) {
        if (zar1.valoareZar > zar2.valoareZar) {
            return -1;
        } else if (zar2.valoareZar > zar1.valoareZar) {
            return 1;
        } else if (zar1.valoareZar == zar2.valoareZar) {
            return 0;
        } else {
            return 1;
        }

    }

    /**
     * 4) adaugaCastig()
     * ce va adauga la suma obiectului castigator miza unui joc, de ex. 10 lei
     */

    public void adaugaCastig(int miza) {
        sumaJucator = sumaJucator + miza;
    }


    /**
     * 5) scadePierdere()
     * ce va scadea din suma obiectului pierzator miza unui joc, de ex. 10 lei
     */

    public void scadePierdere(int miza) {
        sumaJucator = sumaJucator - miza;
    }


    /**
     * 6) int getSumaJucator()
     * va intoarce valoarea campului sumaJucator al obiectului current
     */

    public int getSumaJucator() {
        return sumaJucator;
    }


    /**
     * 7) static int getNumarTotalAruncari()
     * va intoarce valoarea campului static numarTotalAruncari
     */

    public static int getNumarTotalaruncari() {
        return numarTotalAruncari;
    }

    public int getValoareZar() {
        return valoareZar;
    }
}
