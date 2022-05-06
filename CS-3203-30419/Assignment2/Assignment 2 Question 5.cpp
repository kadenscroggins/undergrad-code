#include <iostream>
#include <vector>

using namespace std;

void printDoubles(vector<double> doubles) {
	cout << "Doubles in vector: ";
    for (double d : doubles) cout << d << " ";
    cout << endl;
}

int main() {

    cout << endl << "Creating vector of doubles..." << endl;
    vector<double> doubles{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                            11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    printDoubles(doubles);

    cout << endl << "Moving last element to position 5 and deleting last element..." << endl;
    doubles[4] = doubles[doubles.size() - 1];
    doubles.pop_back();

    printDoubles(doubles);
    
}