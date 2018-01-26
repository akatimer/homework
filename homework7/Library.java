package homework7;


public class Library {
    String fio;
    int number;
    String fakultet;
    String date;
    int phone;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Library(String fio, int number, String fakultet, String date, int phone) {
        this.fio = fio;
        this.number = number;
        this.fakultet = fakultet;
        this.date = date;
        this.phone = phone;
    }

    public Library() {
    }

    public void takeBook() {
    }

    public void returnBook() {
    }

    public void takeBook(String... titles) {
        for(String title: titles)
        {
            System.out.println("Студент взял" + title);
        }
    }

    public void takeBook(int quantity) {
        System.out.println("Студент взял" + quantity + "книг");
    }

    public static void main(String[] args) {
        Library card1 = new Library("Петров А.В.", 1234, "Physics", "22.12.1990", 8888);
        Library card2 = new Library("Иванов В.В.", 1235, "Math", "12.11.1978", 8777);
        Library[] cards = {card1, card2};
        card1.takeBook("132", "555");


    }
}
