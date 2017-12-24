import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class maxe{
     public static void main(String aa[]){
      int a;
     String h;
     int pp=0;
     String v;
     int count=0;
     int m[]=new int[100];
        String x[]=new String[100];
     Scanner s=new Scanner(System.in);
     h=s.nextLine();
     ArrayList<Character>a1=new ArrayList<Character>();
     ArrayList<Integer>bl=new ArrayList<Integer>();
     ArrayList<Integer>b2=new ArrayList<Integer>();
     String b[]=h.split("\\s+");
     for(int i=0;i<b.length;i++){
         v=b[i];
         for(int j=0;j<v.length();j++){
              char c=v.charAt(j);
              a1.add(c);
         }
         for(int k=0;k<v.length();k++){
             int g=Collections.frequency(a1, a1.get(k));
             bl.add(g);
         }
       Integer h1= Collections.max(bl);
       m[pp]=h1;
       x[pp]=v;
       pp++;
       count++;
       a1.removeAll(a1);
       bl.removeAll(bl);
     }
      pp=0;
     int max=m[pp];
     for(int i=0;i<count;i++){
         if(m[i]>max){
             max=m[i];
         }
     }
     for(int i=0;i<count;i++){
         if(m[i]==max){
             System.out.println(x[i]);
         }
     }

   
    
     

    }
}
