ss Solution {
<br> public int[] anagramMappings(int[] A, int[] B) {
<br>     int[] C = new int[A.length];
<br>     for(int i = 0; i < A.length; i++){
<br>         C[i] = search(B, A[i]);
<br>     }
<br>     return C;
<br> }
<br> public int search(int[] nums, int num){
<br>     for(int i = 0; i < nums.length; i++)
<br>         if(nums[i] == num) return i;
<br>     return -1;
<br> }
<br>