mport java.util.*;
import java.lang.*;
import java.lang.String;
import java.math.BigInteger;
import java.util.ArrayList;

public class sumad{
        public static void main(String args[]) {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++){
             a[i]=s.nextInt();
         }
         int sum=0;
         int f=0;
         for(int i=0;i<n-1;i++){
             f=a[i]+a[i+1];
             sum=sum+f;
         }
         System.out.println(sum);
    }
}
