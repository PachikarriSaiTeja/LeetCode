class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder fs=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                    continue;
            }
            else{
             
                fs.append(s.charAt(i));
            }
        }
        String f=fs.toString().toLowerCase(); 
           return isP(f);
        
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