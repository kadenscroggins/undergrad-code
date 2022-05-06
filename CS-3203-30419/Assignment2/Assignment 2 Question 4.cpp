#include <iostream>
#include <vector>

using namespace std;

int main() {
	vector<double> doubles(10);
	for (int i=0; i<doubles.size(); i++) doubles[i] = i;
}