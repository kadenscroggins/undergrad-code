// MurderMysteryBook.h
#pragma once
#include "MysteryBook.h"

class MurderMysteryBook : public MysteryBook {
public:
    MurderMysteryBook();
    void murder();
private:
    int murders;
};