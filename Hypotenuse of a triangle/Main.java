#include<stdio.h>
int main()
{
  float opp,adj,hyp;
  scanf("%f",&opp);
  scanf("%f",&adj);
  hyp=sqrt((opp*opp)+(adj*adj));
  printf("%.2f",hyp);
  return 0;
}