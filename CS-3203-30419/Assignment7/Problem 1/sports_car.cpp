#include "sports_car.h"

SportsCar::SportsCar() {
    hasTurbo = false;
}

void SportsCar::turbo() {
    hasTurbo = true;
    this->accelerate(speed * 1.5);
}
