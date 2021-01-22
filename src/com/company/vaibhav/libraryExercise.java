package com.company.vaibhav;

import java.util.Scanner;

class Library
{
    String [] books;
    int noOfBooks;

    Library()
    {
        this.books = new String[100];
        this.noOfBooks = 0;
    }

    void addBook(String book)
    {
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks()
    {
        System.out.println("Available Books are: ");
        for(int i = 0; i<books.length; i++)
        {
            if(books[i] == null)
            {
                continue;
            }
            System.out.println(books[i]);
        }
    }

    void issueBooks(String book)
    {
        for (int i = 0; i<this.books.length; i++)
        {
            if(this.books[i].equals(book))
            {
                System.out.println("The " + book + " has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book doesn't exits!!!");
    }
    void returnBook(String book)
    {
        addBook(book);
    }
}
public class libraryExercise
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Library centralLibrary = new Library();
        System.out.println("How many books do you want to add in the Library?");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<n; i++)
        {
            System.out.println("Enter books name: ");
            centralLibrary.addBook(sc.nextLine());


        }
        centralLibrary.showAvailableBooks();

        boolean visit = true;
        while (visit)
        {
            System.out.println("What do you want to do today?");
            System.out.println("1. Issue a book \n2. See available books \n3. Return a book \n4. Donate a book");
            int choice = sc.nextInt();

            if (choice == 1)
            {
                System.out.println("Enter the name of the book you want to issue: ");
                sc.nextLine();
                centralLibrary.issueBooks(sc.nextLine());
                centralLibrary.showAvailableBooks();
            }
            else if (choice == 2)
            {
                centralLibrary.showAvailableBooks();
                visit = false;
            }
            else if(choice == 3)
            {
                System.out.println("How many books do you want to return?");
                int o = sc.nextInt();
                sc.nextLine();
                for (int k = 0; k<o; k++)
                {
                    System.out.println("Enter the book's name you want to return: ");
                    centralLibrary.returnBook(sc.nextLine());
                    centralLibrary.showAvailableBooks();
                }
                visit = false;
            }
            else if (choice == 4)
            {
                System.out.println("How many books do you want to donate in the Library?");
                int p = sc.nextInt();

                for(int i = 0; i<p; i++)
                {
                    System.out.println("Enter books name: ");
                    centralLibrary.addBook(sc.nextLine());
                }
                centralLibrary.showAvailableBooks();
                visit = false;
            }
            else
            {
                System.out.println("Invalid choice! Please return to this Library with an appropriate choice!");
            }
        }


    }
}
