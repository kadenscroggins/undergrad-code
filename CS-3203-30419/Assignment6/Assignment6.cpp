#include <iostream>

using namespace std;

template<typename T>
class Car {
public:
    Car(T speed) {
        this->speed = speed;
    }
    virtual ~Car() {
        cout << "DESTROY!" << endl;
    }
    T getSpeed() const {
        return speed;
    }
    void accelerate(T speed) {
        this->speed = speed;
    }
    void stop() {
        speed = (T)0;
    }
    T operator+(Car &operand) const {
        return (this->getSpeed() + operand.getSpeed());
    }
    T operator-(Car &operand) const {
        return (this->getSpeed() - operand.getSpeed());
    }
private:
    T speed;
};

int main() {
    try {
        cout << "Creating two integer cars" << endl;
        Car<int> *icar1 = new Car<int>(50);
        Car<int> *icar2 = new Car<int>(5);
        cout << "Integer car + car: " << *icar1 + *icar2 << endl;
        //"Integer car + car: 55"

        cout << endl;

        cout << "Creating two string cars" << endl;
        Car<string> *scar1 = new Car<string>("40");
        Car<string> *scar2 = new Car<string>("4");
        cout << "String car + car: " << *scar1 + *scar2 << endl;
        //"String car + car: 404"

        cout << endl;

        // NOTE: Does not compile with the following line present.
        //cout << "String car + Integer car: " << *scar1 + *icar1 << endl;
    }
    catch (exception& e) {
        cout << "Something went wrong!";
    }
    
}