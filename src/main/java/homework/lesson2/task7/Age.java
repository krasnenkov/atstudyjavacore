package homework.lesson2.task7;

public class Age {

    static void returnAge(int age) {
        if (age >= 25 && age < 44)
            System.out.println("Молодой возраст");
        else if (age >= 44 && age < 60)
            System.out.println("Средний возраст");
        else if (age >= 60 && age < 75)
            System.out.println("Пожилой возраст");
        else if (age >= 75 && age < 90)
            System.out.println("Старческий возраст");
        else System.out.println("Неизвестный возраст");
    }

    public static void main(String[] args) {
        returnAge(32);
        returnAge(52);
        returnAge(66);
        returnAge(82);
        returnAge(25);
        returnAge(44);
        returnAge(60);
        returnAge(75);
        returnAge(22);
        returnAge(119);
    }
}
