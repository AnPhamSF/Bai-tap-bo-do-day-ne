#include <iostream>
using namespace std;

void printArray(int arr[], int len) {
    if (len == 1) {
        cout << arr[0] << " ";
        return;
    }

    cout << arr[0] << " ";
    printArray(arr + 1, len - 1);
}

int main() {
    int arr[] = { 1, 2, 3, 4, 5 };
    int length = sizeof(arr) / sizeof(*arr);
    printArray(arr, length);

    return 0;
}
