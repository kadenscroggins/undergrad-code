#include <iostream>

using namespace std;

class Car {
public:
    Car();
    virtual ~Car() { cout << "DESTROY!"; };
    void accelerate(int new_speed);
    void stop();
    int getSpeed() const;
    int operator+(Car operand);
    int operator-(Car operand);

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

int Car::operator+(Car operand) {
    return (this->getSpeed() + operand.getSpeed());
}

int Car::operator-(Car operand) {
    return (this->getSpeed() - operand.getSpeed());
}


int main() {
    Car car1;
    Car car2;
    car1.accelerate(25);
    car2.accelerate(12);

    cout << "Car1 speed: " << car1.getSpeed() << endl;
    cout << "Car2 speed: " << car2.getSpeed() << endl;
    cout << "Car1 + Car2: " << car1 + car2 << endl;
    cout << "Car1 - Car2: " << car1 - car2 << endl;

    Car* car3 = new Car();
    delete car3;
}