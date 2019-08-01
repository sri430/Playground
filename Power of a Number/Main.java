#include <stdio.h>
int main()
{
  	int b,exp,pow=1;
  scanf("%d",&b);
  scanf("%d",&exp);
  if(exp>=0)
  {
   for(int i=1;i<=exp;i++)
   { 
     pow=pow*b;
   }
  printf("%d",pow);
  }
  else 
   { printf("Wrong input");
   }
}