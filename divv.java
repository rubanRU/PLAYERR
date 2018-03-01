import java.util.*;
public class divv{
  public static void main(String aa[]){
      int h;
      Scanner s=new Scanner(System.in);
     ArrayList<Integer>a=new ArrayList<Integer>();
     int n;
     h=s.nextInt();
     n=s.nextInt();
     for(int i=2;i<=n;i++){
         if(h%i==0&&n%i==0){
             a.add(i);
         }
     }
     System.out.println(Collections.max(a));
    }
}
