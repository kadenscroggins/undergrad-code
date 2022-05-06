#include "car.h"
#pragma once

namespace CS_3203_Assignment_7 {
    class SportsCar : public Car
    {
    public:
        SportsCar();
        void turbo();
    private:
        bool hasTurbo;
    };
}