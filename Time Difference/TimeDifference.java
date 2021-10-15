//Time difference between expected time and given time

import java.io.*;
import java.util.*;
class TimeDifference
{
    static int laggingDuration(int h1, int m1,int h2, int m2, int k)
    {
    	int lag, t1, t2;
    	t1 = (h1 + k) * 60 + m1;
    	t2 = h2 * 60 + m2;
    	lag = t1 - t2;
    	return lag;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    	int h1 = sc.nextInt();
    	int m1 = sc.nextInt();
    	int h2 = sc.nextInt();
    	int m2 = sc.nextInt();
    	int x = sc.nextInt();
    	int result = laggingDuration(h1, m1, h2, m2, x);
    	System.out.println(result);
    }
}