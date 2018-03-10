import java.util.*;
import java.lang.*;class mont
{      public static void main(String args[])  

{        String a[]={"01","02","03","04","05","06","07","08","09","10","11","12"};      
String v[]={"jan","feb","mar","ap","may","june","july","au","se","oc","nov","dec"};      
Scanner s=new Scanner(System.in);        
String h=s.nextLine();        
String j[]=h.split("-");        
for(int i=0;i<a.length;i++){           
if(j[1].equals(a[i])){               
System.out.println(v[i]);                   
break;    
}        
}           
}}
