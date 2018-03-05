import java.util.*;
import java.util.ArrayList;
public class facod{
  public static void main(String aa[]){
     Scanner s=new Scanner(System.in);
     int f=s.nextInt();
      for(int i=2;i<=f;i++){
          if(i%2!=0&&f%i==0){
              System.out.print(i+" ");
          }
      }

}
}
