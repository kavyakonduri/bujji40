/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x,y,temp;
        System.out.println("enter x and y values");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("before swap x="+x+"\n y="+y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("after swap x="+x+"\n y="+y);
	}
}
