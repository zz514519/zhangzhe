package com.operation;

import com.book.Book;
import com.book.BookList;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        System.out.println("请输入要借阅书籍的书名");
        String name = scan.next();
        Book book = null;
        int i = 0;
        //遍历bookList数组
        for( ;i < bookList.getUsedSize() ; i++){
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
            System.out.println("此书已经被借出");
        }else{
            book.setBorrowed(true);
            System.out.println("借阅成功");
        }
    }
}
