import java.util.*;
public class adjc{
  public static void main(String aa[]){
     int l;
     int n;
     int sum=0;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int a[]=new int[n];
     for(int i=0;i<n;i++){
         a[i]=s.nextInt();
     }
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              if(a[i]<a[j]){
                  sum++;
              }
          }
      }
   System.out.println(sum);
    }
}
