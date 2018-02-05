import java.util.*;
import java.util.ArrayList;
public class modpre{
   public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            c[i]=s.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(c[i+1]%c[i]==0){
                System.out.println(c[i]);
            }
        }

        
     }




   }

