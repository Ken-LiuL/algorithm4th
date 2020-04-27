package sorting;

import java.util.concurrent.ConcurrentMap;

public class BasicSort {
    public static void selectionSort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if(less(a[j], a[min])){
                        min = j;
                }
            }
            exch(a, i, min);
        }
    }
    //shell sort is an enhanced version of sort algorithm
    public static void shellSort(Comparable[] a) {
        int n =  a.length;
        int h = 1;
        while(h < n / 3) {
            h = 3*h + 1;
        }
        while( h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && less(a[j], a[j-h]);j -=h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static void insertionSort(Comparable[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                 if(less(a[j], a[j-1])) {
                     exch(a, j , j-1);
                 } else {
                     break;
                 }
            }
        }
    }
    private static boolean less(Comparable a, Comparable b) {
        if(a.compareTo(b) < 0) {
            return true;
        }
        return false;
    }
    private static void exch(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 4, 2, 3, 10, 8, 9, 11, 20, 40};
        shellSort(a);
    }
}
