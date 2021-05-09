package homework.lesson2.task8;

public class NumberWithoutBreak {

    static void symbolA(int n) {
        switch (n) {
            default:
                System.out.print("A");
            case 4:
                System.out.print("A");
            case 3:
                System.out.print("A");
            case 2:
                System.out.print("A");
            case 1:
                System.out.print("A");
        }
    }

    public static void main(String[] args) {

        symbolA(-1);
        System.out.println();
        symbolA(2);
        System.out.println();
        symbolA(4);
        System.out.println();
        symbolA(7);
        System.out.println();
        symbolA(0);
        System.out.println();

    }
}