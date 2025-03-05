import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack<Integer>stackkk =new Stack<Integer>();
        stackkk.push(1);
        stackkk.push(2);
        stackkk.push(3);
        while(!stackkk.empty()){
            System.out.println(stackkk.peek());
            stackkk.pop();
        }
    }
    
}
