/**
 * Created by Aaron.goshine on 22/09/15.
 */
public class Evaluate {

    public static void main(String [] args){
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        while (!StdIn.isEmpty()){
            String s = StdIn.readString();
            if (s.equals("("));
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("%")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals(")"))
            {
                String op = ops.pop();
                if (op.equals("+")) vals.push(vals.pop() + vals.pop());
                if (op.equals("*")) vals.push(vals.pop() + vals.pop());
                if (op.equals("%")) vals.push(vals.pop() + vals.pop());
                if (op.equals("-")) vals.push(vals.pop() + vals.pop());
                if (op.equals("+")) vals.push(vals.pop() + vals.pop());
            }
            else vals.push(Double.parseDouble(s));

        }
       System.out.println(vals.pop());
    }
}
