#include <iostream>
#include <vector>

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
    speed = 0;
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


class SportsCar : public Car
{
public:
    SportsCar();
    void turbo();
private:
    bool hasTurbo;
};

SportsCar::SportsCar() {
    hasTurbo = false;
}

void SportsCar::turbo() {
    hasTurbo = true;
    this->accelerate(this->getSpeed() * 1.5);
}


int main() {
    vector<Car*> garage;

    SportsCar *ferrari = new SportsCar();
    SportsCar *tesla = new SportsCar();
    Car *honda = new Car();
    Car *toyota = new Car();

    tesla->accelerate(50);
    ferrari->accelerate(40);
    honda->accelerate(35);
    toyota->accelerate(25);

    try {
        garage.push_back(tesla);
        garage.push_back(ferrari);
        garage.push_back(honda);
        garage.push_back(toyota);
    }
    catch (const exception& e) {
        cout << "An exception occurred.";
        return -1;
    }
}