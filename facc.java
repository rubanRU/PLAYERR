class facc{
public static void main(String aa[]){
int n;
Scanner s=new Scanner(System.in)
n=s.nextInt();
for(int i=2;i<=n;i++){
if(n%i==0){
System.out.print(i+" ");
}
}
}
}
