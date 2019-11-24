package com.operation;

import com.book.Book;
import com.book.BookList;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        //1.查找图书是否存在
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
        book = bookList.getBook(i);
        if(book.isBorrowed()){
            book.setBorrowed(false);
            System.out.println("此书归还成功");
        }else{
            System.out.println("该书没有被借阅");
        }
    }
}
