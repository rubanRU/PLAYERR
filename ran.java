import java.util.*;
import java.util.ArrayList;
public class ran{
   public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        String d=s.next();
        int f=0;
        char x[]=d.toCharArray();
        int k=s.nextInt();
        for(int i=0;i<=k;i++){
          int v=Character.getNumericValue(x[i]);
          if(v!=i+1){
              f=1;
              break;
          }
       
         }
        if(f==0){
            System.out.println("Yes");
        }
 else{
            System.out.printf("no");
 }
     }




   }
