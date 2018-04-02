class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int k = 0; k < nums.length; k = k+2){
            sum += nums[k];
        }
        return sum;
    }
}
