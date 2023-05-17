#include <iostream>
using namespace std;

int countPositive(float arr[], int len) {
    if (len == 1) {
        return (arr[0] > 0 ? 1 : 0);
    }

    int half = len / 2;
    int countLeft = countPositive(arr, half);
    int countRight = countPositive(arr + half, len - half);

    return countLeft + countRight;
}

int main() {
    float arr[] = { 1.2, -5.4, 3.6, -7.8, 9.1, 0.2 };
    int length = sizeof(arr) / sizeof(*arr);
    int count = countPositive(arr, length);

    cout << "Giá trị dương có trong mảng: " << count << endl;
    return 0;
}
