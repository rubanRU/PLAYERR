import java.util.*;
public class coll {
  public static void main(String aa[]){
      int h;
      Scanner s=new Scanner(System.in);
      LinkedHashSet<Integer>a=new LinkedHashSet<Integer>();
      LinkedHashSet<Integer>b=new LinkedHashSet<Integer>();
      int n;
      n=s.nextInt();
      for(int i=0;i<n;i++){
          int u=s.nextInt();
          int y=s.nextInt();
          a.add(u);
          b.add(y);
      }
      if(a.size()==1||b.size()==1){
          System.out.println("yes");
      }
 else{
          System.out.println("no");
 }

    
  }
}
