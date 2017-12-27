import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class ch1{
    public static void main(String aa[]){
   int n;
   int sum=0;
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
   ArrayList<Integer>a=new ArrayList<Integer>();
   for(int i=0;i<n;i++){
       int c=s.nextInt();
       a.add(c);
   }
   for(int i=0;i<a.size();i++){
       Integer v=Collections.frequency(a, a.get(i));
       if(v==1){
           System.out.println(a.get(i));
           break;
       }
   }

}
}

