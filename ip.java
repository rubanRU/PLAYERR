import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class ip {
    public static void main(String aa[]){
   int n;
   int sum=0;
   String a1,a2,a3,a4;
   Scanner s=new Scanner(System.in);
   String a=s.nextLine();
   String c=a.substring(0, 3);
   String v=a.substring(3, 6);
   String cc=a.substring(6, 9);
   String ccc=a.substring(9, 12);
   int x=Integer.parseInt(c);
   int y=Integer.parseInt(v);
   int z=Integer.parseInt(cc);
   int zz=Integer.parseInt(ccc);
   if(x<=255&&y<=255&&z<=255&&zz<=255){
      a1=c.concat(".");
      a2=v.concat(".");
      a3=cc.concat(".");
      a4=a1+a2+a3+ccc;
      System.out.println(a4);
      
   }
 else{
       System.out.println("Not an ip");
 }


}
}

