
import java.util.*;
import java.lang.*;
import java.lang.String;
import java.math.BigInteger;
import java.util.ArrayList;

public class squ {
        public static void main(String args[]) {
         int b;
         int sum=0;
        Scanner s = new Scanner(System.in);
        b=s.nextInt();
        String c=String.valueOf(b);
        for(int i=0;i<c.length();i++){
            int d=Character.getNumericValue(c.charAt(i));
            sum=sum+d*d;
        }
       System.out.print(sum);

    }
}
