[682] Baseball Game
<br>https://leetcode.com/problems/baseball-game/description/
<br>algorithms
<br>Easy (57.99%)
<br>Total Accepted:    21.9K
<br>Total Submissions: 37.7K
<br>Testcase Example:  '["5","2","C","D","+"]'
<br>You're now a baseball game point recorder.
<br>Given a list of strings, each string can be one of the 4 following types:
<br>Integer (one round's score): Directly represents the number of points you
<br>get in this round.
<br>"+" (one round's score): Represents that the points you get in this round
<br>are the sum of the last two valid round's points.
<br>"D" (one round's score): Represents that the points you get in this round
<br>are the doubled data of the last valid round's points.
<br>"C" (an operation, which isn't a round's score): Represents the last valid
<br>round's points you get were invalid and should be removed.
<br>Each round's operation is permanent and could have an impact on the round
<br>before and the round after.
<br>You need to return the sum of the points you could get in all the rounds.
<br>Example 1:
<br>Input: ["5","2","C","D","+"]
<br>Output: 30
<br>Explanation: 
<br>Round 1: You could get 5 points. The sum is: 5.
<br>Round 2: You could get 2 points. The sum is: 7.
<br>Operation 1: The round 2's data was invalid. The sum is: 5.  
<br>Round 3: You could get 10 points (the round 2's data has been removed). The
<br>sum is: 15.
<br>Round 4: You could get 5 + 10 = 15 points. The sum is: 30.
<br>Example 2:
<br>Input: ["5","-2","4","C","D","9","+","+"]
<br>Output: 27
<br>Explanation: 
<br>Round 1: You could get 5 points. The sum is: 5.
<br>Round 2: You could get -2 points. The sum is: 3.
<br>Round 3: You could get 4 points. The sum is: 7.
<br>Operation 1: The round 3's data is invalid. The sum is: 3.  
<br>Round 4: You could get -4 points (the round 3's data has been removed). The
<br>sum is: -1.
<br>Round 5: You could get 9 points. The sum is: 8.
<br>Round 6: You could get -4 + 9 = 5 points. The sum is 13.
<br>Round 7: You could get 9 + 5 = 14 points. The sum is 27.
<br>Note:
<br>The size of the input list will be between 1 and 1000.
<br>Every integer represented in the list will be between -30000 and 30000.
<br>