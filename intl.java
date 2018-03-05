import java.util.*;
import java.util.ArrayList;
public class intl{
  public static void main(String aa[]){
     Scanner s=new Scanner(System.in);
     Long f=s.nextLong();
     if(f>=-2147483648&&f<=2147483647){
         System.out.print("INT");
     }
 else{
         System.out.print("LONG LONG");
 }

}
}
