import java.util.Scanner;


public class lab3 {
    public static void main(String[] args) {
        long number = 1;

        System.out.print("Введите x: ");
        int x = enter();
        System.out.print("Введите n: ");
        int n = enter();
        while ((n >= 15) || (n <= -15)) {
            System.out.print("Неправильный формат. Повторите ввод: ");
            n = enter();
        }

        for (int i = 0; i < Math.abs(n); i++) {
            number *= x;
        }

        if (n > 0) {
            System.out.println("Степень: " + number);
        } else {
            double tmp = (1 / (double) number);
            System.out.println("Степень: " + tmp);
        }
    }

    public static int enter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            try {
                return (Integer.parseInt(line));
            } catch (NumberFormatException e) {
                System.out.print("Неправильный формат. Повторите ввод: ");
            }
        }
    }
}
