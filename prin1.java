import java.util.*;
public class prin1{
  public static void main(String aa[]){
     int l;
     int n;
     int sum=0;
     int y=0;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int a[]=new int[n];
     for(int i=0;i<n;i++){
         a[i]=s.nextInt();
     }
      
      for(int i=0;i<n;i++){
          if(a[i]==1){
              sum++;
          }
          if(a[i]==0){
              y=y+sum;
              sum=0;
          }
      }
      for(int i=0;i<y;i++){
          System.out.print("1"+" ");
      }
}
}
