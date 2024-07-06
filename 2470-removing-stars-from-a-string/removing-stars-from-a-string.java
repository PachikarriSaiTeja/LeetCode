class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {   Character o=s.charAt(i);
            if(!st.isEmpty()&&o.equals('*'))
            {
                st.pop();
            }
            else{
                st.push(o);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}