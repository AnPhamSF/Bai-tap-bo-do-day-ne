#include<stdio.h>
#include<conio.h>

long Tich(int n)
{
    if(n <= 1)
        return 1;
    return Tich(n - 1)*n;
}

int main()
{
    int n, T ;
    printf("\n Nhap n = ");
    scanf("%d", &n);

    T = Tich(n);
    printf("T = %d", T);

    getch();
    return 0;
}
