#include <iostream>
#include <algorithm>
using namespace std;

int binarySearch(int arr[], int l, int r, int x) {
    if (r >= l) { // Nếu còn phần tử để tìm kiếm
        int mid = l + (r - l) / 2; // Tìm chỉ số của phần tử ở giữa mảng
        if (arr[mid] == x) { // Nếu phần tử ở giữa mảng là giá trị cần tìm
            return mid; // Trả về chỉ số của phần tử đó
        }
        if (arr[mid] > x) { // Nếu giá trị cần tìm nhỏ hơn giá trị ở giữa mảng
            return binarySearch(arr, l, mid - 1, x); // Đệ quy tìm kiếm trong nửa trái của mảng
        }
        else { // Nếu giá trị cần tìm lớn hơn giá trị ở giữa mảng
            return binarySearch(arr, mid + 1, r, x); // Đệ quy tìm kiếm trong nửa phải của mảng
        }
    }
    return -1; // Nếu không tìm thấy giá trị cần tìm
}

int main() {
    int n; // Số lượng phần tử trong mảng
    cout << "Nhap so luong phan tu: ";
    cin >> n;
    int arr[] = {n}; // Khởi tạo mảng với kích thước vừa nhập
    cout << "Nhap mang: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    int x; // Giá trị cần tìm
    cout << "Nhap gia tri can tim: ";
    cin >> x;
    sort(arr, arr + n); // Sắp xếp mảng trước khi tìm kiếm nhị phân
    int result = binarySearch(arr, 0, n - 1, x); // Tìm kiếm giá trị trong mảng
    if (result == -1) {
        cout << "Khong tim thay " << x << " trong mang." << endl;
    }
    else {
        cout << x << " Co trong mang tai vi tri " << result << "." << endl;
    }
    return 0;
}
