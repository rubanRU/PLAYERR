import java.util.*;
import java.util.ArrayList;
public class maxo{
    public static void main(String aa[]){
      Scanner s=new Scanner(System.in);
      String m=s.nextLine();
      ArrayList<Character>a1=new ArrayList<Character>();
      int sz=0;
      char t='\0';
      String a[]=m.split(" ");
      for(int i=0;i<a.length;i++){
          char x[]=a[i].toCharArray();
          for(int j=0;j<x.length;j++){
              a1.add(x[j]);
          }
            for(int k=0;k<x.length;k++){
                if(k==0){
                      sz=Collections.frequency(a1, x[k]);
                      t=x[k];
                }
          else{
                int y=Collections.frequency(a1, x[k]);
                if(y>=sz){
                   sz=y;
                   t=x[k];
                }
            }
            }
          System.out.print(t+" ");
           x=null;
           a1.clear();
                }
}}
