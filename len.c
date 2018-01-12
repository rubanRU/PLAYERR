#include<stdio.h>
int main(void){
	char s[100];
	int i;
	int count=0;
	scanf("%s",s);
	for(i=0;s[i]!='\0';i++){
		 count++;
	}
	printf("%d",count);
}
