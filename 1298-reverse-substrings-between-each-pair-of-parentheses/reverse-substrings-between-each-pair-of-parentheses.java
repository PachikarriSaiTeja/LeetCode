import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char o = s.charAt(i);
            
            if (o == ')') {
                while (st.peek() != '(') {
                    sb.append(st.pop());
                }
                st.pop(); // Pop the '('
                
                // Push reversed substring back into stack
                for (int j = 0; j < sb.length(); j++) {
                    st.push(sb.charAt(j));
                }
                
                // Clear StringBuilder after insertion into stack
                sb.setLength(0);
            } else {
                st.push(o);
            }
        }
        
        // Build the result string from stack
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.insert(0, st.pop());
        }
        
        return result.toString();
    }
}
