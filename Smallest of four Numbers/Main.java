#include<stdio.h>

int main()
{
  int a,b,c,d,small1,small2,smallest;
  scanf("%d%d%d%d",&a,&b,&c,&d);
  small1=a>b?b:a;
  small2=c>d?d:c;
  smallest=small1>small2?small2:small1;
  printf("%d",smallest);
}