class Solution {
    public String clearDigits(String s) {
        int n=0;
        StringBuilder sb=new StringBuilder(s);
        while(isalnu(sb.toString())!=-1){
            
                n=isalnu(sb.toString());
                if(n!=-1)
                {
                    sb.deleteCharAt(n);
                }
              
                for(int i=n-1;i>-1;i--)
                {
                    if(Character.isLetter(sb.charAt(i))){
                        sb.deleteCharAt(i);
                        
                        break;
                    }
                }
                


        }
        return sb.toString();
        
    }
    public int isalnu(String s)
    {
        for(int i=s.length()-1;i>-1;i--)
        {
            if(Character.isDigit(s.charAt(i))){
                return i;
            }
        }
        return -1;

    }
}