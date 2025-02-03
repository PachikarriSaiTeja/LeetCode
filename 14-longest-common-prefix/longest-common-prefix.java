class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        Arrays.sort(strs);
        String res="";
        int i=0;
        while(i<strs[0].length() && strs[0].charAt(i)==strs[strs.length-1].charAt(i))
        {
            res+=strs[0].charAt(i);
            i+=1;
        }
        return res;
    }
}