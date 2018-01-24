package homework7;

public class Phone {
    double weight;
    int number;
    String model;

    public Phone(double weight, int number, String model) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public int getNumber() {
        return number;
    }

    public void receiveCall(int callerid) {
        System.out.println("Звонит " + callerid);
    }

    public void receiveCall(int callerid, String name) {
        System.out.println("Звонит" + " " + callerid + " " + name);
    }

    public void sendMessage(String... array) {
        for (String a : array) {
            System.out.println("отпавил смс " + a);
        }
    }

    public static void main(String[] args) {
        Phone myPhone1 = new Phone(4.5, 5, "SRT");
        Phone myPhone2 = new Phone(6, "TRM");
        Phone myPhone3 = new Phone(8.1, 5, "DRM");

        myPhone1.receiveCall(555, "MMM");
        myPhone1.receiveCall(666);
        myPhone2.receiveCall(333, "CCC");
        myPhone2.receiveCall(444);
        myPhone3.receiveCall(777, "LLL");
        myPhone3.receiveCall(888);
        myPhone1.sendMessage();
        myPhone1.sendMessage("999", "45555", "3333333");
        myPhone3.sendMessage("543", "123");
        System.out.println(myPhone1.getNumber());
        System.out.println(myPhone2.getNumber());
        System.out.println(myPhone3.getNumber());
        System.out.println(myPhone1.model + " " + myPhone1.weight + " " + myPhone1.number);
        System.out.println(myPhone2.model + " " + myPhone2.number);
        System.out.println(myPhone3.model + " " + myPhone3.weight + " " + myPhone3.number);
    }
}