class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            Character o=s.charAt(i);
            if(o.equals(')'))
            {
                while(!st.peek().equals('('))
                {
                    sb.append(st.pop());
                    c++;
                    
                }
                st.pop();
                for(int j=0;j<sb.length();j++)
                {
                    st.push(sb.charAt(j));
                }
                sb.setLength(0);
                
            }
            else{
                st.push(o);
            }
        }
        
        while(!st.isEmpty())
        {
           sb.append(st.pop());
        }
        return sb.reverse().toString();
        
    }
}