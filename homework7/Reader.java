package homework7;

import java.util.Arrays;
import java.util.Scanner;

public class Reader {
    private String fio;
    private String number;
    private String fakultet;
    private String date;
    private String phone;
    private int countBook;
    private Book[] recivedBooks;

    public Reader(String fio, String number, String fakultet, String date, String phone) {
        this.fio = fio;
        this.number = number;
        this.fakultet = fakultet;
        this.date = date;
        this.phone = phone;
        countBook = 0;
        recivedBooks = null;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCountBook() {
        return countBook;
    }

    public void setCountBook(int countBook) {
        this.countBook = countBook;
    }

    public Book[] getRecivedBooks() {
        return recivedBooks;
    }

    public void setRecivedBooks(Book[] recivedBooks) {
        this.recivedBooks = recivedBooks;
    }

    public Reader() {
    }

    public void takeBook() {
    }

    public void returnBook() {
    }

    @Override
    public String toString() {
        return "Читатель{" +
                "ФИО='" + fio + '\'' +
                ", Номер Билета='" + number + '\'' +
                ", Факультет='" + fakultet + '\'' +
                ", День рождения='" + date + '\'' +
                ", Номер Телефона='" + phone + '\'' +
                ", Количество книг=" + countBook +
                ", Книги=" + Arrays.toString(recivedBooks) +
                '}';
    }


    public void takeBook(Book... books) {
        int n = 0;
        Book[] newBook = new Book[countBook + books.length];
        for (int i = 0; i < countBook; i++) {
            newBook[i] = recivedBooks[i];
        }
        for (int i = countBook; i < countBook + books.length; i++) {
            System.out.println("Студент взял " + books[n]);
            newBook[i] = books[n];
            n++;
        }
        countBook += books.length;
        recivedBooks = newBook;
        System.out.println("Количество книг " + countBook);
    }

    public void takeBook(String... titles) {
        System.out.println("Студент взял книг: " + titles.length);
        for (String t : titles) {
            System.out.print(t + " ");
        }
    }

    public void returnBook(Scanner sc) {
        Book[] studentsBook = getRecivedBooks();
        int n=1;
        for (Book i: studentsBook){
            System.out.println(n+"." + i);
            n++;
        }
        int k=0;
        while (k == 0){
            System.out.println("Введите номер книги которую хотите вернуть: ");
            if (sc.hasNextInt()) {
               int i = sc.nextInt();
               studentsBook[i]=null;
            } else {
                System.out.println("Ошибка ввода");
                System.exit(2);
            }
        }
        System.out.print("Введите количество книг которые вы хотите вернуть: ");

        for (int i=0; i< k; i++){

        }

    }




}
