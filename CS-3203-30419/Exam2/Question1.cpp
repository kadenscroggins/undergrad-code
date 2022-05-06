#include <iostream>
#include <fstream>

using namespace std;

int main() {
    // Write log of numbers from 2-101 to output.txt
    ofstream output_file;
    output_file.open("output.txt");
    for (int i=0; i<100; i++) {
        output_file << log(i+2);
        if (i<99) output_file << endl;
    }
    output_file.close();

    // Read output.txt and print to console
    // Doesn't handle any errors
    string line;
    ifstream input_file;
    input_file.open("output.txt");
    while (input_file >> line) {
        cout << line << endl;
    }
    input_file.close();
}