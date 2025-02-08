class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
       
        int ind=0;
        int j=0;
        int n=0;
        String lon="";
        if(word1.length()>=word2.length()){
            n=word2.length();
             lon=word1;
        }
        else{
            n=word1.length();
            lon=word2;
            

        }
for(int i=0;i<n;i++)
{
    sb.append(word1.charAt(i));
    sb.append(word2.charAt(i));
}

sb.append(lon.substring(n));
       
        return sb.toString();
        
    }
}