#include<stdio.h>
 
int main()
{
  	int i, number;
  	scanf("%d", &number);
 
  	for(i = 1; i <= 2*number; i++)
  	{
    	if ( i % 2 != 0 ) 
    	{
  			printf("%d\n",i);
    	}
  	}
 
  	return 0;
}
