package com.operation;

import com.book.Book;
import com.book.BookList;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书:");
        System.out.println("输入要查找的书名");
        String name = scan.next();
        Book book = null;
        int i = 0;
        //遍历bookList数组
        for(;i < bookList.getUsedSize() ; i++){
            book = bookList.getBook(i);
            if(book.getName().equals(name)){
                break;
            }
        }
        if(i == bookList.getUsedSize()){
            System.out.println("未找到此书");
            return;
        }
        System.out.println(book);
        System.out.println("找到此书");
    }
}
