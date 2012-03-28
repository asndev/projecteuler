#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <assert.h>

long unsigned int hyper(long unsigned int a, long unsigned int n,
                        long unsigned int b)
{
  if (n==1) return pow(a,b);
  if (b==0) return 1;
  hyper(a, n-1, hyper(a,n,b-1));
}


long unsigned int ack(int m,int n)
{
  return (hyper(2,m-2,n+3) - 3);
}

int main(int argc, char** argv)
{
  if (argc != 3)
  {
    printf("Usage: ./%s n m c\n", argv[0]);
    exit(1);
  }
  int m = atoi(argv[1]);
  int n = atoi(argv[2]);
  printf("Ack(%i,%i) = %lu \n",m,n,ack(m,n)); 
  return 0;
}
