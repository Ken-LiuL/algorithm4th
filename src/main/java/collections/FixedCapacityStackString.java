package collections;

public class FixedCapacityStackString {
    private String[] s;
    private int N;

    public FixedCapacityStackString(int capacity) {
        s = new String[capacity];
        this.N=0;
    }

    public boolean isEmpty() {
        return this.N == 0;
    }
    public void push(String item) {
        s[N++] = item;
    }

    public String pop() {
        //avoid loitering
        String item = s[--N];
        s[N] = null;
        return item;
    }
}
