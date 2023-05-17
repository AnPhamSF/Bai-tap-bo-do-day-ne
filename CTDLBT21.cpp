#include <iostream>
using namespace std;

int T(int n);

int main() {
    int n = 15;
    cout << "T(" << n << ") = " << T(n) << endl;
    return 0;
}

int T(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    return n * T(n - 1);
}
