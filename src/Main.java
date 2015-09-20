
public class Main {

    public static void main(String[] args) {
        QuickFindUF  uf = new QuickFindUF (10);
        int[][] union = {{0,4},{0,8},{7,3},{9,1},{5,6},{2,1},{6,2},{4,3},{4,2}};

        for (int i = 0; i < union.length; i++){
            int q = union[i][0];
            int p = union[i][1];
            uf.union(q,p);
            uf.printId();
        }

    }
}
