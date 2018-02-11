import java.util.*;
import java.util.ArrayList;
public class fr {
  public static void main(String aa[]){
      int n;
      int f=0;
      Scanner s=new Scanner(System.in);
      String g=s.nextLine();
      char t=s.next().charAt(0);
      ArrayList<Character>a=new ArrayList<Character>();
      for(int i=0;i<g.length();i++){
          char s1=g.charAt(i);
          a.add(s1);
      }
      int l=Collections.frequency(a,t);
      System.out.println(l);

    }

}
