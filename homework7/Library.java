package homework7;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reader card1 = new Reader("Петров А.В.", "12356", "Physics", "22.12.1990", "6666");
        Reader card2 = new Reader("Иванов В.В.", "1234", "Math", "12.11.1989", "5555");
        Reader[] cards = {card1, card2};
        card1.takeBook(new Book("Иванов А.", "Теории1"), new Book("Ваильев Н.", "Практика"), new Book("123", "321"));
        card1.takeBook("Словарь", "Приключения", "Энциклопедия");
        card1.takeBook(3);
        card1.returnBook(sc);
        card1.returnBook("Иванов А.", "Петров Б.");
        card1.returnBook(3);
    }
}