package tasks.twelve;

import java.util.ArrayList;

public class Sorted_Students extends Students{

    Sorted_Students(int counter) {
        super(counter);
    }

    @Override
    public ArrayList allSetter() {
        super.allSetter();
        ArrayList sorted = new ArrayList();
        sorted.add(getId());
        sorted.add(getDirection());
        sorted.add(getFio());
        sorted.add(getGroup());
        return sorted;
    }
}
