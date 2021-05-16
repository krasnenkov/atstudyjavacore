package homework.lesson3.task3;

public class Application {
    public static void main(String[] args) {
        Human sergey = new Human("Сергей", 42, "Алесандра", "Валерий");
        Human marina = new Human("Марина", 42, null, "Иван");
        Human vitaliy = new Human("Виталий", 12, "Марина", "Сергей");
        Human elena = new Human("Елена", 10, "Марина", "Сергей");
        Human valeriy = new Human("Валерий", 65, null, null);
        Human alexandra = new Human("Александра", 65, null, null);
        Human ivan = new Human("Иван", 63, null, null);

        Human elenaGrandparents[] = {valeriy, alexandra, ivan};

        System.out.println("Дедушки и бабушки Елены:");
        for (Human element : elenaGrandparents) {
            System.out.println(element.name + " " + element.age + " ");
        }
    }
}
