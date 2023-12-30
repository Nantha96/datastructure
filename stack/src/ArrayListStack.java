import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayListStack {

    List<Integer> stack;
    int idx = -1;
    public ArrayListStack() {
        stack= new ArrayList<>();
    }

    public void push(int x) {
        stack.add(x);
        idx++;
    }

    public int pop() {
        return stack.remove(idx--);
    }

    public int top() {
        return stack.get(idx);
    }

    public boolean empty() {
        return idx==-1;
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
