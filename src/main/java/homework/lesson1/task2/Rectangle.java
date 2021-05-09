package homework.lesson1.task2;

public class Rectangle {

    boolean checkSquare(int width, int height) {
        if (width * height > (2 * width + 2 * height)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle.checkSquare(2, 7));
        System.out.println(rectangle.checkSquare(6, 5));
        System.out.println(rectangle.checkSquare(6, 3));
    }
}
