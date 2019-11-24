package com.operation;

import com.book.BookList;

import java.util.Scanner;

public interface IOperation {
    Scanner scan = new Scanner(System.in);//操作继承
    void work(BookList bookList);
}
