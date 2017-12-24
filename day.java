import java.util.*;
import java.lang.*;
public class day {
     public static void main(String aa[]){
     int n;
     String d[]={"MONDAY","TUESDAY","WEDNESDAY","THRUSDAY","FRIDAY","SATURDAY"};
     String b;
     int y=0;
     Scanner s=new Scanner(System.in);
     b=s.next();
     for(int i=0;i<d.length;i++){
         if(!d[i].equals(b)){
             y=1;
         }
     }
     if(y==1){
         System.out.println("False");
     }
 else{
          System.out.println("True");
 }
     

    }

}
