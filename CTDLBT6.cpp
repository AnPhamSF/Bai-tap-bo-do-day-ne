#include <iostream>
using namespace std;

void Swap(int& a, int& b) {
    int temp = a;
    a = b;
    b = temp;
}

int Partition(int arr[], int left, int right) {
    int pivot = arr[right];
    int i = left - 1;
    for (int j = left; j <= right - 1; j++) {
        if (arr[j] <= pivot) {
            i++;
            Swap(arr[i], arr[j]);
        }
    }
    Swap(arr[i + 1], arr[right]);
    return i + 1;
}

void QuickSort(int arr[], int left, int right) {
    if (left < right) {
        int pivot = Partition(arr, left, right);
        QuickSort(arr, left, pivot - 1);
        QuickSort(arr, pivot + 1, right);
    }
}

int main() {
    int n;
    do {
        cout << "Nhap so phan tu cua mang: ";
        cin >> n;
    } while (n <= 0);

    int* arr = new int[n];
    for (int i = 0; i < n; i++) {
        cout << "Nhap phan tu thu " << i + 1 << ": ";
        cin >> arr[i];
    }
    QuickSort(arr, 0, n - 1);

    cout << "Mang sau khi sap xep: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }

    delete[] arr;
    return 0;
}
