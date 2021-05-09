package homework.lesson1.task4;

public class LengthInMeters {

    int santToMeters(int sant) {
        return sant / 100;
    }

    public static void main(String[] args) {
        LengthInMeters lengthInMeters = new LengthInMeters();

        System.out.println(lengthInMeters.santToMeters(115));
        System.out.println(lengthInMeters.santToMeters(800));
        System.out.println(lengthInMeters.santToMeters(278));
    }
}
