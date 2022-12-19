package kontrolniye_na_seminare.kontr_12_11_2022;

public class Fact {
    public static int setEven_fact(int number) {
        int even_fact = 1;
        for (int i = 2; i <= number; i += 2) {
            even_fact *= i;
        }
        return even_fact;
    }
    public static int setOdd_fact(int number) {
        int odd_fact = 1;
        for (int i = 1; i <= number; i += 2) {
            odd_fact *= i;
        }
        return odd_fact;
    }
}
