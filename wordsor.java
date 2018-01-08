import java.util.*;
import java.lang.*;
import java.lang.String;
import java.math.BigInteger;
import java.util.ArrayList;

public class wordsor{
        public static void main(String args[]) {
         String c;
         Scanner s=new Scanner(System.in);
         c=s.nextLine();
         ArrayList<String>v=new ArrayList<String>();
         String a[]=c.split(" ");
         for(int i=0;i<a.length;i++){
             v.add(a[i]);
         }
         Collections.sort(v);
         for(String b:v){
             System.out.printf("%s ", b);
         }

    }
}
