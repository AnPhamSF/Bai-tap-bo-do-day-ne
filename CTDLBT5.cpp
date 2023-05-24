#include <iostream>
using namespace std;

int main() {
    int arr[6];
    for (int i = 0; i < 6; i++) {
        cout << "Nhap phan tu thu " << i + 1 << ": ";
        cin >> arr[i];
    }
    for (int i = 1; i < 6; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }

    cout << "Mang sau khi sap xep: ";
    for (int i = 0; i < 6; i++) {
        cout << arr[i] << " ";
    }
    return 0;
}
