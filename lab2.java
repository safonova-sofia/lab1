import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        int month = enterMonth();
        int day = enterDay();
        while (!checkDay(day, month)) {
            day = enterDay();
        }
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
    }

    public static int enterDay() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите день: ");
            String line = scanner.nextLine();
            try {
                int tmp = Integer.parseInt(line);
                if ((0 < tmp) & (tmp < 32)) {
                    return (tmp);
                } else {
                    System.out.println("Неправильный формат дня. Повторите ввод");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат дня. Повторите ввод");
            }
        }
    }

    public static int enterMonth() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число месяца: ");
            String line = scanner.nextLine();
            try {
                int tmp = Integer.parseInt(line);
                if ((0 < tmp) & (tmp < 13)) {
                    return (tmp);
                } else {
                    System.out.println("Неправильный формат месяца. Повторите ввод");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат месяца. Повторите ввод");
            }
        }
    }

    public static boolean checkDay(int day, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day < 32) {
                    return (true);
                } else {
                    System.out.println("В месяце 31 день. Ошибка при вводе Дня Рождения. Повторите ввод");
                    return (false);
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 31) {
                    return (true);
                } else {
                    System.out.println("В месяце 30 дней. Ошибка при вводе дня. Повторите ввод");
                    return (false);
                }
            case 2:
                if (day < 30) {
                    return (true);
                } else {
                    System.out.println("В феврале 28/29 дней. Ошибка при вводе дня. Повторите ввод");
                    return (false);
                }
        }
        return (false);
    }
}