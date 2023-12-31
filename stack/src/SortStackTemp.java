import java.util.Iterator;
import java.util.Stack;

public class SortStackTemp {

    void sort(Stack<Integer> stack)
    {
        if(stack.isEmpty())
            return;
        Stack<Integer> temp = new Stack<>();
        temp.push(stack.pop());
        while (!stack.isEmpty())
        {
            int tmp = stack.pop();
            if(tmp>temp.peek())
            {
                temp.push(tmp);
            }else {
                while(!temp.isEmpty())
                {
                    if(tmp<temp.peek())
                        stack.push(temp.pop());
                    else
                        break;
                }
                temp.push(tmp);
            }
        }

        while(!temp.isEmpty())
            stack.push(temp.pop());
    }
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        SortStackTemp sst = new SortStackTemp();
        System.out.println(stack.toString());
        sst.sort(stack);
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
