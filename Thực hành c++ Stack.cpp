#include <iostream>
using namespace std;

#define MAX 100

class Stack {
private:
    int top;
    int arr[MAX];
public:
    Stack() {
        top = -1;
    }
    bool push(int x) {
        if (top >= (MAX - 1)) {
            cout << "Stack Overflow";
            return false;
        }
        else {
            arr[++top] = x;
            return true;
        }
    }
    int pop() {
        if (top < 0) {
            cout << "Stack Underflow";
            return 0;
        }
        else {
            int x = arr[top--];
            return x;
        }
    }
    int peek() {
        if (top < 0) {
            cout << "Stack is Empty";
            return 0;
        }
        else {
            int x = arr[top];
            return x;
        }
    }
    bool isEmpty() {
        return (top < 0);
    }
    void display() {
        cout << "Stack: ";
        for (int i = top; i >= 0; i--)
            cout << arr[i] << " ";
        cout << endl;
    }
};

int main() {
    Stack s;
    int arr[6] = { 41, 23, 4, 14, 56, 1 };
    for (int i = 0; i < 6; i++)
        s.push(arr[i]);
    cout << "Top element: " << s.pop() << endl;
    s.display();
    return 0;
}