package homework.lesson2.task8;

public class NumberWithBreak {

    static void symbolN(int n) {
        switch (n) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println(String.format("%" + n + "s", "").replace(' ', 'A'));
                break;
            default:
                System.out.println(String.format("%" + 5 + "s", "").replace(' ', 'A'));
        }
    }

    public static void main(String[] args) {
        symbolN(-1);
        symbolN(2);
        symbolN(4);
        symbolN(7);
        symbolN(0);
    }
}