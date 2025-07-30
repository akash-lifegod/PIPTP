package Week1;

public class Program1 {

    public static void main(String[] args) {
        int x = 4;
        int w = 40;
        fun(x, w);
    }

    public static void fun(int x, int w) {
        int y = 0;
        if ((y % w == 0) || (w % x == 0)) {
            y = y + 1;
        } else {
            y = y + 10;
        }
        System.out.println(y);
    }

}
