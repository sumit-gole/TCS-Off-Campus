# PROBLEM STATEMENT 

## Common Multiplication Factor:

Republic Day celebrations are round the corner. To mark the importance of the day, Parades held as the most crucial attraction of this celebration. The parade from the soldiers of the Army is performed as a show of strength There are 'A' soldiers from the Army and 'B' soldiers from the Navy to participate in the parade. All the soldiers should march in rows at the parade. The task here is to find the maximum number of soldiers in each row such that: 
The number of soldiers in each row should be the same. 
There should be either soldiers from the Navy or Army in each row. No combination of both.

<br> 

## Example 1:
### Input:
```
12        -->      Value of A
15        -->      Value of B  
```

### Output:
```
3       -->    Maximum Number of soldiers in each row
```

```
# Explanation:

  From the inputs given above:
  
  Number of army soldiers:   12
  
  Number of navy soldiers:   15
  
  A common multiplication factor  for both 12 and 15 is 3.
  So, if there are 3 soldiers in each row in the parade,
	  A A A
	  A A A
	  A A A
	  A A A
	  B B B
	  B B B
	  B B B
	  B B B
	  B B B
  
  They can march in 4 rows of army soldiers and 5 rows of navy soldiers such that every row has the same number of soldiers and no rows contain a combinantion of both.
  Hench, the output is 3.

```

## Example 2:
### Input:
```
10        -->      Value of A
20        -->      Value of B  
```

### Output:
```
10       -->    Maximum Number of soldiers in each row
```

```
# Explanation:

  From the inputs given above:
  
  Number of army soldiers:   10
  
  Number of navy soldiers:   20
  
  A common multiplication factor  for both 10 and 20 are 10.
  As we need to find maximum number of soldiers in each row, if there are 10 soldiers in each row in the parade,
	  A A A A A A A A A A A
	  B B B B B B B B B B B 
	  B B B B B B B B B B B 
  
  They can march in 10 rows of army soldiers and 5 rows of navy soldiers such that every row has the same number of soldiers and no rows contain a combinantion of both.
  Hench, the output is 10.

```

### Contraints:
```
0 < A <= 10000
0 < B <= 10000
```

### The input format for testing :
The candidate has to write the code to accept 2 input(s).

- First input - Accept value for A (Positive integer number) 
- Second Input - Accept value for B (Positive integer number)

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
