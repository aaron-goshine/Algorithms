/**
 * Created by Aaron.goshine on 22/09/15.
 */
public class Insertion {

  public static void sort(Comparable [] a){
    int N = a.length;
    for (int i = 0; i < N; i++) {
      int min = i;
      for(int j = 1; j > 0; j--) {
        if (less(a[j], a[j-1])) {
          exch(a, j, j-1);
        } else{
          break;
        }
      }
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
