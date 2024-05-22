find Odd: 
Given an array of integers, find the one that appears an odd number of times. 
There will always be only one integer that appears an odd number of times. 
Examples [7] should return 7, because it occurs 1 time (which is odd). 
[0] should return 0, because it occurs 1 time (which is odd). 
[1,1,2] should return 2, because it occurs 1 time (which is odd). 
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd). 
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd). 
-----------------------------------------------------------------------------------------
Allocate customers to hotel rooms based on their arrival and departure days. 
Each customer wants their own room, so two customers can stay in the same room only if the departure day of the first customer is earlier than the arrival day of the second customer. 
The number of rooms used should be minimized. Input A list or array of n customers, 1 ≤ n ≤ 1000. 
Each customer is represented by (arrival_day, departure_day), which are positive integers satisfying arrival_day ≤ departure_day. 
Output A list or array of size n, where element i indicates the room that customer i was allocated. Rooms are numbered 1,2, ..., k for some 1 ≤ k ≤ n. 
Any allocation that minimizes the number of rooms k is a valid solution. Example: Suppose customers is [(1,5), (2,4), (6,8), (7,7)]. 
Clearly customers 1 and 2 cannot get the same room. Customer 3 can use the same room as either of them, because they both leave before customer 3 arrives. 
Then customer 4 can be given the other room. So any of [1,2,1,2], [1,2,2,1], [2,1,2,1], [2,1,1,2] is a valid solution. NOTE: 
The list of customers is not necessarily ordered by arrival_time.

6,8
1,5