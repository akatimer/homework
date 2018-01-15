package homework4;

public class DaysOfWeekSwitch {
    public static void main(String[] args) {
        String str = args.length > 0 ? args[0] : "7";
        String day = "Понедельник";
        int i = Integer.parseInt(str);
        switch (i) {
            case 1:
                day = "Понедельник";
                break;
            case 2:
                day = "Вторник";
                break;
            case 3:
                day = "Среда";
                break;
            case 4:
                day = "Четверг";
                break;
            case 5:
                day = "Пятница";
                break;
            case 6:
            case 7:
                day = "Выхоной";
                break;
        }
        System.out.println(day);
    }
}