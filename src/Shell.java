/**
 * Created by Aaron.goshine on 22/09/15.
 */
public class Shell {

    public static void sort(Comparable [] a){
        int N = a.length;
        int h = 1;

        while ( h < N/3) {
            for (int i = h; i < N; i++){
                for (int j = i; j >= h && less(a[j], a[j-h]); j = h)
                    exch(a, j, j-h);
            }
            h = h/3;
        }
    }

    private static boolean less(Comparable v, Comparable w){
        //TODO
        return true;
    }

    private static boolean exch(Comparable [] a, int i, int j){
        //TODO
        return true;
    }
}

// O(N^2 / 2)