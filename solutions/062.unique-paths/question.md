62] Unique Paths
<br>ttps://leetcode.com/problems/unique-paths/description/
<br>lgorithms
<br>edium (42.68%)
<br>otal Accepted:    184.6K
<br>otal Submissions: 432.6K
<br>estcase Example:  '1\n2'
<br> robot is located at the top-left corner of a m x n grid (marked 'Start' in
<br>he diagram below).
<br>he robot can only move either down or right at any point in time. The robot
<br>s trying to reach the bottom-right corner of the grid (marked 'Finish' in
<br>he diagram below).
<br>ow many possible unique paths are there?
<br>bove is a 3 x 7 grid. How many possible unique paths are there?
<br>ote: m and n will be at most 100.
<br>ss Solution:
<br> def uniquePaths(self, m, n):
<br>     """
<br>     :type m: int
<br>     :type n: int
<br>     :rtype: int
<br>     """
<br>     return int(math.factorial(m+n-2)/math.factorial(m-1)/math.factorial(n-1))
<br>