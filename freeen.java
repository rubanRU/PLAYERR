import java.util.*;
import java.util.ArrayList;
public class sfreeen{
  public static void main(String aa[]){
      int n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      char tt=s.next().charAt(0);
      char t[]=String.valueOf(n).toCharArray();
      ArrayList<Character>m=new ArrayList<Character>();
      for(int i=0;i<t.length;i++){
          m.add(t[i]);
      }
      int bb=Collections.frequency(m, tt);
      System.out.print(bb);
     
      
}
}
