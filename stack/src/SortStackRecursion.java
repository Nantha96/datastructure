import java.util.Iterator;
import java.util.Stack;

public class SortStackRecursion {


    void sort(Stack<Integer> stack)
    {
        if(stack.isEmpty())
            return;

        int tmp = stack.pop();
        sort(stack);

        insertAtValidPosition(stack,tmp);
    }

    void insertAtValidPosition(Stack<Integer> stack,int val)
    {

        if(stack.isEmpty() || val < stack.peek())
        {
            stack.push(val);
            return;
        }
        int tmp = stack.pop();
        insertAtValidPosition(stack,val);
        stack.push(tmp);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        SortStackRecursion ssr = new SortStackRecursion();
        System.out.println(stack.toString());
        ssr.sort(stack);
        // Print using toString()
        System.out.println(stack.toString());
        // Print using streams
        stack.forEach(System.out::print);
        System.out.println();
        // Print using iterator
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();
        // Print with pop
        while (!stack.isEmpty())
            System.out.print(stack.pop());
    }
}
