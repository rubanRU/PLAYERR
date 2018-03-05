import java.util.*;
import java.util.ArrayList;
public class bitxo{
  public static void main(String aa[]){
     Scanner s=new Scanner(System.in);
     int f=s.nextInt();
     int k=0;
     int b[]=new int[f];
     ArrayList<Integer>a=new ArrayList<Integer>();
     for(int i=0;i<f;i++){
         b[i]=s.nextInt();
     }
     for(int i=0;i<f-1;i++){
         k=k^b[i];
         

}
     System.out.print(k);

}
}
