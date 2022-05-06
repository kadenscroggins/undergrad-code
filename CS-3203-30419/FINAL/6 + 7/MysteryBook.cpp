// MysteryBook.cpp
#include "MysteryBook.h"

MysteryBook::MysteryBook(int where) {
    the_page = where;
}

int MysteryBook::get() const {
    return the_page;
}

void MysteryBook::turn_page(int where) {
    the_page = where;
}