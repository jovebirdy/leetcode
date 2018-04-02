class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return true;
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char c1 = 0;
            while (start <= end && (c1 = getChar(s, start)) == 0) {
                start++;
            } 
            char c2 = 0;
            while (end >= start && (c2 = getChar(s, end)) == 0) {
                end--;
            }
            if (c1 != c2) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    private char getChar(String s, int index) {
        char ch = s.charAt(index);
        if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
            return ch;
        } else if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch - 'A' + 'a');
        } else {
            return 0;
        }
    }
}
