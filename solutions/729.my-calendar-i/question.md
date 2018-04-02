[729] My Calendar I
<br>https://leetcode.com/problems/my-calendar-i/description/
<br>algorithms
<br>Medium (42.15%)
<br>Total Accepted:    10K
<br>Total Submissions: 23.6K
<br>Testcase Example:  '["MyCalendar","book","book","book"]\n[[],[10,20],[15,25],[20,30]]'
<br>Implement a MyCalendar class to store your events. A new event can be added
<br>if adding the event will not cause a double booking.
<br>Your class will have the method, book(int start, int end).  Formally, this
<br>represents a booking on the half open interval [start, end), the range of
<br>real numbers x such that start .
<br>A double booking happens when two events have some non-empty intersection
<br>(ie., there is some time that is common to both events.)
<br>For each call to the method MyCalendar.book, return true if the event can be
<br>added to the calendar successfully without causing a double booking.
<br>Otherwise, return false and do not add the event to the calendar.
<br>Your class will be called like this:
<br>MyCalendar cal = new MyCalendar();
<br>MyCalendar.book(start, end)
<br>Example 1:
<br>MyCalendar();
<br>MyCalendar.book(10, 20); // returns true
<br>MyCalendar.book(15, 25); // returns false
<br>MyCalendar.book(20, 30); // returns true
<br>Explanation:
<br>The first event can be booked.  The second can't because time 15 is already
<br>booked by another event.
<br>The third event can be booked, as the first event takes every time less than
<br>20, but not including 20.
<br>Note:
<br>The number of calls to MyCalendar.book per test case will be at most 1000.
<br>In calls to MyCalendar.book(start, end), start and end are integers in the
<br>range [0, 10^9].
<br>