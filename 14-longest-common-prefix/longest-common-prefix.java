class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        Arrays.sort(strs);
        StringBuilder res = new StringBuilder();
        int i=0;
        while(i<strs[0].length() && strs[0].charAt(i)==strs[strs.length-1].charAt(i))
        {
            res.append(strs[0].charAt(i));
            i+=1;
        }
        return res.toString();
    }
}