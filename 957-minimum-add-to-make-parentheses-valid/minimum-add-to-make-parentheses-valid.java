class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
        Character o=s.charAt(i);
        if(o.equals('('))
        {
            st.push(o);
        }
        else if(o.equals(')'))
        {
            if(!st.isEmpty() && st.peek().equals('('))
            {
                 st.pop();
            }
            else
            {
                st.push(o);
            }
        }
        }
        return st.size();
        }
}