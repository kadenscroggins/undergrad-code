#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	vector<double> doubles(10);
	for (int i=0; i<doubles.size(); i++) doubles[i] = i;

    vector<double>::iterator p;
    for (p = doubles.begin(); p < doubles.end(); p++) {
        cout << *p << endl;
    }

    p = doubles.begin();
    while (p < doubles.end()) {
        if (fmod(*p, 2.0) != 0.0) doubles.erase(p);
        else p++;
    }

    cout << "Vector with odd numbers removed: " << endl;
    for (p = doubles.begin(); p < doubles.end(); p++) {
        cout << *p << endl;
    }
}