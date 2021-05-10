package homework.lesson2.task2;

public class Chess {

    void chessFor(int[][] array) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    void chessWhile(int[][] array) {
        int i = 0;
        int j = 0;
        while (i < 8) {
            while (j < 8) {
                System.out.print(array[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
            j = 0;
        }
    }

    void chessForEach(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int array[][] = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (((i % 2 == 0) && (j % 2 != 0)) || ((j % 2 == 0) && (i % 2 != 0))) {
                    array[i][j] = 1;
                }
            }
        }
        System.out.println("Вывод чере for:");
        new Chess().chessFor(array);
        System.out.println();

        System.out.println("Вывод через ForEach:");
        new Chess().chessForEach(array);
        System.out.println();

        System.out.println("Вывод через while:");
        new Chess().chessWhile(array);
        System.out.println();
    }
}
