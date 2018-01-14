import java.util.*;
import java.lang.*;
import java.lang.String;
import java.math.BigInteger;
import java.util.ArrayList;

public class maxst{
        public static void main(String args[]) {
         Scanner s=new Scanner(System.in);
        String j=s.nextLine();
        String n="";
        String c[]=j.split(" ");
        int l=c[0].length();
        for(int i=1;i<c.length;i++){
           int k=c[i].length();
           if(k>l){
               l=k;
               n=c[i];
           }

        }
        System.out.print(n);
        
    }
}
