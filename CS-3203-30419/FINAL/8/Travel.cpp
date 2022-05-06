template<typename T>
class Travel {
public:
   	Travel() {
        the_velocity = (T) 0;
    }
    Travel (T velocity) {
        the_velocity = velocity;
    }
    T get_the_velocity() const {
        return the_velocity;
    }
private:
    T the_velocity;
};

int main() {
    Travel<int> t1;
}