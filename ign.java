import java.util.*;
import java.util.ArrayList;
public class ign{
  public static void main(String aa[]){
      String a;
      String b;
      Scanner s=new Scanner(System.in);
      a=s.next();
      b=s.next();
      if(a.equalsIgnoreCase(b)){
          System.out.println("yes");
      }
 else{
          System.out.println("no");
 }
      
}
}
