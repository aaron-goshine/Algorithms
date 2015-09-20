/**
 * Created by Aaron.goshine on 08/09/15.
 */
public class QuickUnionUF {
    private int [] id;
    private int count;

    public QuickUnionUF(int N){
        count = N;
        id = new int [N];
        for (int i = 0; i < N; i++) id [i] = i;
    }

    public int[] getId (){
        return id;
    }

    public void printId (){
        for (int i = 0; i < id.length; i++)
            System.out.print(id[i] + " ");
        System.out.println( " ");
    }

    public int count (){
        return count;
    }

    private int root(int i){
        while (i != id[i] ) i = id[i];
        return i;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
