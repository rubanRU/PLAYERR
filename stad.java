
import java.util.*;
import java.lang.*;
import java.lang.String;
import java.math.BigInteger;
import java.util.ArrayList;

public class stad {
        public static void main(String args[]) {
         String c;
         Scanner s=new Scanner(System.in);
         c=s.next();
        int k=s.nextInt();
       int u =k-1;
        for(int i=u;i<c.length();i+=u+1){
            //System.out.print(i);
            System.out.print(c.charAt(i));
           
        }

    }
}
