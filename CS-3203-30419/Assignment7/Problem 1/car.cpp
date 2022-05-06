#include "car.h"

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