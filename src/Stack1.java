import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack ban đầu: " + stack);

        int topElement = stack.pop();
        System.out.println("Phần tử được pop: " + topElement);

        int peekElement = stack.peek();
        System.out.println("Phần tử trên đỉnh: " + peekElement);
    }
}