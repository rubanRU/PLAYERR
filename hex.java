mport java.util.*;
public class hex{
  public static void main(String aa[]){
      int h;
      Scanner s=new Scanner(System.in);
      h=Integer.parseInt(s.nextLine(), 2);
      String u=Integer.toOctalString(h);
     System.out.println(u);
    
  }
}
