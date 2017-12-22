import java.util.*;
import java.lang.*;
public class factorial{
      public static void main(String aa[]){
           int n,p;
           int f=1;
           Scanner s=new Scanner(System.in);
           n=s.nextInt();
           for(int i=1;i<=n;i++){
               f=f*i;
               
           }
System.out.printf("%d ",f);
}
}
