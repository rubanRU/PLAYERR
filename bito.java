import java.util.*;
public class bito{
  public static void main(String aa[]){
     int l;
     int n;
     int sum=1;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int a[]=new int[n];
     for(int i=0;i<n;i++){
         a[i]=s.nextInt();
     }
      for(int i=0;i<n-1;i++){
          if(a[i]>a[i+1]){
              break;
          }
 else{
              sum++;
 }
          
      }
   System.out.println(sum);
    }
}
