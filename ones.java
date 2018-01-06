import java.util.*;
import java.lang.*;
import java.lang.String;
import java.math.BigInteger;
import java.util.ArrayList;

public class ones {

    public static void main(String args[]) {
        String h;
        Scanner s = new Scanner(System.in);
        h=s.next();
       BigInteger d=new BigInteger(h);
      int b= d.bitCount();
      System.out.print(b);
    }
}
