class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] C = new int[A.length];
        for(int i = 0; i < A.length; i++){
            C[i] = search(B, A[i]);
        }
        return C;
    }
    public int search(int[] nums, int num){
        for(int i = 0; i < nums.length; i++)
            if(nums[i] == num) return i;
        return -1;
    }
}