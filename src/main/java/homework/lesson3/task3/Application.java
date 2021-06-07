package homework.lesson3.task3;

public class Application {
    public static void main(String[] args) {
        Human valeriy = new Human("Валерий", 65, null, null);
        Human alexandra = new Human("Александра", 65, null, null);
        Human ivan = new Human("Иван", 63, null, null);

        Human sergey = new Human("Сергей", 42, alexandra, valeriy);
        Human marina = new Human("Марина", 42, null, ivan);

        Human vitaliy = new Human("Виталий", 12, marina, sergey);
        Human elena = new Human("Елена", 10, marina, sergey);

        Human[] grands = new Human[4];
        int index = 0;

        for (Human parent : elena.parents) {
            for (Human grand : parent.parents)
                grands[index++] = grand;
        }
/*
        for (int i = 0; i < elena.parents.length; i++) {
            Human[] parentParents = elena.parents[i].parents;
            for (int j = 0; j < parentParents.length; j++) {
                grands[index++] = parentParents[j];
            }
        }*/
        for (Human grand : grands) {
            if (grand != null) System.out.printf("%s (%d лет)%n", grand.name, grand.age);
        }

    }
}
