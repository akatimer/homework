package homework7;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {

        Reader card1 = new Reader("Петров А.В.", "12356", "Physics", "22.12.1990", "6666");
        Reader card2 = new Reader("Иванов В.В.", "1234", "Math", "12.11.1989", "5555");
        Reader[] cards = {card1, card2};
        card1.takeBook(new Book("Иванов А.", "Теории1"), new Book("Ваильев Н.", "Практика"));
        Scanner sc = new Scanner(System.in);
        card1.returnBook(sc);
       // System.out.println(Arrays.toString(card1.getRecivedBooks()));
       // card1.takeBook("Пирогов","Григоров");
        }
}
