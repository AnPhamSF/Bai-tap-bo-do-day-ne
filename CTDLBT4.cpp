#include <iostream>
using namespace std;

int main() {
    int arr[6];
    for (int i = 0; i < 6; i++) {
        cout << "Nhap phan tu thu " << i + 1 << ": ";
        cin >> arr[i];
    }
    for (int i = 0; i < 6 - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < 6; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        if (minIndex != i) {
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    cout << "Mang sau khi sap xep: ";
    for (int i = 0; i < 6; i++) {
        cout << arr[i] << " ";
    }
    return 0;
}
