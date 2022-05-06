// MurderMysteryBook.cpp
#include "MurderMysteryBook.h"

MurderMysteryBook::MurderMysteryBook() : MysteryBook(0)
{
    murders = 0;
}

void MurderMysteryBook::murder() {
    murders = murders + 1;
}