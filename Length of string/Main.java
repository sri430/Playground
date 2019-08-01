#include<stdio.h>
void main()
{
  int i;
  char str[100];
  scanf("%[^\n]s",str);
  i = strlen(str);
  {
    printf("%d",i);
  }
  
  return 0;
}