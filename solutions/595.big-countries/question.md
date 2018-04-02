595] Big Countries
<br>ttps://leetcode.com/problems/big-countries/description/
<br>atabase
<br>asy (71.42%)
<br>otal Accepted:    40.6K
<br>otal Submissions: 56.9K
<br>estcase Example:  '{"headers": {"World": ["name", "continent",\t"area",\t"population", "gdp"]}, "rows": {"World": [["Afghanistan", "Asia", 652230, 25500100, 20343000000], ["Albania", "Europe", 28748, 2831741, 12960000000], ["Algeria", "Africa", 2381741, 37100000, 188681000000], ["Andorra", "Europe", 468, 78115,\t3712000000], ["Angola", "Africa", 1246700, 20609294, 100990000000]]}}'
<br>here is a table World 
<br>-----------------+------------+------------+--------------+---------------+
<br> name            | continent  | area       | population   | gdp           |
<br>-----------------+------------+------------+--------------+---------------+
<br> Afghanistan     | Asia       | 652230     | 25500100     | 20343000      |
<br> Albania         | Europe     | 28748      | 2831741      | 12960000      |
<br> Algeria         | Africa     | 2381741    | 37100000     | 188681000     |
<br> Andorra         | Europe     | 468        | 78115        | 3712000       |
<br> Angola          | Africa     | 1246700    | 20609294     | 100990000     |
<br>-----------------+------------+------------+--------------+---------------+
<br> country is big if it has an area of bigger than 3 million square km or a
<br>opulation of more than 25 million.
<br>rite a SQL solution to output big countries' name, population and area.
<br>or example, according to the above table, we should output:
<br>--------------+-------------+--------------+
<br> name         | population  | area         |
<br>--------------+-------------+--------------+
<br> Afghanistan  | 25500100    | 652230       |
<br> Algeria      | 37100000    | 2381741      |
<br>--------------+-------------+--------------+
<br>rite your MySQL query statement below
<br>ect name, population, area 
<br>m world 
<br>re area > 3000000 or population > 25000000;
<br>