class Solution {
    public boolean isNumber(String s) {
		s = s.trim();
		int i = 0;
		boolean isNumber = false;
		if (i < s.length() && ((s.charAt(i) == '-') || s.charAt(i) == '+'))
			i++;
		while (i < s.length() && Character.isDigit(s.charAt(i))) {
			i++;
			isNumber = true;
		}
		if (i < s.length() && s.charAt(i) == '.') {
			i++;
			while (i < s.length() && Character.isDigit(s.charAt(i))) {
				i++;
				isNumber = true;
			}
		}
		if (isNumber && i < s.length() && s.charAt(i) == 'e') {
			i++;
			isNumber = false;
			if (i < s.length() && ((s.charAt(i) == '-') || (s.charAt(i) == '+')))
				i++;
			while (i < s.length() && Character.isDigit(s.charAt(i))) {
				i++;
				isNumber = true;
			}
		}
		return isNumber && i == s.length();
	}
}
