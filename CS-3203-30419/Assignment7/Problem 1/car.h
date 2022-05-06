#pragma once

class Car {
public:
    Car();
    void accelerate(int new_speed);
    void stop();
    int getSpeed() const;

protected:
    int speed;
};