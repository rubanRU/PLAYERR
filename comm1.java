import java.util.*;
import java.util.ArrayList;
public class comm {
  public static void main(String aa[]){
      int n;
      int f=0;
      Scanner s=new Scanner(System.in);
      String g=s.nextLine();
      String m=s.next();
      char a[]=g.toCharArray();
      for(int i=0;i<a.length;i++){
         String hh=String.valueOf(a[i]);
         if(m.contains(hh)){
             System.out.println("yes");
             f=1;
             break;
         }
      }
      if(f==0){
          System.out.println("no");
      }

    }

}
