#include<stdio.h>
int main()
{
  float r,o,pi=3.14,arc,l;
  scanf("%f",&r);
  scanf("%f",&o);
  l=(o/360);
  arc=(2*pi*r*l);
  printf("%.2f",arc);
  return 0;
}