#include <iostream>
using namespace std;

#define MAX_SIZE 100

class Queue {
private:
    int arr[MAX_SIZE];
    int front, rear;

public:
    Queue() {
        front = -1;
        rear = -1;
    }

    void enqueue(int data) {
        if (rear >= MAX_SIZE - 1) {
            cout << "Hang doi day roi !" << endl;
            return;
        }

        if (front == -1 && rear == -1) {
            front++;
            rear++;
            arr[rear] = data;
        }
        else {
            rear++;
            arr[rear] = data;
        }
    }

    int dequeue() {
        if (front == -1 || front > rear) {
            cout << "Hang doi!" << endl;
            return 0;
        }

        int data = arr[front];
        front++;

        return data;
    }

    bool isEmpty() {
        if (front == -1 || front > rear)
            return true;
        else
            return false;
    }

    void printQueue() {
        cout << "Hang doi: ";
        for (int i = front; i <= rear; i++) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
};

int main() {
    Queue queue;

    queue.enqueue(41);
    queue.enqueue(23);
    queue.enqueue(4);
    queue.enqueue(14);
    queue.enqueue(56);
    queue.enqueue(1);

    queue.enqueue();
    queue.dequeue();
    queue.dequeue();

    queue.printQueue();

    return 0;
}
