[595] Big Countries
<br>https://leetcode.com/problems/big-countries/description/
<br>database
<br>Easy (71.42%)
<br>Total Accepted:    40.6K
<br>Total Submissions: 56.9K
<br>Testcase Example:  '{"headers": {"World": ["name", "continent",\t"area",\t"population", "gdp"]}, "rows": {"World": [["Afghanistan", "Asia", 652230, 25500100, 20343000000], ["Albania", "Europe", 28748, 2831741, 12960000000], ["Algeria", "Africa", 2381741, 37100000, 188681000000], ["Andorra", "Europe", 468, 78115,\t3712000000], ["Angola", "Africa", 1246700, 20609294, 100990000000]]}}'
<br>There is a table World 
<br>+-----------------+------------+------------+--------------+---------------+
<br>| name            | continent  | area       | population   | gdp           |
<br>+-----------------+------------+------------+--------------+---------------+
<br>| Afghanistan     | Asia       | 652230     | 25500100     | 20343000      |
<br>| Albania         | Europe     | 28748      | 2831741      | 12960000      |
<br>| Algeria         | Africa     | 2381741    | 37100000     | 188681000     |
<br>| Andorra         | Europe     | 468        | 78115        | 3712000       |
<br>| Angola          | Africa     | 1246700    | 20609294     | 100990000     |
<br>+-----------------+------------+------------+--------------+---------------+
<br>A country is big if it has an area of bigger than 3 million square km or a
<br>population of more than 25 million.
<br>Write a SQL solution to output big countries' name, population and area.
<br>For example, according to the above table, we should output:
<br>+--------------+-------------+--------------+
<br>| name         | population  | area         |
<br>+--------------+-------------+--------------+
<br>| Afghanistan  | 25500100    | 652230       |
<br>| Algeria      | 37100000    | 2381741      |
<br>+--------------+-------------+--------------+
<br>Write your MySQL query statement below
<br>