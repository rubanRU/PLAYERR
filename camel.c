#include<stdio.h>
#include<string.h>
int main(void){
   char s[100];
   int l,i,k;
    gets(s);
    l=strlen(s);
    for(i=0;i<l;i++){
    	if(i==0){
    		s[i]=s[i]-32;
		}
		if(s[i]==' '){
			s[i+1]=s[i+1]-32;
			for(k=i;k<l;k++){
				s[k]=s[k+1];
			}
			l--;
		}
	}
	printf("%s",s);
}
