627] Swap Salary
<br>ttps://leetcode.com/problems/swap-salary/description/
<br>atabase
<br>asy (67.33%)
<br>otal Accepted:    23.8K
<br>otal Submissions: 35.3K
<br>estcase Example:  '{"headers":{"salary":["id","name","sex","salary"]},"rows":{"salary":[[1,"A","m",2500],[2,"B","f",1500],[3,"C","m",5500],[4,"D","f",500]]}}'
<br>iven a table salary, such as the one below, that has m=male and  f=female
<br>alues. Swap all f and m values (i.e., change all f values to m and vice
<br>ersa) with a single update query and no intermediate temp table.
<br>or example:
<br> id | name | sex | salary |
<br>----|------|-----|--------|
<br> 1  | A    | m   | 2500   |
<br> 2  | B    | f   | 1500   |
<br> 3  | C    | m   | 5500   |
<br> 4  | D    | f   | 500    |
<br>fter running your query, the above salary table should have the following
<br>ows:
<br> id | name | sex | salary |
<br>----|------|-----|--------|
<br> 1  | A    | f   | 2500   |
<br> 2  | B    | m   | 1500   |
<br> 3  | C    | f   | 5500   |
<br> 4  | D    | m   | 500    |
<br>rite your MySQL query statement below
<br>ate salary
<br> set sex = (case sex
<br>     when 'm' then 'f'
<br>     else 'm'
<br>     end);
<br>