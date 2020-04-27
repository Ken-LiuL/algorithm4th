package fundamental;

public class QuickUnion {

    private int n;
    private int[] arr;
    private int[] sz;

    public QuickUnion(int n) {
        this.n = n;
        this.arr = new int[n];
        this.sz = new int[n];
        for(int i = 0; i < n; i++ ) {
            this.arr[i] = i;
            this.sz[i] = 1;
        }
    }

    private int root(int p) {
        while(p != this.arr[p]) {
            //flat the hierarchy tree
            this.arr[p] = this.arr[this.arr[p]];
            p = this.arr[p];
        }
        return p;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int rootp = root(p);
        int rootq = root(q);
        if(rootp == rootq) return;
        if (sz[rootp] < sz[rootq]) {
            this.arr[rootp] = rootq;
            sz[rootq] += sz[rootp];
        } else {
            this.arr[rootq] = rootp;
            sz[rootp] += sz[rootq];
        }

    }

    public void print() {
        for(int i=0; i < this.n; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println("");
        for(int i=0; i < this.n; i++) {
            System.out.printf("%d ", this.arr[i]);
        }
    }

    public static void main(String[] args) {
        QuickUnion qu = new QuickUnion(10);
        qu.union(4, 3);
        qu.union(3, 8);
        qu.print();

        qu.union(6, 5);
        qu.union(9, 4);
        qu.union(2, 1);
        qu.union(8, 9);
        qu.union(5, 0);
        qu.union(7, 2);
        qu.union(6, 1);
        qu.print();
    }

}
