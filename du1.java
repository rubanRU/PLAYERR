import java.util.*;
import java.util.ArrayList;
public class du{
    public static void main(String aa[]){
      Scanner s=new Scanner(System.in);
      String d=s.nextLine();
      int f=0;
      char a[]=d.toCharArray();
      ArrayList<Character>a1=new ArrayList<Character>();
      for(int i=0;i<a.length;i++){
          a1.add(a[i]);
      }
      for(int i=0;i<a.length;i++){
          int y=Collections.frequency(a1,a[i]);
          if(y>1){
             f=1;
             System.out.print("yes");
             break;
          }
      }
      if(f==0){
          System.out.println("no");
      }
}}
