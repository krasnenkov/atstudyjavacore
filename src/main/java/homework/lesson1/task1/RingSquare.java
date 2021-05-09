package homework.lesson1.task1;

public class RingSquare {

    final float PI = 3.14f;

    float countSquare(int rad) {
        return PI * rad * rad;
    }

    public static void main(String[] args) {
        RingSquare square = new RingSquare();

        System.out.println(square.countSquare(0));
        System.out.println(square.countSquare(2));
        System.out.println(square.countSquare(100));
    }
}
