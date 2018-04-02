class Solution {
    public int findComplement(int num) {
        String a = Integer.toBinaryString(num);
		StringBuffer b = new StringBuffer(a);
		for (int i = 0; i < b.length(); i++) {
			if(b.charAt(i) == '0') 
				b.setCharAt(i, '1');
			else
				b.setCharAt(i, '0');;
		}
		a = new String(b);
		int c = Integer.parseInt(a, 2);
		return c;
    }
}
