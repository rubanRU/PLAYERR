import java.util.*;
import java.util.ArrayList;
public class merges {
   public static void main(String a[]){
      ArrayList<Integer>s=new ArrayList<Integer>();
      ArrayList<Integer>n=new ArrayList<Integer>();
      Scanner sq=new Scanner(System.in);
      int n1=sq.nextInt();
      int n2=sq.nextInt();
      for(int i=0;i<n1;i++){
          int y=sq.nextInt();
          s.add(y);
      }
      for(int i=0;i<n2;i++){
          int l=sq.nextInt();
          n.add(l);

      }
      for(int i=0;i<n2;i++){
          int hh=n.get(i);
          s.add(hh);

      }
      Collections.sort(s);
      for(int k:s){
          System.out.print(k+" ");
      }




   }
}
