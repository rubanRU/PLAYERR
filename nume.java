
import java.util.*;
import java.lang.*;
import java.lang.String;
import java.math.BigInteger;
import java.util.ArrayList;

public class nume{
        public static void main(String args[]) {
         String c;
         Scanner s=new Scanner(System.in);
         c=s.next();
         String z=c.replaceAll("[0-9]", "");
         if(z.length()==0){
             System.out.print("Yes");
         }
 else{
             System.out.print("no");
 }
         }

    }
