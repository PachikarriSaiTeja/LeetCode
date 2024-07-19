class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        if(!sb.toString().contains(part))
        {
            return sb.toString();
        }
        int a=sb.indexOf(part);
        int b=a+part.length();
        return removeOccurrences(sb.replace(a,b,"").toString(),part);
        
    }
}