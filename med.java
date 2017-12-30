import java.util.*;
class med{
public static void main(String aa[]){
  int n;
  int sum=0;
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++){
    a[i]=s.nextInt();
    sum=sum+a[i];
  }
  int y=sum/n;
  System.out.println(y);
  
  
}
}
