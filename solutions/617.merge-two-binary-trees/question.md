[617] Merge Two Binary Trees
<br>https://leetcode.com/problems/merge-two-binary-trees/description/
<br>algorithms
<br>Easy (67.35%)
<br>Total Accepted:    76.1K
<br>Total Submissions: 113K
<br>Testcase Example:  '[1,3,2,5]\n[2,1,3,null,4,null,7]'
<br>Given two binary trees and imagine that when you put one of them to cover
<br>the other, some nodes of the two trees are overlapped while the others are
<br>not. 
<br>You need to merge them into a new binary tree. The merge rule is that if two
<br>nodes overlap, then sum node values up as the new value of the merged node.
<br>Otherwise, the NOT null node will be used as the node of new tree.
<br>Example 1:
<br>Input: 
<br>Tree 1                     Tree 2                  
<br>⁠         1                         2                             
<br>⁠        / \                       / \                            
<br>⁠       3   2                     1   3                        
<br>⁠      /                           \   \                      
<br>⁠     5                             4   7                  
<br>Output: 
<br>Merged tree:
<br>3
<br>/ \
<br>4   5
<br>/ \   \ 
<br>5   4   7
<br>Note:
<br>The merging process must start from the root nodes of both trees.
<br>