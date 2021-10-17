# PROBLEM STATEMENT 

## Minimum Initial Energy Required:

Given an array containing positive and negative numbers. The array represents checkpoints from one end to other end of street. Positive and negative values represent amount of energy at that checkpoint. Positive numbers increase the energy and negative numbers decrease. Find the minimum initial energy required to cross the street such that Energy level never becomes 0 or less than 0.

Note : The value of minimum initial energy required will be 1 even if we cross street successfully without loosing energy to less than and equal to 0 at any checkpoint. The 1 is required for initial check point.

<br> 

## Example 1:
### Input:
```
5                   -->      Value of N
{3,-4,2,5,6}        -->      a[], Elements a[0] to a[N-1], where input each element is separated by new line.  
```

### Output:
```
2         -->     Minimum initial energy required by the athlete.
```

```
# Explanation:

  From the inputs given above:
  
  Number of checkpoints:   6
  
  Assume initial energy of the athlete is 0.
  
  At 1st checkpoint, the energy level is 0+3=3
  
  At 2nd checkpoint, the energy level is 3+(-4)=-1
  
  But energy level should not be less than 0 at any point to proceed further in the race.
  
  Assume initial energy of the athlete is 1.
  
  At 1st checkpoint, the energy level is 1+3=4
  
  At 2nd checkpoint, the energy level is 4+(-4)=0
  
  But energy level should not be less than 0 at any point to proceed further in the race.
  
  Assume initial energy of the athlete is 2.
  
  At 1st checkpoint, the energy level is 2+3=5
  
  At 2nd checkpoint, the energy level is 5+(-4)=1
  
  At 3rd checkpoint, the energy level is 1+2=3
  
  At 4th checkpoint, the energy level is 3+5=8
  
  At 5th checkpoint, the energy level is 8+6=14
  
  The athlete can successfully complete the race if the initial energy is 2.
  
  Hence, the output is 2.

```

## Example 2:
### Input:
```
5                     -->      Value of N
{4, -10, 4, 4, 4}     -->      a[], Elements a[0] to a[N-1], where input each element is separated by new line.  
```

### Output:
```
7         -->     Minimum initial energy required by the athlete.
```

```
# Explanation:

  From the inputs given above:
  
  Suppose initially we have energy = 0, now at 1st checkpoint, we get 4. 
  At 2nd checkpoint, energy gets reduced by -10 so we have 4 + (-10) = -6 but at any checkpoint value of energy can not less than equals to 0. 
  So initial energy must be at least 7 because having 7 as initial energy value at 1st checkpoint our energy will be = 7+4 = 11 and 
  then we can cross 2nd checkpoint successfully. 
  Now after 2nd checkpoint, all checkpoint have positive value so we can cross street successfully with 7 initial energy.
  
  The athlete can successfully complete the race if the initial energy is 7.
  
  Hence, the output is 7.

```

## Example 3:
### Input:
```
3              -->      Value of N
{6,1,5}        -->      a[], Elements a[0] to a[N-1], where input each element is separated by new line.  
```

### Output:
```
1         -->     Minimum initial energy required by the athlete.
```

### Contraints:
```
0 < N <= 1000
0 <= a[i] <= 1000
```

#### Time Complexity : O(n) 
#### Auxiliary Space : O(1)

### The input format for testing :
The candidate has to write the code to accept 2 input(s).

- First input - Accept value for A (Positive integer number) 
- Second Input - Accept N number of positive integer values(a[]), where each value is separated by a new line.

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
