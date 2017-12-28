import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class 2dsum{
    public static void main(String aa[]){
    int n;
    int c=0;
    int sum=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
   int  m=s.nextInt();
   int a[][]=new int[n][m];
   for(int i=0;i<n;i++){
       for(int j=0;j<m;j++){
           a[i][j]=s.nextInt();
       }
   }
    for(int i=0;i<n;i++){
       for(int j=0;j<m;j++){
           sum=sum+a[i][j];
       }
   }
           
   System.out.println(sum);
   
    
}
}

