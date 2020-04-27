package fundamental;


public class QuickFind {

    private Integer n;
    private int[] arr;

    public QuickFind(int n) {
        this.n = n;
        this.arr = new int[this.n];
        for(int i=0;i < this.n; i++ ) {
            this.arr[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return this.arr[p] == this.arr[q];
    }

    public void  union(int p, int q)  {
        int replaced = this.arr[p];
        int replacement = this.arr[q];
        for(int i=0; i < this.n; i++) {
            if(this.arr[i] == replaced ) {
                this.arr[i] = replacement;
            }
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
        QuickFind qf = new QuickFind(10);
        qf.union(4, 3);
        qf.union(3, 8);
        qf.union(6, 5);
        qf.union(9, 4);
        qf.union(2, 1);
        qf.union(8, 9);
        qf.union(5, 0);
        qf.union(7, 2);
        qf.union(6, 1);
        qf.print();
    }
}
