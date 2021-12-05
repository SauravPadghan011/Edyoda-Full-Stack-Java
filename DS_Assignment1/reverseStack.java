package edyoda.DS_Assignment1;
import java.util.Stack;

class reverseStack {
    public static Stack<Integer> stack = new Stack<>();

    static void insert_at_bottom(int x) {

        if(stack.isEmpty())
            stack.push(x);
        else {
            int a = stack.peek();
            stack.pop();
            insert_at_bottom(x);
            stack.push(a);
        }
    }
    static void reverse() {
        if(stack.size() > 0) {
            int x = stack.peek();
            stack.pop();
            reverse();
            insert_at_bottom(x);
        }
    }

    public static void main(String[] args)
    {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.print("Original Stack: ");
        System.out.println(stack);
        reverse();

        System.out.print("Reversed Stack: ");
        System.out.println(stack);
    }
}
