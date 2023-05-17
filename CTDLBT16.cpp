#include <iostream>
using namespace std;

float sumPositive(float arr[], int len) {
    if (len == 1) {
        return (arr[0] > 0 ? arr[0] : 0);
    }

    int half = len / 2;
    float sumLeft = sumPositive(arr, half);
    float sumRight = sumPositive(arr + half, len - half);

    return sumLeft + sumRight;
}

int main() {
    float arr[] = { 1.2, -5.4, 3.6, -7.8, 9.1, 0.2 };
    int length = sizeof(arr) / sizeof(*arr);
    float sum = sumPositive(arr, length);

    cout << "Tong gia tri duong co trong mang: " << sum << endl;
    return 0;
}
