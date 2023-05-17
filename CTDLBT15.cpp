#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* prev;
    Node* next;
};

Node* createNode(int data) {
    Node* newNode = new Node();
    newNode->data = data;
    newNode->prev = newNode->next = NULL;
    return newNode;
}

Node* insertNode(Node* head, int data) {
    if (head == NULL) {
        return createNode(data);
    }

    Node* newNode = createNode(data);
    head->next = newNode;
    newNode->prev = head;

    return newNode;
}

void printList(Node* head) {
    while (head != NULL) {
        cout << head->data << " ";
        head = head->next;
    }
}

int main() {
    Node* head = NULL;
    head = insertNode(head, 6);
    Node* node2 = insertNode(head, 7);
    Node* node3 = insertNode(node2, 8);
    insertNode(node3, 9);

    printList(head);
    return 0;
}
