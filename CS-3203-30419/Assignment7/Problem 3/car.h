#pragma once

namespace CS_3203_Assignment_7 {
    class Car {
    public:
        Car();
        void accelerate(int new_speed);
        void stop();
        int getSpeed() const;

    private:
        int speed;
        friend class SportsCar;
    };
}