[620] Not Boring Movies
<br>https://leetcode.com/problems/not-boring-movies/description/
<br>database
<br>Easy (59.57%)
<br>Total Accepted:    22K
<br>Total Submissions: 37K
<br>Testcase Example:  '{"headers":{"cinema":["id", "movie", "description", "rating"]},"rows":{"cinema":[[1, "War", "great 3D", 8.9], [2, "Science", "fiction", 8.5], [3, "irish", "boring", 6.2], [4, "Ice song", "Fantacy", 8.6], [5, "House card", "Interesting", 9.1]]}}'
<br>X city opened a new cinema, many people would like to go to this cinema.
<br>The cinema also gives out a poster indicating the movies’ ratings and
<br>descriptions. 
<br>⁠
<br>Please write a SQL query to output movies with an odd numbered ID and a
<br>description that is not 'boring'. Order the result by rating.
<br>For example, table cinema:
<br>+---------+-----------+--------------+-----------+
<br>|   id    | movie     |  description |  rating   |
<br>+---------+-----------+--------------+-----------+
<br>|   1     | War       |   great 3D   |   8.9     |
<br>|   2     | Science   |   fiction    |   8.5     |
<br>|   3     | irish     |   boring     |   6.2     |
<br>|   4     | Ice song  |   Fantacy    |   8.6     |
<br>|   5     | House card|   Interesting|   9.1     |
<br>+---------+-----------+--------------+-----------+
<br>For the example above, the output should be:
<br>+---------+-----------+--------------+-----------+
<br>|   id    | movie     |  description |  rating   |
<br>+---------+-----------+--------------+-----------+
<br>|   5     | House card|   Interesting|   9.1     |
<br>|   1     | War       |   great 3D   |   8.9     |
<br>+---------+-----------+--------------+-----------+
<br>Write your MySQL query statement below
<br>