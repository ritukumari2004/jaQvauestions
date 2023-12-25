#include <stdio.h>
int main()
{
    // int x=10; 
    // printf("%d %d %d %d %d",++x,x++,x++,++x,++x);
    int x=3;
    int y=++x*x++*++x;
    printf("%d",y);
    return 0;
}
