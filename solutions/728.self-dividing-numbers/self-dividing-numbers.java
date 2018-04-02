class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nums = new ArrayList();
        for(int i = left; i <= right; i++){
            if(selfDividing(i)) nums.add(i);
        }
        return nums;
    }
    
    public boolean selfDividing(int n){
        int x = n;
		while (x > 0) {
			int r = x % 10;
			x /= 10;
			if (r == 0 || n % r > 0)
				return false;
		}
		return true;
    }
    
    /*
    Alternate implementation of selfDividing:
    public boolean selfDividing(int n) {
        for (char c: String.valueOf(n).toCharArray()) {
            if (c == '0' || (n % (c - '0') > 0))
                return false;
        }
        return true;
    }
    */
}
