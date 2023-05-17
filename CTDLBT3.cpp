#include <iostream>
using namespace std;

int main() {
    const int N = 100;
    int arr[N];
    int n;
    cout << "Nhap so phan tu cua mang: ";
    cin >> n;
    cout << "Nhap cac phan tu cua mang: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    // Sắp xếp mang theo phương pháp đổi chỗ trực tiếp
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[i]) {
                swap(arr[i], arr[j]); // Đổi chỗ phần tử thứ i và j
            }
        }
    }
    // Xuất mảng sau khi đã sắp xếp
    cout << "Mang sau khi sap xep: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
    return 0;
}
