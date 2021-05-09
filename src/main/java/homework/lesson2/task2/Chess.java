package homework.lesson2.task2;

public class Chess {
    public static void main(String[] args) {

        int array[][] = new int[8][8];
        array[0][0] = 0;
        for(int i=0; i<8; i++){
            System.out.println();
            for (int j=0; j<8; j++ ) {
                if (((i%2 == 0) && (j%2!=0)) || ((j%2 ==0) && (i%2!=0))){
                    array[i][j] = 1;
                }
                System.out.print( array[i][j]+" ");
            }
        }
    }
}
