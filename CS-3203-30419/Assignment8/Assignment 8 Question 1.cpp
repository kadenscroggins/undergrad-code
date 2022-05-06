#include <iostream>
#include <vector>
using namespace std;

class Motorcar {
public:
    virtual void stop() { ; }
    virtual void accelerate(int new_speed) { ; }
};

class Car : public Motorcar {
public:
    void accelerate(int new_speed) {
        speed = new_speed;
    }
    void stop() {
        speed = 0;
    }
    Car() {
        speed = 0;
    }
    int getSpeed() const {
        return speed;
    }
private:
    int speed;
};

void main() {
    Car car;
    car.accelerate(50);
    cout << car.getSpeed() << endl;
    car.stop();
    cout << car.getSpeed();
}