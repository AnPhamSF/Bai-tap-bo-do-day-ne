#include <stdio.h>
void Nhap(int a[],int n){//ham nhap mang
    for(int i=0; i<n; i++){
        printf("\nNhap a[%d]=",i);
        scanf("%d",&a[i]);
    }
}
void Xuat(int a[],int n){//ham xuat mang
    for(int i=0; i<n; i++){
        printf("%d \t",a[i]);
    }
}
void InterchangeSort(int a[], int n){//thuat toan doi cho truc tiep
    for(int i=0 ; i<n-1 ; i++){
        for(int j=i+1; j<n ; j++){
            if(a[i]>a[j]){
                int tg = a[i];
                a[i] = a[j];
                a[j] = tg;
            }
        }
    }
    printf("\nMang sau khi sap xep la:\n");    
    Xuat(a,n);    
}
int main(){
    int a[100];
    int n;
    printf("Nhap so phan tu:");
    scanf("%d",&n);
    Nhap(a,n);
    printf("\nMang sau khi nhap la:\n");
    Xuat(a,n);
    InterchangeSort(a,n);
}