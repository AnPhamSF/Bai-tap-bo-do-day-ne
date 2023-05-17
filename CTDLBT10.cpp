#include <iostream>
using namespace std;

int sumEven(int arr[], int n);

int main() {
    int arr[] = { -7, 22, 3, 4, 8 };
    int n = sizeof(arr) / sizeof(arr[0]);
    int sum = sumEven(arr, n);
    cout << "Tong cac so chan trong mang la: " << sum << endl;
    return 0;
}

int sumEven(int arr[], int n) {
    if (n == 0) {
        return 0;
    }
    else {
        int sum = sumEven(arr, n - 1);
        if (arr[n - 1] % 2 == 0) {
            sum += arr[n - 1];
        }
        return sum;
    }
}
