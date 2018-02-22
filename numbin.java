import java.util.*;
public class numbin {
  public static void main(String aa[]){
      int h;
      Scanner s=new Scanner(System.in);
      h=s.nextInt();
      Integer f=new Integer(h);
      String c=f.toBinaryString(h);
      System.out.println(c);
  }
}
