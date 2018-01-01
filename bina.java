import java.util.*;
import java.lang.*;
import java.lang.String;
import java.util.ArrayList;
public class bina{
    public static void main(String aa[]){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    Integer t=new Integer(a);
   String b= t.toBinaryString(a);
   String v=t.toHexString(a);
   String c=t.toOctalString(a);
   System.out.println(b);
   System.out.println(v);
   System.out.println(c);


   
}
}
 



