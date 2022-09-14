public class Main {

    public static void main(String[] args) {
        int it = 0;

        for (int i = 10; i <= 99; i++) {
            int min = 200;
            int max = 300;
            int sqrt = i * i;
            if (sqrt >= min && sqrt <= max) {
                it++;
                System.out.println(it);
            }
        }
    }
}
