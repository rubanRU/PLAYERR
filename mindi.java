import java.util.*;
public class mindi {
  public static void main(String aa[]){
      int n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=s.nextInt();
      }
      int sum=a[0];
      for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
              int y=a[i]-a[j];
              if(j<sum){
                  sum=y;
              }
          }
      }
      if(sum<0){
          sum=sum*(-1);
      System.out.println(sum);
  }
 else{
          System.out.println(sum);
 }
    }
}
