import java.util.*;
class pre{
public static void main(String aa[]){
int n,k;
int u=1;
Scanner s=new Scanner(System.in);
n=s.nextInt();
k=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
 a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
 if(a[i]==k){
 System.out.println("Yes");
 u=0;
 break;
 }
}
if(u==0){
System.out.println("No");
}
}
}
