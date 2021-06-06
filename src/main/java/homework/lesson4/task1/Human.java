package homework.lesson4.task1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    private String lastName;
    private String firstName;
    private Date birthDate;

    private final String CYRILLIC = "^[А-Я][а-я]{2,}$";
    private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    Date currentDate = new Date();

    public void setLastName(String lastName) {
        if (lastName.matches(CYRILLIC)) {
            this.lastName = lastName;
            setCorrectPrint();
        } else
            setIncorrectPrint();
    }

    public void setFirstName(String firstName) {
        if (firstName.matches(CYRILLIC)) {
            this.firstName = firstName;
            setCorrectPrint();
        } else
            setIncorrectPrint();
    }

    public void setDate(Date birhDate) {
        if (birhDate.before(currentDate)) {
            this.birthDate = birhDate;
            DATE_FORMAT.format(birhDate);
            setCorrectPrint();
        } else
            setIncorrectPrint();
    }

    public String getLastName() {
        getPrint(lastName);
        return lastName;
    }

    public String getFirstName() {
        getPrint(firstName);
        return firstName;
    }

    public Date getBirthDate() {
        getPrint(DATE_FORMAT.format(birthDate));
        return birthDate;
    }

    private void setIncorrectPrint() {
        System.out.println("Некорректоное значение!");
    }

    private void getPrint(String value) {
        System.out.println("Получено значение: " + value);
    }

    private void setCorrectPrint() {
        System.out.println("Корректное значение!");
    }
}
