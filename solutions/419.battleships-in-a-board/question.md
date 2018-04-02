[419] Battleships in a Board
<br>https://leetcode.com/problems/battleships-in-a-board/description/
<br>algorithms
<br>Medium (62.97%)
<br>Total Accepted:    41K
<br>Total Submissions: 65.2K
<br>Testcase Example:  '[["X",".",".","X"],[".",".",".","X"],[".",".",".","X"]]'
<br>Given an 2D board, count how many battleships are in it. The battleships are
<br>represented with 'X's, empty slots are represented with '.'s. You may assume
<br>the following rules:
<br>You receive a valid board, made of only battleships or empty slots.
<br>Battleships can only be placed horizontally or vertically. In other words,
<br>they can only be made of the shape 1xN (1 row, N columns) or Nx1 (N rows, 1
<br>column), where N can be of any size.
<br>At least one horizontal or vertical cell separates between two battleships -
<br>there are no adjacent battleships.
<br>Example:
<br>X..X
<br>...X
<br>...X
<br>In the above board there are 2 battleships.
<br>Invalid Example:
<br>...X
<br>XXXX
<br>...X
<br>This is an invalid board that you will not receive - as battleships will
<br>always have a cell separating between them.
<br>Follow up:Could you do it in one-pass, using only O(1) extra memory and
<br>without modifying the value of the board?
<br>