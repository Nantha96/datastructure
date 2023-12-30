import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray())
        {
            switch(ch)
            {
                case '(':
                case '[':
                case '{':stack.push(ch);break;
                case ')':
                    if(stack.isEmpty())
                        return false;
                    if(stack.pop()!='(') return false;break;
                case ']':
                    if(stack.isEmpty())
                        return false;
                    if(stack.pop()!='[') return false;break;
                case '}':
                    if(stack.isEmpty())
                        return false;
                    if(stack.pop()!='{') return false;break;
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args){
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("{}{}{}"));
    }
}
