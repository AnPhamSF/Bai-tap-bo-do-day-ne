#include <iostream>
using namespace std;

float findMax(float arr[], int n);

int main() {
    float arr[] = { -5.6, -1.8, 3.1, 9.4, 2.7 };
    int n = sizeof(arr) / sizeof(arr[0]);
    float maxVal = findMax(arr, n);
    cout << "Gia tri lon nhat trong mang la: " << maxVal << endl;
    return 0;
}

float findMax(float arr[], int n) {
    if (n == 1) {
        return arr[0];
    }
    float maxSub = findMax(arr, n - 1);
    if (arr[n - 1] > maxSub) {
        return arr[n - 1];
    }
    else {
        return maxSub;
    }
}
