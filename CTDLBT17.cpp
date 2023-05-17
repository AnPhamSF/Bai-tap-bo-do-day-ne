#include <iostream>
using namespace std;

float sum(float arr[], int len) {
    if (len == 1) {
        return arr[0];
    }

    int half = len / 2;
    float sumLeft = sum(arr, half);
    float sumRight = sum(arr + half, len - half);

    return sumLeft + sumRight;
}

int main() {
    float arr[] = { 1.2, 5.4, 3.6, 7.8, 9.1, 0.2 };
    int length = sizeof(arr) / sizeof(*arr);
    float total = sum(arr, length);

    cout << "Tong gia tri co trong mang: " << total << endl;
    return 0;
}
