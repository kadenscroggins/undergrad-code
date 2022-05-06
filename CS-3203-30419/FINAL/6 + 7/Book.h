#pragma once

class Book {
public:
   	Book();
int operator+(const Book& other_book);
	int operator-(const Book& other_book);
	int get() const;    
private:
       int what;
};