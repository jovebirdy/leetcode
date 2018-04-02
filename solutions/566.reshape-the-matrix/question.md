[566] Reshape the Matrix
<br>https://leetcode.com/problems/reshape-the-matrix/description/
<br>algorithms
<br>Easy (57.68%)
<br>Total Accepted:    45.8K
<br>Total Submissions: 79.3K
<br>Testcase Example:  '[[1,2],[3,4]]\n1\n4'
<br>In MATLAB, there is a very useful function called 'reshape', which can
<br>reshape a matrix into a new one with different size but keep its original
<br>data.
<br>You're given a matrix represented by a two-dimensional array, and two
<br>positive integers r and c representing the row number and column number of
<br>the wanted reshaped matrix, respectively.
<br>⁠The reshaped matrix need to be filled with all the elements of the original
<br>matrix in the same row-traversing order as they were.
<br>If the 'reshape' operation with given parameters is possible and legal,
<br>output the new reshaped matrix; Otherwise, output the original matrix.
<br>Example 1:
<br>Input: 
<br>nums = 
<br>[[1,2],
<br>⁠[3,4]]
<br>r = 1, c = 4
<br>Output: 
<br>[[1,2,3,4]]
<br>Explanation:The row-traversing of nums is [1,2,3,4]. The new reshaped matrix
<br>is a 1 * 4 matrix, fill it row by row by using the previous list.
<br>Example 2:
<br>Input: 
<br>nums = 
<br>[[1,2],
<br>⁠[3,4]]
<br>r = 2, c = 4
<br>Output: 
<br>[[1,2],
<br>⁠[3,4]]
<br>Explanation:There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So
<br>output the original matrix.
<br>Note:
<br>The height and width of the given matrix is in range [1, 100].
<br>The given r and c are all positive.
<br>