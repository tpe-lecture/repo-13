package tpe.nested.lambda;

import java.util.Arrays;

/**
 * Hauptklasse.
 */
public class Main {

    private static final int[] ZAHLEN = {
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
    };

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeileargumente.
     */
    public static void main(String[] args) {

        NumberSelector s = new NumberSelector();

        // TODO: Gerade Zaheln filtern
        int[] gerade = null;
        Predicate<Integer> x = (a) -> a%2==0;
        gerade =s.filter(x, ZAHLEN);
        System.out.println(Arrays.toString(gerade));

        // TODO: Ungerade Zaheln filtern
        int[] ungerade = null;
        Predicate<Integer> y = (a) -> a%2==1;
        ungerade =s.filter(y, ZAHLEN);

        System.out.println(Arrays.toString(ungerade));

    }
}
