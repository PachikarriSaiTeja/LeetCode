class Solution {
    public String removeDuplicates(String s) {
int i=0;
     Stack<Character> st=new Stack<>();
      while(i<s.length())
    {
        if(!st.isEmpty()&&st.peek()==s.charAt(i))
        {
            st.pop();
            i++;
        }
        else{
        st.push(s.charAt(i));
        i++;
        }

    }
    StringBuilder sb=new StringBuilder();
    while(!st.isEmpty())
    {
        Character ch=st.pop();
        sb.append(ch);
    }
    
   return sb.reverse().toString();
    }
}