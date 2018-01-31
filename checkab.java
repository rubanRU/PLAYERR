import java.util.*;
public class checkab{
  public static void main(String aa[]){
   Scanner s=new Scanner(System.in);
   String d=s.next();
   String g=d.replaceAll("[ab]", "");
   if(g.isEmpty()){
       System.out.println("yes");
   }
 else{
       System.out.println("no");
 }
  }
}
