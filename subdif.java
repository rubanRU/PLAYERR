import java.util.*;
import java.util.ArrayList;
public class subdif{
   public static void main(String a[]){
     Scanner s=new Scanner(System.in);
     String ss=s.nextLine();
     String b=s.nextLine();
     String k[]=ss.split(" ");
     String m[]=b.split(" ");
     for(int i=0;i<k.length;i++){
         if(!k[i].equals(m[i])){
             System.out.print(k[i]);
             break;
         }
     }
