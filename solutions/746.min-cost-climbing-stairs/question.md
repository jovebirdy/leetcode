[747] Min Cost Climbing Stairs
<br>https://leetcode.com/problems/min-cost-climbing-stairs/description/
<br>algorithms
<br>Easy (43.36%)
<br>Total Accepted:    20.1K
<br>Total Submissions: 46.3K
<br>Testcase Example:  '[0,0,0,0]'
<br>On a staircase, the i-th step has some non-negative cost cost[i] assigned (0
<br>indexed).
<br>Once you pay the cost, you can either climb one or two steps. You need to
<br>find minimum cost to reach the top of the floor, and you can either start
<br>from the step with index 0, or the step with index 1.
<br>Example 1:
<br>Input: cost = [10, 15, 20]
<br>Output: 15
<br>Explanation: Cheapest is start on cost[1], pay that cost and go to the
<br>top.
<br>Example 2:
<br>Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
<br>Output: 6
<br>Explanation: Cheapest is start on cost[0], and only step on 1s, skipping
<br>cost[3].
<br>Note:
<br>cost will have a length in the range [2, 1000].
<br>Every cost[i] will be an integer in the range [0, 999].
<br>