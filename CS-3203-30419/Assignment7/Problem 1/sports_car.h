#include "car.h"
#pragma once

class SportsCar : public Car
{
public:
    SportsCar();
    void turbo();
private:
    bool hasTurbo;
};