
import java.util.*;
public class subs{
    public static void main(String aa[]){
       Scanner z=new Scanner(System.in);
       String c=z.next();
       int k=z.nextInt();
       String c1=c.substring(0,k-1)+c.substring(k-1).toUpperCase();
       System.out.println(c1);
    }
}
