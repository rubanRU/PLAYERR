import java.util.*;
import java.lang.*;
import java.lang.String;
import java.util.ArrayList;
public class secsmall{
    public static void main(String aa[]){
       
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    LinkedHashSet<Integer>b=new LinkedHashSet<Integer>();
    for(int i=0;i<a;i++){
        int c=s.nextInt();
        b.add(c);
    }
   ArrayList<Integer>v=new ArrayList<Integer>(b);
   Collections.sort(v);
   System.out.println(v.get(1));


   
}
}
 



