package homework7;

public class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public void move() {
        System.out.println("Такой то " + fullName + " двигается");
    }

    public void move(String name) {
        System.out.println("Такой то " + name + " двигается");
    }

    public void talk() {
        System.out.println("Такой то " + fullName + " говорит");
    }

    public void talk(String name) {
        System.out.println("Такой то " + name + " говорит");
    }

    @Override

    public String toString() {
        return String.format("Person{  + fullName='%s', age='%d'}" );
    }

    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person("Вася", 33);
        firstPerson.move("Дима");
        firstPerson.talk("Коля");
        secondPerson.move();
        secondPerson.talk();
    }
}