class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        StringBuilder sa=new StringBuilder(s1);
        StringBuilder sb=new StringBuilder(s2);
        int a=0;
        int cnt=0;
        int b=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                cnt+=1;
                if(a==0) a=i;
                else b=i;
                
            }
            
            if(cnt==2) break;
        }
      
       char temp = sb.charAt(a);
        sb.setCharAt(a, sb.charAt(b));
        sb.setCharAt(b, temp);
        
        // System.out.println(sa.toString());
        
        return sa.toString().equals(sb.toString());


       
    }
}