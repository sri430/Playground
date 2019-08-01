#include<stdio.h>
int main()
{
  int n,arr[128],i,remcnt=0;
  scanf("%d",&n);
while(n!=0)
{
  arr[remcnt++]=n%2;
  n=n/2;
}
  for(i=remcnt-1;i>=0;i--)
  {
    printf("%d",arr[i]);
  }
  return 0;
}