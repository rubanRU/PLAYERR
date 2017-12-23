import java.util.*;
import java.lang.*;
public class timd{
      public static void main(String aa[]){
       int h1;
       int h2;
       int m1;
       int m2;
       int d1;
       int d2;
       int re;
       Scanner s=new Scanner(System.in);
       h1=s.nextInt();
       h2=s.nextInt();
       m1=s.nextInt();
       m2=s.nextInt();
       d1=(h1*60)+m1;
       d2=(h2*60)+m2;
       if(d1>d2){
           re=d1-d2;
           System.out.println(re);
       }
      else{
           re=d2-d1;
           System.out.println(re);
      }

          
}
}
