package com.operation;

import com.book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-11-24
 * Time: 11:17
 */
public interface IOperation {
    Scanner scan = new Scanner(System.in);
    void work(BookList bookList);
}
