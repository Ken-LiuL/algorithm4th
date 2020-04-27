package collections;

public class ResizingArrayStackOfStrings {
    private String[] s;
    private int N;

    public ResizingArrayStackOfStrings() {
        this.s = new String[1];
    }

    public void push(String item) {
        if (N == s.length) {
            this.resize(2*s.length);
        } else {
            s[N++] = item;
        }
    }

    public String pop() {
        String item = s[--N];
        s[N] = null;
        if (N > 0 && N  == s.length / 4) {
            this.resize(s.length / 2);
        }
        return item;
    }

    private  void resize(int capacity) {
        String[] copy = new String[capacity];
        System.arraycopy(s, 0, copy, 0, s.length);
        this.s = copy;
    }
}
