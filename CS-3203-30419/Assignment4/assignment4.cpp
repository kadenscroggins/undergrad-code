#include <iostream>
#include <sstream>
#include <fstream>

using namespace std;

int main() {
    ofstream file;
    file.open("output.txt");
    for (int i=1; i<=100; i++) file << i << endl;
    file.close();

    ifstream fin ("output.txt");
    fin.seekg(0, ios::end);
    long file_length = fin.tellg();
    cout << "File length: " << file_length;
}