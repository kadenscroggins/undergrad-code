#include "list.cpp"
#include <cstdlib>
#include <ctime>
#include <vector>
#include <fstream>

using namespace std;

vector<int> * genRandVect(int size) {
    vector<int> *randVect = new vector<int>;
    srand(time(0));

    for (int i=0; i<size; i++) randVect->push_back(rand() % 58 + 1);

    return randVect;
}

vector<int> * addVectToList(vector<int> inVect, List * inList) {
    vector<int> *duplicates = new vector<int>;

    // If the list returns false due to duplicate data, the duplicate
    //   number will be pushed onto the duplicates vector.
    for (int val : inVect) if (!inList->insert(val)) duplicates->push_back(val);

    return duplicates;
}

void genOutput(vector<int> randVect, vector<int> duplicates, List intList) {
    cout << endl << "Random numbers:     ";
    for (int val : randVect) cout << val << " ";
    cout << endl;

    cout << "Contents of list:   ";
    intList.printList();

    cout << "Length of list:     " << intList.length() << endl;

    cout << "Duplicates removed: ";
    for (int val : duplicates) cout << val << " ";
    cout << endl;
}

void genOutputToFile(vector<int> randVect, vector<int> duplicates, List intList) {
    fstream file;
    file.open("output.txt", ios::out);
    streambuf* cout_backup = cout.rdbuf();
    streambuf* file_buffer = file.rdbuf();
    cout.rdbuf(file_buffer);

    cout << "Random numbers:     ";
    for (int val : randVect) cout << val << " ";
    cout << endl;

    cout << "Contents of list:   ";
    intList.printList();

    cout << "Length of list:     " << intList.length() << endl;

    cout << "Duplicates removed: ";
    for (int val : duplicates) cout << val << " ";

    cout.rdbuf(cout_backup);

    file.close();
}