
import java.util.*;
public class dupupper {
   public static void main(String aa[]){
       String c;
       String te="";
       Scanner s=new Scanner(System.in);
       c=s.nextLine();
       ArrayList<Character>o=new ArrayList<Character>();
       for(int i=0;i<c.length();i++){
           o.add(c.charAt(i));
       }
       for(int i=0;i<o.size();i++){
          int x=Collections.frequency(o, o.get(i));
          char v=o.get(i);
          if(x>1&&Character.isLetter(v)){
              char x1=Character.toUpperCase(v);
              te=te+x1;
          }
 else{
              te=te+v;
 }
       }
       System.out.println(te);
   }
}
