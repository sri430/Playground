#include<stdio.h>
int power(int base, int exp)
{
  int i,sum=1;
  for(i=0;i<exp;i++)
  {
    sum=sum*base;
  }
  return sum; 
}
int main()
{
  int b,rem,sum=0,exp=0;
  scanf("%d",&b);
  while(b!=0)
  {
    rem=b%10;
    sum=sum+rem*power(2,exp);
    exp++;
    b=b/10;
   }
  int arr[50],i=0,j;
  while(sum!=0)
  {
    arr[i++]=sum%8;
    sum=sum/8;
  }
  for(j=i-1;j>=0;j--)
   printf("%d",arr[j]);
}