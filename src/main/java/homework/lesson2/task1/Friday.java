package homework.lesson2.task1;

public class Friday {

    void fridayFor(String[] array) {
        String new_array = "";
        for (int i = 0; i < array.length; i++) {
            new_array += array[i] + " ";
        }
        new_array = new_array.trim() + ".";
        System.out.println(new_array);
    }

    void fridayForEach(String[] array) {
        String new_array = "";
        for (String element : array) {
            new_array += element + " ";
        }
        new_array = new_array.trim() + ".";
        System.out.println(new_array);
    }

    void fridyaWhile(String[] array) {
        String new_array = "";
        int i = 0;
        while (i < array.length) {
            new_array += array[i] + " ";
            i++;
        }
        new_array = new_array.trim() + ".";
        System.out.println(new_array);
    }

    public static void main(String[] args) {
        String[] friday = new String[]{"Пятница", "это", "лучший", "день", "недели"};

        new Friday().fridayFor(friday);
        new Friday().fridayForEach(friday);
        new Friday().fridyaWhile(friday);
    }
}
