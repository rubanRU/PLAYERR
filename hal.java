import java.util.*;
import java.util.ArrayList;
public class hal {
  public static void main(String aa[]){
   Scanner s=new Scanner(System.in);
   ArrayList<Integer>j=new ArrayList<Integer>();
   ArrayList<Integer>m=new ArrayList<Integer>();
    ArrayList<Integer>p=new ArrayList<Integer>();
   int n=s.nextInt();
   for(int i=0;i<n;i++){
      int y=s.nextInt();
      j.add(y);
   }
   Collections.sort(j);
   int u=j.size();
   int oo=u/2;
   Collections.rotate(j, oo+1);
    int pp=u-oo;
   for(int k=pp;k<u;k++){
       int l=j.get(k);
       m.add(l);
      }
   Collections.sort(m,Collections.reverseOrder());
   for(int i=0;i<u-oo;i++){
        int k=j.get(i);
        p.add(k);

      }
   for(int i=0;i<m.size();i++){
       int mm=m.get(i);
       p.add(mm);
   }
 for(int d:p){
     System.out.print(d+" ");
 }

  }
}
