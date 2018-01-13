import java.util.*;
import java.lang.*;
import java.lang.String;
import java.math.BigInteger;
import java.util.ArrayList;

public class du{
        public static void main(String args[]) {
         Scanner s=new Scanner(System.in);
         String x=s.next();
         char z[]=x.toCharArray();
         LinkedHashSet<Character>c=new LinkedHashSet<Character>();
         for(int i=0;i<x.length();i++){
             c.add(z[i]);
         }
         for(char v:c){
             System.out.print(v);
         }
    }

}
