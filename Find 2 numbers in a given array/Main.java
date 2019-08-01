#include<stdio.h>
int main()
{
 int n1,n2,index1=-1,index2=-1,i,n;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d%d",&n1,&n2);
  for(i=0;i<n;i++)
  {
    if(n1==a[i] && index1==-1)
    {
      index1=i;
    }
    if(n2==a[i] && index2==-1)
    {
      index2=i;
    }
  }
    printf("Element 1 index = %d\nElement 2 index = %d",index1,index2);
}
    
    
  
  
  
  
  
  
  
