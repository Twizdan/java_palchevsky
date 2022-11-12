package kontrolniye_na_seminare.kontr_12_11_2022;

public class Fact {
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int number;

    public int getEven_fact() {
        return even_fact;
    }

    public void setEven_fact(int number) {
        for (int i = 2; i <= number; i += 2) {
            even_fact *= i;
        }
    }

    private int even_fact = 1;

    public int getOdd_fact() {
        return odd_fact;
    }

    public void setOdd_fact(int number) {
        for (int i = 1; i <= number; i += 2) {
            odd_fact *= i;
        }
    }

    private int odd_fact = 1;



}
