#pragma once
#include "node.h"

// Header for the singly-linked list
class List {
public:
    List();
    //insert() returns false if data is duplicate
    bool insert(int data);
    void printList();
    int length();
private:
    Node *head;
};