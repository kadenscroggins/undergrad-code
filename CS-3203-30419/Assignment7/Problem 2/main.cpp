#include "car.cpp"
#include "sports_car.cpp"
#include <iostream>
#include <vector>

using namespace std;

int main() {
    SportsCar tesla;

    cout << "Starting speed of tesla: ";
    cout << tesla.getSpeed() << endl;

    tesla.accelerate(50);
    cout << "After accelerating, tesla reaches a speed of ";
    cout << tesla.getSpeed() << endl;

    tesla.turbo();
    cout << "After turboing, tesla reaches a speed of ";
    cout << tesla.getSpeed() << endl;

    tesla.stop();
    cout << "After stopping, tesla is now at a speed of ";
    cout << tesla.getSpeed() << endl;


    vector<Car> garage;
    SportsCar ferrari;
    Car honda;
    Car toyota;

    tesla.accelerate(50);
    ferrari.accelerate(40);
    honda.accelerate(35);
    toyota.accelerate(25);

    garage.push_back(tesla);
    garage.push_back(ferrari);
    garage.push_back(honda);
    garage.push_back(toyota);

    cout << "Speed of each car in the vector: " << endl;
    for (int i=0; i<garage.size(); i++) {
        cout << "Car #" << i << ": " << garage[i].getSpeed();
        if (i < garage.size()-1) cout << endl;
    }

    return 0;
}