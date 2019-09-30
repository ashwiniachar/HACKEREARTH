import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
import java.util.*;
 
 
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        int i,j=0,count;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(j<t)
        {
         String str=sc.next();   
       count=0;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
            {
                count=count+1;
            }
        }
        System.out.println(count);
        j++;
        }
      
        
    }
}
Language: Java