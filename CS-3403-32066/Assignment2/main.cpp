#include "list.cpp"
#include "functions.cpp"
#include <vector>
#include <iostream>
// I chose to use vectors for the random numbers instead of arrays
//   because I was having issues making a function to return an array
//   and the focus of the assignment is the linked list, not arrays

using namespace std;

int main() {
    int size = 30; // Adjust this to adjust size of output
    vector<int> randVect = *genRandVect(size);
    static List intList;

    // generate vector, add it to list, store duplicates
    vector<int> duplicates = *addVectToList(randVect, &intList);

    genOutput(randVect, duplicates, intList);
    genOutputToFile(randVect, duplicates, intList);
}