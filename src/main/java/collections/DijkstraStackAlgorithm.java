package collections;

import java.util.Stack;

public class DijkstraStackAlgorithm {
   public static double evaluate(String input) {
       Stack<Character> ops  = new Stack<Character>();
       Stack<Double> vals = new Stack<Double>();
       for(int i=0; i < input.length(); i++) {
           char c = input.charAt(i);
           if (c == '(' || c == ' ') {
               ;
           } else if (c == '+'
                   || c == '*'
                   || c == '/'
                   || c == '-'
           ) {
                ops.push(c);
           } else if (c == ')') {
                char op = ops.pop();
                if (op == '+') {
                    vals.push(vals.pop() + vals.pop());
                } else if (op == '*') {
                    vals.push(vals.pop() * vals.pop());
                } else if (op == '/') {
                    vals.push(vals.pop() / vals.pop());
                } else if (op == '-') {
                    vals.push(vals.pop() - vals.pop());
                }
           } else {
               vals.push(Double.valueOf(String.valueOf(c)));
           }
       }
      return vals.pop();
   }

    public static void main(String[] args) {
        System.out.println(DijkstraStackAlgorithm.evaluate("((1+2)*(1-3)+(2+4)"));
    }
}
