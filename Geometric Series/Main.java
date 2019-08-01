#include<stdio.h>
#include<math.h>
int main()
{
  int n,a,r,ts1,ts2,nterm;
  scanf("%5d",&n);
  if(n%2==1)
  {
    a=1;r=2;
    ts1=(n+1)/2;
    nterm=a*pow(r,ts1-1);
    printf("%d",nterm);
  }
  else
     {
    a=1;r=3;
    ts2=n/2;
    nterm=a*pow(r,ts2-1);
    printf("%d",nterm);
  }
  return 0;
}