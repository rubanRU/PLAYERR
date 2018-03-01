import java.util.*;
public class adjd{
  public static void main(String aa[]){
     int l;
     int n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      l=s.nextInt();
      int a[]=new int[n];
     for(int i=0;i<n;i++){
         a[i]=s.nextInt();
     }
      for(int i=0;i<n-1;i++){
          if(a[i]-a[i+1]==l){
              System.out.println(a[i]);
          }
          
      }
}
}
