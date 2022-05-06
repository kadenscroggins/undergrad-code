#pragma once
#include "Book.h"

class MysteryBook : public Book {
public:
	MysteryBook(int where);	
   	int get() const;
	void turn_page(int where);    
private:
       int the_page;
};