import java.util.*;
public class twoad {
  public static void main(String aa[]){
      int n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=s.nextInt();
      }
      for(int i=0;i<n-1;i++){
          if(a[i]>a[i+1]){
              System.out.print(a[i]+" ");
          }
 else{
              System.out.print(a[i+1]+" ");
 }
      }
    }
}
