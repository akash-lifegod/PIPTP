package Week1;

public class Program3 {
    public static void main(String[] args) {
        System.out.println(fun(2, 5));
    }

    public static int fun(int a, int b) {
        int c;
        for (c = 2; c <= 4; c++) {
            if (a % 2 < b % 3) {
                a = 4 % 3;
            }
            if (5 % 3 > b) {
                a = b;
            }
            b = 1;

        }
        return a + b;
    }
}
