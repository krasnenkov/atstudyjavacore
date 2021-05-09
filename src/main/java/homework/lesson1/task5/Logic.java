package homework.lesson1.task5;

public class Logic {

    boolean logicNotOr(boolean a, boolean b) {
        return !(a || b);
    }

    boolean logicAndNot(boolean a, boolean b) {
        return (!a) && (!b);
    }

    public static void main(String[] args) {
        Logic logic = new Logic();

        System.out.println(logic.logicNotOr(false, false));
        System.out.println(logic.logicNotOr(false, true));
        System.out.println(logic.logicNotOr(true, false));
        System.out.println(logic.logicNotOr(true, true));

        System.out.println();

        System.out.println(logic.logicAndNot(false, false));
        System.out.println(logic.logicAndNot(false, true));
        System.out.println(logic.logicAndNot(true, false));
        System.out.println(logic.logicAndNot(true, true));
    }
}