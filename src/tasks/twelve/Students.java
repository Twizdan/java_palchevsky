package tasks.twelve;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Students {
    Scanner sc = new Scanner(System.in);

    private final int counter;

    public ArrayList<String> getId() {
        return id;
    }

    public ArrayList<String> getDirection() {
        return direction;
    }

    public ArrayList<String> getFio() {
        return fio;
    }

    public ArrayList<String> getGroup() {
        return group;
    }

    ArrayList<String> id = new ArrayList();
    ArrayList<String> direction = new ArrayList();
    ArrayList<String> fio = new ArrayList();
    ArrayList<String> group = new ArrayList();
    Students(int counter) {
        this.counter = counter;
    }
    ArrayList allSetter() {
        for (int i=0; i<counter; i++) {
            id.add(sc.nextLine());
            direction.add(sc.nextLine());
            fio.add(sc.nextLine());
            group.add(sc.nextLine());
        }
        Collections.sort(fio);
        return null;
    }
}
