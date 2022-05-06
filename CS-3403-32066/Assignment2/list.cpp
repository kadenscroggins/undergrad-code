#pragma once
#include "list.h"
#include <iostream>

using namespace std;

List::List() {
    Node *head;
}

bool List::insert(int data) {
    Node *currNode = head;
    Node *newNode = new Node();
    newNode->data = data;

    if (!head) {
        head = new Node();
        head->next = newNode;
        return true;
    }
    else while (currNode->next) {
        if (currNode->next->data == data) {
            return false;
        }
        else if (currNode->next->data > data) {
            newNode->next = currNode->next;
            currNode->next = newNode;
            return true;
        }
        else {
            currNode = currNode->next;
        }
    }

    // Insert new element at the end if it is the largest
    currNode->next = newNode;

    return true;
}

void List::printList() {
    Node *currNode = head;

    while (currNode->next) {
        cout << currNode->next->data << " ";
        currNode = currNode->next;
    }
    cout << endl;
}

int List::length() {
    Node *currNode = head;
    int ret = 0;

    while (currNode->next) {
        ret++;
        currNode = currNode->next;
    }

    return ret;
}