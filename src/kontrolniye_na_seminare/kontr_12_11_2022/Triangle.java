package kontrolniye_na_seminare.kontr_12_11_2022;

public class Triangle {

    public float getFirst_side() {
        return first_side;
    }

    public void setFirst_side(float first_side) {
        this.first_side = first_side;
    }

    public float getSecond_side() {
        return second_side;
    }

    public void setSecond_side(float second_side) {
        this.second_side = second_side;
    }

    public float getThird_side() {
        return third_side;
    }

    public void setThird_side(float third_side) {
        this.third_side = third_side;
    }

    public float getSquare() {
        return square;
    }

    public void setSquare(float first_side, float second_side, float third_side) {
        float p = (first_side + second_side + third_side) / 2;
        this.square = (float) Math.sqrt(p * (p-first_side) * (p - second_side) * (p - third_side));
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float first_side, float second_side, float third_side) {
        this.perimeter = first_side+second_side+third_side;
    }
    private float first_side, second_side, third_side, square, perimeter;


}
