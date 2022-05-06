template<typename T>
class Air {
public:
    Air(T fspeed);
    T get_speed() const;
    void accelerate(T new_speed);
private:
    T speed;
};

template<typename T>
Air<T>::Air(T fspeed) {
    speed = fspeed;
}

template<typename T>
T Air<T>::get_speed() const {
    return speed;
}

template<typename T>
void Air<T>::accelerate(T new_speed) {
    speed = new_speed;
}

int main() {
    ;
}