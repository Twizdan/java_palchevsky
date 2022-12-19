package tasks.fifteen;

import java.util.Arrays;
import java.util.List;

public class Listik1 extends Listik{

    public StringBuilder toStroka() {
        StringBuilder sss = new StringBuilder();
        for (int i = 0; i<50; i++) {
            sss.append(mas[i]);
        }
        return sss;
    }

    public List<Integer> toMnozh() {
        List<Integer> mno = Arrays.stream(mas).boxed().toList();
        return mno;
    }
}
