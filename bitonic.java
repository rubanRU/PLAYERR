
import java.util.*;
public class bitonic{
    public static void main(String aa[]){
       Scanner z=new Scanner(System.in);
       int n=z.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
           a[i]=z.nextInt();
       }
       for(int i=0;i<a.length-1;i++){
           if(a[i]>a[i+1]){
               System.out.println(a[i]);
               break;
           }
       }
       
    }
}
