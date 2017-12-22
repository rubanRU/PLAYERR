import java.util.*;
import java.lang.*;
public class numr{
      public static void main(String aa[]){
          int p;
          Scanner m=new Scanner(System.in);
          p=m.nextInt();
          String s=String.valueOf(p);
          String n=new StringBuffer(s).reverse().toString();
          System.out.println(n);
}
}
