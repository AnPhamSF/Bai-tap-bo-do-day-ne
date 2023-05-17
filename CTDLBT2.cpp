#include <iostream>
using namespace std;

int main() {
    const int N = 100;
    int arr[N];
    int n, x;
    cout << "Nhap so phan tu cua mang: ";
    cin >> n;
    cout << "Nhap cac phan tu cua mang: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    cout << "Nhap gia tri can tim: ";
    cin >> x;
    int index = -1; // Chỉ số của giá trị cần tìm
    for (int i = 0; i < n; i++) {
        if (arr[i] == x) {
            index = i;
            break; // Dừng vòng lặp khi tìm thấy giá trị cần tìm
        }
    }
    if (index == -1) {
        cout << "Khong tim thay " << x << " trong mang." << endl;
    }
    else {
        cout << x << " Co trong mang tai vi tri " << index << "." << endl;
    }
    return 0;
}
