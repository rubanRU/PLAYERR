import java.util.*;
import java.util.ArrayList;
public class linkk{
  public static void main(String aa[]){
      int n;
      int h;
      LinkedHashSet<Integer>a=new LinkedHashSet<Integer>();
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      h=s.nextInt();
      for(int i=0;i<n;i++){
          int y=s.nextInt();
          a.add(y);
      }
      ArrayList<Integer>a1=new ArrayList<Integer>(a);
      Collections.sort(a1);
      System.out.println(a1.get(h-1));
     
      
}
}
