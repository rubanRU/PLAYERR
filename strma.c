#include<stdio.h>
#include<string.h>
int main(void){
	char s[100];
	int l;
	int i;
	scanf("%s",s);
	l=strlen(s);
	for(i=0;i<l;i++){
		if(s[i]>='A'&&s[i]<='Z'){
			s[i]=s[i]+32;
		}
		 else if(s[i]>='a'&&s[i]<='z'){
			s[i]=s[i]-32;
		}
	}
	printf("%s",s);
}
