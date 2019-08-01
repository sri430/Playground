#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  int first=num/100;
  int last=num%10;
  int sum=first+last;
  printf("%d",sum);
  return 0;
}