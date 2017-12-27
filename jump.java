import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class jump {
    public static void main(String aa[]){
   int n;
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
   int v;
   int y=1;
   int a[]=new int[n];
   for(int i=0;i<n;i++){
       a[i]=s.nextInt();
   }
   for(int i=0;i<n;i+=v){
       v=a[i];
       if(i==n){
          y=0; 
       }
   }
   if(y==0){
       System.out.println("yes");
   }
 else{
       System.out.print("No");
 }

}
}

