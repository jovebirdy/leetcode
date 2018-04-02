[627] Swap Salary
<br>https://leetcode.com/problems/swap-salary/description/
<br>database
<br>Easy (67.33%)
<br>Total Accepted:    23.8K
<br>Total Submissions: 35.3K
<br>Testcase Example:  '{"headers":{"salary":["id","name","sex","salary"]},"rows":{"salary":[[1,"A","m",2500],[2,"B","f",1500],[3,"C","m",5500],[4,"D","f",500]]}}'
<br>Given a table salary, such as the one below, that has m=male and  f=female
<br>values. Swap all f and m values (i.e., change all f values to m and vice
<br>versa) with a single update query and no intermediate temp table.
<br>⁠
<br>For example:
<br>⁠
<br>| id | name | sex | salary |
<br>|----|------|-----|--------|
<br>| 1  | A    | m   | 2500   |
<br>| 2  | B    | f   | 1500   |
<br>| 3  | C    | m   | 5500   |
<br>| 4  | D    | f   | 500    |
<br>After running your query, the above salary table should have the following
<br>rows:
<br>| id | name | sex | salary |
<br>|----|------|-----|--------|
<br>| 1  | A    | f   | 2500   |
<br>| 2  | B    | m   | 1500   |
<br>| 3  | C    | f   | 5500   |
<br>| 4  | D    | m   | 500    |
<br>Write your MySQL query statement below
<br>