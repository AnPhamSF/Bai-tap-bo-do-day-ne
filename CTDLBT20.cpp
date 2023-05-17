#include <iostream>
using namespace std;

void sortArr(float arr[], int n);

int main() {
    float arr[] = { -7.6, 2.8, 2.7, -9.3, 4.6 };
    int n = sizeof(arr) / sizeof(arr[0]);
    sortArr(arr, n);
    cout << "Mang sau khi sap xep: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
    return 0;
}

void sortArr(float arr[], int n) {
    if (n <= 1) {
        return;
    }
    sortArr(arr, n - 1);
    float lastVal = arr[n - 1];
    int j = n - 2;
    while (j >= 0 && arr[j] > lastVal) {
        arr[j + 1] = arr[j];
        j--;
    }
    arr[j + 1] = lastVal;
}
