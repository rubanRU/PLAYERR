import java.util.*;
class suml{
public static void main(String aa[]){
int n;
int f=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
b=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
  a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
 if(a[i]==b){
   f=1;
   break;
 }
}
if(f==1){
System.out.println("yes");
}
else{
System.out.println("no);
}

}
}
