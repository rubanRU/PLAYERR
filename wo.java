import java.util.*;
import java.util.ArrayList;
public class wo{
  public static void main(String aa[]){
      int n;
      int f=0;
      Scanner s=new Scanner(System.in);
      String g=s.nextLine();
      String h=s.next();
      String ll[]=g.split(" ");
      ArrayList<String>a=new ArrayList<String>();
      for(int i=0;i<ll.length;i++){
          a.add(ll[i]);
      }
      int l=Collections.frequency(a,h);
      System.out.println(l);

    }

}
