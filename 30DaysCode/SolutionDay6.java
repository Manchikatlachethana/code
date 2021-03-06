/*
Given a string, , of length  that is indexed from  0 to n-1 , 
print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).
Note: 0 is considered to be an even index.
*/

import java.io.*;
import java.util.*;

public class SolutionDay6 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String s=sc.nextLine();
            int sl=s.length();
            for(int j=0;j<sl;)
            {
                
                System.out.print(s.charAt(j));
                j=j+2;
            }
            System.out.print(" ");
            for(int j=1;j<sl;){
             System.out.print(s.charAt(j)); 
             j=j+2;  
            }
            System.out.println();
            
           
        }
        
        
    }
}

/*
sample input:
2
Hacker
Rank

sample output
Hce akr
Rn ak
*/
