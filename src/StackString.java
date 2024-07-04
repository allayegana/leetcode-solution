import java.util.Objects;
import java.util.Stack;

public class StackString {


    public static boolean  stac(){

        Stack<String> st = new Stack<>();
        st.push("(");
        st.push(")");
        st.push("[");
        st.push("]");
        st.push("{");
        st.push("}");

        if (!Objects.equals(st.peek(), "}")){
            return false;
        }else {
            return true;
        }

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push onto the stack.
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If the stack is empty or the top doesn't match the closing bracket, return false.
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets were matched correctly.
        return stack.isEmpty();
    }



    public static void main(String[] args) {

        System.out.println(stac());
    }
}
