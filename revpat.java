
import java.util.*;
import java.lang.*;
import java.lang.String;
import java.math.BigInteger;
import java.util.ArrayList;

public class revpat{
        public static void main(String args[]) {
         Scanner s=new Scanner(System.in);
        String j=s.next();
        char x[]=new StringBuffer(j).reverse().toString().toCharArray();
        int l=x.length;
        for(int i=0;i<l;i++){
            System.out.print(x[i]+"-");
        }
    }

}
