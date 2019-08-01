#include<stdio.h>
int main()
{
  int i,n,k=0;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&k);
  for(i=0;i<n;i++)
  {
  if(arr[i]==k)
  {
    printf("%d",i+1);
    return 0;
  }
  }
  printf("%d isn't present in the array.",k); 
  return 0;
}