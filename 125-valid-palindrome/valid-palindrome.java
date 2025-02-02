class Solution {
    public boolean isPalindrome(String s) {
       String fs="";
        for(int i=0;i<s.length();i++){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                    continue;
            }
            else{
             
                fs+=s.charAt(i);
            }
        }
        fs=fs.toLowerCase();
        System.out.println(fs.length());
        if(fs.length()<=1)
        {
            return true;
        }
        
           return isP(fs);
        
    }
    public boolean isP(String s)
    {
             int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i+=1;
            j-=1;

        }
        return true;
    }
   
}