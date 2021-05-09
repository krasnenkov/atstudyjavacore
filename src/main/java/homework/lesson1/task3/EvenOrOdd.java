package homework.lesson1.task3;

public class EvenOrOdd {

    boolean chekOdd(int number){
        if (number%2 == 1) {
            return true;
        }else{
            return  false;
        }
    }

    public static void main(String[] args) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();

        System.out.println(evenOrOdd.chekOdd(14));
        System.out.println(evenOrOdd.chekOdd(19));
    }
}
