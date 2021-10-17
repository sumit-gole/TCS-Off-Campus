// Minimum Initial Energy Required To Cross Street
import java.util.*;
public class MinimumInitialEnergy
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i] = sc.nextInt();
	    }
		
		int len = arr.length;
	    System.out.print(minInitialEnergy(arr, len));
	}
	static int minInitialEnergy(int arr[], int n)
    {
    	int initMinEnergy = 0;
    	int currEnergy = 0;
    	boolean flag = false;
    	for (int i = 0; i < n; i++) 
    	{
        	currEnergy += arr[i];
        	if (currEnergy <= 0) 
        	{
        		initMinEnergy += Math.abs(currEnergy) + 1;
        		currEnergy = 1;
        		flag = true;
        	}
    	}
    	return (flag == false) ? 1 : initMinEnergy;
    }
}
