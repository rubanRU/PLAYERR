import java.util.*;
import java.lang.*;
import java.lang.String;
import java.util.ArrayList;
public class palvow{
    public static void main(String aa[]){
    int count=0;
    Scanner s=new Scanner(System.in);
    String j=s.next();
    String c=new StringBuffer(j).reverse().toString();
    if(j.equals(c)){
        for(int i=0;i<c.length();i++){
            if((c.charAt(i)=='a'||c.charAt(i)=='e'||c.charAt(i)=='i'||c.charAt(i)=='o'||c.charAt(i)=='u')||(c.charAt(i)=='A'||c.charAt(i)=='A'||c.charAt(i)=='E'||c.charAt(i)=='I'||c.charAt(i)=='O'||c.charAt(i)=='U')){
                count++;
            }
        }
    }
    System.out.println(count);
   
}
}
 



