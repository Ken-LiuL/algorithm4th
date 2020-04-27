package sorting;

import java.util.Random;

public class SimpleShuffle {
    public static void shuffle(Object[] a) {
        Random rand = new Random();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int r  = rand.nextInt(i+1);
            exch(a, i , r);
        }
    }

    private static void exch(Object[] a, int i , int j) {
         Object tmp = a[i];
         a[i] = a[j];
         a[j] = tmp;
    }
}
