import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        long n = kb.nextLong();
        long sum = 0;

        for (int i = 1; ; i++) {
            sum += i;

            if (sum > n) {
                System.out.println(i - 1);
                break;
            }
        }

    }
}
