#include<stdio.h>
int main()
{
  int n,sclast;
  scanf("%d",&n);
  sclast=n%100;
  sclast=sclast/10;
  printf("%d",sclast);
  
  
  return 0;
}