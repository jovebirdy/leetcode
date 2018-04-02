[669] Trim a Binary Search Tree
<br>https://leetcode.com/problems/trim-a-binary-search-tree/description/
<br>algorithms
<br>Easy (58.17%)
<br>Total Accepted:    27.5K
<br>Total Submissions: 47.3K
<br>Testcase Example:  '[1,0,2]\n1\n2'
<br>Given a binary search tree and the lowest and highest boundaries as L and R,
<br>trim the tree so that all its elements lies in [L, R] (R >= L). You might
<br>need to change the root of the tree, so the result should return the new
<br>root of the trimmed binary search tree.
<br>Example 1:
<br>Input: 
<br>⁠   1
<br>⁠  / \
<br>⁠ 0   2
<br>⁠ L = 1
<br>⁠ R = 2
<br>Output: 
<br>⁠   1
<br>⁠     \
<br>⁠      2
<br>Example 2:
<br>Input: 
<br>⁠   3
<br>⁠  / \
<br>⁠ 0   4
<br>⁠  \
<br>⁠   2
<br>⁠  /
<br>⁠ 1
<br>⁠ L = 1
<br>⁠ R = 3
<br>Output: 
<br>⁠     3
<br>⁠    / 
<br>⁠  2   
<br>⁠ /
<br>⁠1
<br>