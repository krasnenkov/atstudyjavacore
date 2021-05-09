package homework.lesson1.task6;

public class LogicResult {

    boolean showResult(boolean a, boolean b, boolean c, boolean d) {
        return ((a && b) && !(c || d));
    }

    public static void main(String[] args) {
        LogicResult logic = new LogicResult();

        System.out.println(logic.showResult(false, false, false, false));
        System.out.println(logic.showResult(true, true, true, true));
        System.out.println(logic.showResult(false, true, false, true));
        System.out.println(logic.showResult(true, false, true, false));
        System.out.println(logic.showResult(true, true, false, false));
    }
}
