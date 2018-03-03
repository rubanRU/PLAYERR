import java.util.*;
class abb{
public static void main(String aa[]){
String a="[abAB]";
Scanner s=new Scanner(System.in);
String v=s.nextLine();
String j=v.replaceAll(a,"");
if(j==null){
 System.out.println("yes");
}
else{
System.out.println("no");
}
}
}
