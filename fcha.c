#include<stdio.h>
#include<string.h>
int main(void){
	char s[100];
	int i;
	int l;
	char k;
	int count=0;
	scanf("%c",&k);
	scanf("%s",s);
	l=strlen(s);
	for(i=0;i<l;i++){
		if(s[i]==k){
			printf("%d",i+1);
		}
	}
}
