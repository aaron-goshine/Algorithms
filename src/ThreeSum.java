/**
 * Created by Aaron.goshine on 10/09/15.
 */
public class ThreeSum {
    public static int count(int[] a) {
        int N = a.length;
        int count = 0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; i++)
                for (int k = 0; k < N; k++)
                    if (a[i] + a[j] + a[k] == 0)
                        count++;
        return count;
    }

    public static void main(String[] args) {
        int[] a = new int[Integer.getInteger(args[0])];
        System.out.println(count(a));
    }
}
