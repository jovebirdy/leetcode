[654] Maximum Binary Tree
<br>https://leetcode.com/problems/maximum-binary-tree/description/
<br>algorithms
<br>Medium (69.61%)
<br>Total Accepted:    28.4K
<br>Total Submissions: 40.9K
<br>Testcase Example:  '[3,2,1,6,0,5]'
<br>Given an integer array with no duplicates. A maximum tree building on this
<br>array is defined as follow:
<br>The root is the maximum number in the array. 
<br>The left subtree is the maximum tree constructed from left part subarray
<br>divided by the maximum number.
<br>The right subtree is the maximum tree constructed from right part subarray
<br>divided by the maximum number. 
<br>Construct the maximum tree by the given array and output the root node of
<br>this tree.
<br>Example 1:
<br>Input: [3,2,1,6,0,5]
<br>Output: return the tree root node representing the following tree:
<br>⁠     6
<br>⁠   /   \
<br>⁠  3     5
<br>⁠   \    / 
<br>⁠    2  0   
<br>⁠      \
<br>⁠       1
<br>Note:
<br>The size of the given array will be in the range [1,1000].
<br>