package homework.lesson4.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws ParseException {
        Human ivanov = new Human();
        ivanov.setFirstName("Петр");
        ivanov.setLastName("Иванов");
        ivanov.setDate(sdf.parse("05.05.2021"));

        String lastName = ivanov.getLastName();
        String firstName = ivanov.getFirstName();
        Date birthDate = ivanov.getBirthDate();

    }
}
