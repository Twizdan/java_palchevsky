package tasks.kontrolnaya_12_11_2022.first_task;

public class Straight extends Triangle {
    public boolean isFlag() {
        return flag;
    }

    public void setFlag() {
        float hypotenuse = Math.max(Math.max(getFirst_side(), getSecond_side()), getThird_side());
        float summary = getThird_side() + getSecond_side() + getFirst_side();
        float catet_1 = Math.min(Math.min(getFirst_side(), getSecond_side()), getThird_side());
        float catet_2 = summary - hypotenuse - catet_1;
        boolean flag;
        flag = Math.pow(hypotenuse, 2) == (Math.pow(catet_1, 2) + Math.pow(catet_2, 2));
        this.flag = flag;
    }

    private boolean flag;

}