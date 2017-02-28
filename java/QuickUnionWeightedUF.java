/**
 * Created by Aaron.goshine on 08/09/15.
 */
public class QuickUnionWeightedUF {
    private int[] id;
    private int[] sz;

    public QuickUnionWeightedUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
        sz = new int[N];
        for (int i = 0; i < N; i++) sz[i] = 1;
    }

    private int root(int i) {
        while (i != id[i]){
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public int[] getId (){
        return id;
    }

    public boolean connected(int p, int q) {

        return root(p) == root(q);
    }


    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) return;
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }


    }
}
