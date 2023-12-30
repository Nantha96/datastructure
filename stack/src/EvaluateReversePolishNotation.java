import java.util.Stack;

public class EvaluateReversePolishNotation {


    //Solution1 using Stack
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens)
        {
            switch(token){
                case "+":
                    stack.push(add(stack.pop(),stack.pop()));
                    break;
                case "-":
                    stack.push(sub(stack.pop(),stack.pop()));
                    break;
                case "*":
                    stack.push(mul(stack.pop(),stack.pop()));
                    break;
                case "/":
                    stack.push(div(stack.pop(),stack.pop()));
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public int add(int a,int b)
    {
        return b+a;
    }
    public int sub(int a,int b)
    {
        return b-a;
    }
    public int mul(int a,int b)
    {
        return b*a;
    }
    public int div(int a,int b)
    {
        return b/a;
    }


    //Solution 2 using array
    public int evalRPN1 (String[] tokens) {
        if(tokens.length == 1)
            return Integer.parseInt(tokens[0]);
        int j =-2;
        int k =-1;
        int res[] = new int[tokens.length/2+1];
        for(int i = 0;i < tokens.length ; i++)
        {
            switch(tokens[i]){
                case "+":
                    res[j] = res[j--]+res[k--];
                    break;
                case "-":
                    res[j] = res[j--]-res[k--];
                    break;
                case "*":
                    res[j] = res[j--]*res[k--];
                    break;
                case "/":
                    res[j] = res[j--]/res[k--];
                    break;
                default:
                    ++j;
                    res[++k] = Integer.parseInt(tokens[i]);
            }
        }
        return res[0];
    }

    public static void main(String[] args) {
        EvaluateReversePolishNotation rpn = new EvaluateReversePolishNotation();
        System.out.println(rpn.evalRPN(new String[]{"2","1","+","3","*"}));
        System.out.println(rpn.evalRPN1(new String[]{"2","1","+","3","*"}));
    }

}
