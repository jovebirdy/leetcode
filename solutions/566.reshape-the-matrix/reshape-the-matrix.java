class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length * nums[0].length != r * c) return nums;
        int[][] res = new int[r][c];
        int a = 0, b = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(b == nums[0].length){
                    b = 0;
                    a++;
                }
                res[i][j] = nums[a][b++];
            }
        }
        return res;
    }
}
