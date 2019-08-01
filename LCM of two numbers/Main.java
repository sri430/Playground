// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n1,n2,small,i,lcm,gcd;
  scanf("%d%d",&n1,&n2);
  small=n1>n2?n2:n1;
  for(i=small;i>=1;i--)
  {
    if((n1%i==0)&&(n2%i==0))
    { gcd=i;
      break;
    }
  }
      lcm=(n1*n2)/gcd;
      printf("%d",lcm);
  return 0;
}
  