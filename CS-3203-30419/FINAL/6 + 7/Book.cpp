// Book.cpp
#include "Book.h"

Book::Book() {
    what = 0;
}

int Book::operator+(const Book& other_book) {
    return (this->get() + other_book.get());
}

int Book::operator-(const Book& other_book) {
    return (this->get() - other_book.get());
}

int Book::get() const {
    return what;
}