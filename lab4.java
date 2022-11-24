import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        int count = 0;

        System.out.print("Введите n: ");
        int n = enterInt();
        while (n < 0) {
            System.out.print("Неправильный формат. Повторите ввод: ");
            n = enterInt();
        }
        if (n == 0) {
            System.out.println("Точки не заданы");
            System.exit(0);
        }

        System.out.print("Введите R: ");
        double R = enterDouble();
        while (R < 0) {
            System.out.print("Неправильный формат. Повторите ввод: ");
            R = enterDouble();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Введите x: ");
            double x = enterDouble();
            System.out.print("Введите y: ");
            double y = enterDouble();
            if (x * x + y * y < R * R) {
                count++;
            }
        }

        System.out.print(count + " точек попали в окружность");

    }

    public static int enterInt() {
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

    public static double enterDouble() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            try {
                return (Double.parseDouble(line));
            } catch (NumberFormatException e) {
                System.out.print("Неправильный формат. Повторите ввод: ");
            }
        }
    }
}
