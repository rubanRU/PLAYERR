import java.util.*;
import java.util.ArrayList;
public class bitand{
  public static void main(String aa[]){
     Scanner s=new Scanner(System.in);
     int f=s.nextInt();
     int b[]=new int[f];
     ArrayList<Integer>a=new ArrayList<Integer>();
     for(int i=0;i<f;i++){
         b[i]=s.nextInt();
     }
     for(int i=0;i<f;i++){
         for(int j=0;j<f;j++){
             int y=b[i]&b[j];
             a.add(y);
         }
     }
     System.out.println(Collections.max(a));
}
}
