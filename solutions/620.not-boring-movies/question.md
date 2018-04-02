620] Not Boring Movies
<br>ttps://leetcode.com/problems/not-boring-movies/description/
<br>atabase
<br>asy (59.57%)
<br>otal Accepted:    22K
<br>otal Submissions: 37K
<br>estcase Example:  '{"headers":{"cinema":["id", "movie", "description", "rating"]},"rows":{"cinema":[[1, "War", "great 3D", 8.9], [2, "Science", "fiction", 8.5], [3, "irish", "boring", 6.2], [4, "Ice song", "Fantacy", 8.6], [5, "House card", "Interesting", 9.1]]}}'
<br> city opened a new cinema, many people would like to go to this cinema.
<br>he cinema also gives out a poster indicating the movies’ ratings and
<br>escriptions. 
<br>lease write a SQL query to output movies with an odd numbered ID and a
<br>escription that is not 'boring'. Order the result by rating.
<br>or example, table cinema:
<br>---------+-----------+--------------+-----------+
<br>   id    | movie     |  description |  rating   |
<br>---------+-----------+--------------+-----------+
<br>   1     | War       |   great 3D   |   8.9     |
<br>   2     | Science   |   fiction    |   8.5     |
<br>   3     | irish     |   boring     |   6.2     |
<br>   4     | Ice song  |   Fantacy    |   8.6     |
<br>   5     | House card|   Interesting|   9.1     |
<br>---------+-----------+--------------+-----------+
<br>or the example above, the output should be:
<br>---------+-----------+--------------+-----------+
<br>   id    | movie     |  description |  rating   |
<br>---------+-----------+--------------+-----------+
<br>   5     | House card|   Interesting|   9.1     |
<br>   1     | War       |   great 3D   |   8.9     |
<br>---------+-----------+--------------+-----------+
<br>rite your MySQL query statement below
<br>ect *
<br>m cinema
<br>re mod(id, 2) = 1 and description != 'boring'
<br>er by rating DESC
<br>