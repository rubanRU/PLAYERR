import java.util.*;
      
      
        
import java.lang.*;
      
      
        import java.util.ArrayList;
      
      
        public class poww{
      
      
             public static void main(String aa[]){
      
      
             int a,b,f=0;
      
      
             Scanner s=new Scanner(System.in);
      
      
             a=s.nextInt();
      
      
             while(a!=1){
      
      
                 if(a%2!=0){
      
      
                     f=1;
      
      
                 }
      
      
                 a=a/2;
      
      
                }
      
      
             if(f==1){
      
      
                 System.out.println("No");
      
      
             }
      
      
         else{
      
      
                 System.out.println("Yes");
      
      
         }
      
      
            }
      
      
        }
