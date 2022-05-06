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
    Car *car1 = new Car();
    car1->accelerate(55);
    cout << "car1 speed: " << car1->getSpeed();
    delete car1;
}