class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder com = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                com.append(Character.toLowerCase(c));
            }
        }
        return com.toString().equals(com.reverse().toString());
    }
}
