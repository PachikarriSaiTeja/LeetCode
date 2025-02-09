class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        String vowels = "AEIOUaeiou";
        int i = 0, j = s.length() - 1;
        
        while (i < j) {
            // Find next vowel from the left
            while (i < j && vowels.indexOf(sb.charAt(i)) == -1) {
                i++;
            }
            // Find next vowel from the right
            while (i < j && vowels.indexOf(sb.charAt(j)) == -1) {
                j--;
            }
            
            // Swap the vowels
            if (i < j) {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
        }
        
        return sb.toString();
    }
}
