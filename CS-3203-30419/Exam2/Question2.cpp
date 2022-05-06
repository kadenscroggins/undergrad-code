#include <iostream>

using namespace std;

class Car {
public:
    Car();
    Car(int what);
    int operator+(const Car& operand);
    int operator-(const Car& operand);
    int print_speed() const;
    int change_speed(int what);
private:
    int speed;
};

Car::Car() {
    speed = 0;
}

Car::Car(int what) {
    speed = what;
}

int Car::operator+(const Car& operand) {
    return speed + operand.print_speed();
}

int Car::operator-(const Car& operand) {
    return speed - operand.print_speed();
}

int Car::print_speed() const {
    return speed;
}

int Car::change_speed(int what) {
    speed = what;
    return speed;
}



int main() {
    Car *car1 = new Car();
    Car *car2 = new Car(10);
    car1->change_speed(2);
    cout << *car1 + *car2;
}