import java.util.*;
public class perf {
  public static void main(String aa[]){
     int l;
     int n;
     int sum=0;
      Scanner s=new Scanner(System.in);
      l=s.nextInt();
      n=s.nextInt();

      for(int i=l;i<=n;i++){
          int y=i*i;
          if(y<=n){
            sum++;
          }
      }
      System.out.println(sum);

    }
}
