
import java.util.*;
import java.lang.*;
import java.lang.String;
import java.math.BigInteger;
import java.util.ArrayList;

public class onevow{
        public static void main(String args[]) {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         String a[]=new String[n];
         for(int i=0;i<n;i++){
             a[i]=s.next();
         }
         int count=0;
         for(int i=0;i<n;i++){
             String x=a[i];
             for(int j=0;j<x.length();j++){
                 if((x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u')||(x.charAt(j)=='A'||x.charAt(j)=='E'||x.charAt(j)=='I'||x.charAt(j)=='O'||x.charAt(j)=='U')){
                     count++;
                     break;
                 }
             }
         }
         if(count==n){
             System.out.println("Yes");
         }
 else{
             System.out.println("No");
 }

    }
}
