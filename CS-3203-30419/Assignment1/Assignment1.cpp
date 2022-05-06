#include <iostream>

using namespace std;

class Car {
public:
    Car();
    void accelerate(int new_speed);
    void stop();
    int getSpeed() const;

private:
    int speed;
};

Car::Car() {
    int speed = 0;
}

void Car::accelerate(int new_speed) {
    speed = new_speed;
}

void Car::stop() {
    speed = 0;
}

int Car::getSpeed() const {
    return speed;
}


int main() {
    Car car1;

    cout << "Starting speed of car1: ";
    cout << car1.getSpeed() << endl;

    car1.accelerate(5);
    cout << "After accelerating, car1 reaches a speed of ";
    cout << car1.getSpeed() << endl;

    car1.stop();
    cout << "After stopping, car1 is now at a speed of ";
    cout << car1.getSpeed() <<endl;

    return 0;
}