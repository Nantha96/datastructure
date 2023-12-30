import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListStack {

    LinkedList<Integer> stack;
    int idx = -1;
    public LinkedListStack() {
        stack= new LinkedList<>();
    }

    public void push(int x) {
        stack.addLast(x);
        idx++;
    }

    public int pop() {
        return stack.removeLast();
    }

    public int top() {
        return stack.getLast();
    }

    public boolean empty() {
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        ArrayListStack als = new ArrayListStack();
        als.push(1);
        als.push(10);
        System.out.println(als.top());
        System.out.println(als.empty());
        System.out.println(als.pop());
        System.out.println(als.pop());
        System.out.println(als.empty());

    }
}
