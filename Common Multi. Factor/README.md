# PROBLEM STATEMENT 

## Time difference between expected time and given time:

Time is agintegral part of our life. So chorology which is the discipline of studying time and clock making. A watemaker is passionate about elivering the best watches with accurate time er the world. Each watch he makes, he tests time in it with a watch showing GMT of his place. The task here is to find if the new watch he made is working correctly and find the number of minutes (delay or early) such that: Note the time in the new watch Wait for X hours.

Note the time again in new watch
Compare the initial time (h, m) a (h1.n) in the new watch. current time
The time after X hours in new watch may be correct or incorrect.
Display the number of minutes by which new watch is lagging or early from the actual time. If the time is lagging, display positive integer i.e new watch is running behind time If the time is early, display a negative integer i.e new watch is running ahead of time. The displayed in 24 hour format.

<br> 

## Example 1:
### Input:
```
8         -->      Value of h  
45        -->      Value of m  
9         -->      Value of h  
00        -->      Value of m1 
1         -->      Value of x  
```

### Output:
```
45      -->    Number of minutes lagging
```

```
# Explanation:

  From the inputs given above:
  
  Initial time:   8h 45m
  
  After X hours, i.e after 1 hours
  
  Current time:   9h 00m
	
  The time after 1 hour should be 9h 45m which is the correct time.
  
  The new watch is working slow.

```

## Example 2:
### Input:
```
14        -->      Value of h  
30        -->      Value of m  
18        -->      Value of h  
00        -->      Value of m1 
3         -->      Value of x  
```

### Output:
```
-30      -->    Number of minutes lagging
```

```
# Explanation:

  From the inputs given above:
  
  Initial time:   14h 30m
  
  After x hours, i.e after 3 hours
  
  Current time:   18h 00m
	
  The time after 3 hours should be 17h 30m which is the correct time.
  
  The new watch is working slow.

```

### Contraints:
```
0 <= h <= 24
0 <= m <= 60
0 <= h <= 24
0 <= m <= 60
0 <= k <= 24
```

### The input format for testing :
The candidate has to write the code to accept 5 input(s).

- First input - Accept value for h (Positive integer number) 
- Second Input - Accept value for m (Positive integer number)
- Third Input - Accept value for h1 (Positive integer number) 
- Fourth Input - Accept value for m1 (Positive integer number) 
- Fifth Input - Accept value for X (Positive integer number)

### The Output format for testing:
The output should be an integer number or print the message (if any) given in the problem statement (Check the output in Example 1, Example 2) 
Additional messages in output will cause the failure of test cases. ) 

### Instructions:

The system doesn't allow any kind of hard-coded input value/ values.

Written program code by the candidate will be verified against the inputs which are Dopplied from the system.

<br>
<hr>
	<h3 align = "center" >--THANK YOU--</h3>
<hr>
