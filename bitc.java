import java.math.BigInteger;
import java.util.*;
import java.util.ArrayList;
public class bitc {
  public static void main(String aa[]){
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     int b=s.nextInt();
    int c=a*b;
    String h=String.valueOf(c);
    BigInteger v=new BigInteger(h);
    int x=v.bitCount();
    System.out.println(x);

     
}
}
