package tasks.twelve;

public class Main {
    public static void main(String[] args) {
        Sorted_Students file = new Sorted_Students(2);
        System.out.println("Введите сначала id, направление, ФИО и группу");
        System.out.println(file.allSetter());

    }
}
