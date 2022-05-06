#include "sports_car.h"

namespace CS_3203_Assignment_7 {
    SportsCar::SportsCar() {
        hasTurbo = false;
    }

    void SportsCar::turbo() {
        hasTurbo = true;
        this->accelerate(speed * 1.5);
    }
}