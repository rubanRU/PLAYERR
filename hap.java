import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class hap{
    public static void main(String aa[]){
   int n;
   int sum=0;
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
   while(sum!=1&&sum!=4){
       sum=0;
       while(n>0){
           int j=n%10;
           sum=sum+(j*j);
           n=n/10;

       }
       n=sum;

   }
   if(sum==1){
       System.out.print("Happy Number");
   }
 else{
       System.out.print("Not happy");
 }

}
}

