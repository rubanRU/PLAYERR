import java.util.*;
public class ja{
  public static void main(String aa[]){
      int n;
      int f=0;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(int i=2;i<n;i++){
          if(n%i==0){
              f=1;
              System.out.println("yes");
              break;
          }
      }
      if(f==0){
          System.out.println("no");
      }
      }
    }
