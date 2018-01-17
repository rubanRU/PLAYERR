import java.util.*;
public class wordso{
  public static void main(String aa[]){
     String s,b="";
     String tem="";
     Scanner ss=new Scanner(System.in);
     s=ss.nextLine();
     String x=s.toUpperCase();
     String a[]=x.split(" ");
     for(int i=0;i<a.length;i++){
         char l=a[i].charAt(0);
         if(Character.isDigit(l)){
            tem=tem+a[i]+" ";
         }
 else{
         char p[]=a[i].toCharArray();
         Arrays.sort(p);
          b=String.valueOf(p);
         tem=tem+b+" ";
          p=null;
         }
     }
     System.out.println(tem);
  }

}
