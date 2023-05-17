#include <iostream>
using namespace std;

bool checkArr(float arr[], int n);

int main() {
    float arr1[] = { -5.6, -0.8, -3.1, -9.4, -2.7 };
    int n1 = sizeof(arr1) / sizeof(arr1[0]);
    if (checkArr(arr1, n1)) {
        cout << "Mang 1 toan gia tri am.\n";
    }
    else {
        cout << "Mang 1 khong toan gia tri am.\n";
    }

    float arr2[] = { -5.6, -0.8, 3.1, -9.4, -2.7 };
    int n2 = sizeof(arr2) / sizeof(arr2[0]);
    if (checkArr(arr2, n2)) {
        cout << "Mang 2 toan gia tri am.\n";
    }
    else {
        cout << "Mang 2 khong toan gia tri am.\n";
    }
    return 0;
}

bool checkArr(float arr[], int n) {
    if (n == 0) {
        return true;
    }
    if (arr[n - 1] >= 0) {
        return false;
    }
    return checkArr(arr, n - 1);
}
