import java.io.*;
import java.util.*;

class MatrixPrinting {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    //int testcase=sc.nextInt();
	    int m=sc.nextInt();
	    int n=sc.nextInt();
	    int a[][]=new int[m][n];
	   for(int i=0;i<m;i++)
	   {
	       for(int j=0;j<n;j++)
	       {
	           a[i][j]=sc.nextInt();
	       }
	   }
	   System.out.println(" matrix printing");
	   for(int row=0;row<m;row++)
	   {
	       for(int w=0;w<n;w++)
	   {
	       System.out.print(a[row][w]+" ");
	   }
	   System.out.println();
	   }
	   
	    
	}
}
