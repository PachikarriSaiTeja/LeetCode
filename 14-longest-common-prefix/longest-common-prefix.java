class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        int cnt=0;
        Boolean k=false;
        char pr='k';
        if(strs[0].length()<1 || strs.length==1){
            return strs[0];
        }
        
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++)
            {
                if(i==strs[j].length()){
                    return ans;
                }
                pr=strs[j].charAt(i);
                if(i==strs[j].length() || pr!=strs[0].charAt(i))
                {
                    return ans;
                }

            }
            ans+=pr;
        }



        return ans;
        
    }
}