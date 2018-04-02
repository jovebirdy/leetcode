class Solution {
    public String reverseString(String s) {
        StringBuilder t = new StringBuilder();
        for(int i = s.length()-1; i >= 0 ; i--){
            t.append(s.charAt(i));
        }
        return t.toString();
    }
}
