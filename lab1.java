import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        int NOW_DAY = 25;
        int NOW_MONTH = 11;
        int NOW_YEAR = 2022;
        int diffDay, diffMonth, diffYear;

        int day = enterDay();
        int month = enterMonth();
        int year = enterYear();
        while (!checkDay(day, month, year)) {
            day = enterDay();
        }
        System.out.println("Введенный ДД.ММ.ГГГГ: " + day + '.' + month + '.' + year);
        System.out.println("Сегодня ДД.ММ.ГГГГ: " + NOW_DAY + '.' + NOW_MONTH + '.' + NOW_YEAR);

        diffYear = NOW_YEAR - year;
        diffMonth = NOW_MONTH - month;
        diffDay = NOW_DAY - day;
        if (month > NOW_MONTH) {
            diffMonth += 12;
            diffYear--;
        }
        if (day > NOW_DAY) {
            diffDay = diffDay + daysInMonth(month, year);
            diffMonth--;
        }

        System.out.println("Возраст ДД.ММ.ГГГГ: " + diffDay + '.' + diffMonth + '.' + diffYear);
    }

    public static int enterDay() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите День Рождения: ");
            String line = scanner.nextLine();
            try {
                int tmp = Integer.parseInt(line);
                if (tmp < 1) {
                    System.out.println("Неправильный формат. Повторите ввод");
                } else {
                    return (tmp);
                }
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат. Повторите ввод");
            }
        }
    }

    public static int enterMonth() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Месяц Рождения: ");
            String line = scanner.nextLine();
            try {
                int tmp = Integer.parseInt(line);
                if ((tmp > 0) && (tmp < 13)) {
                    return (tmp);
                } else {
                    System.out.println("Неправильный формат. Повторите ввод");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат. Повторите ввод");
            }
        }
    }

    public static int enterYear() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите Год Рождения: ");
            String line = scanner.nextLine();
            try {
                int tmp = Integer.parseInt(line);
                if ((tmp > 0) && (tmp < 2023)) {
                    return (tmp);
                } else {
                    System.out.println("Неправильный формат. Повторите ввод");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат. Повторите ввод");
            }
        }
    }

    public static boolean checkDay(int day, int month, int year) {
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
                if (day < 31) {
                    return (true);
                } else {
                    System.out.println("В месяце 30 дней. Ошибка при вводе Дня Рождения. Повторите ввод");
                    return (false);
                }
            case 11:
                if (year == 2022) {
                    if (day < 26) {
                        return (true);
                    } else {
                        System.out.println("Сегодня 25 октября. Ошибка при вводе Дня Рождения. Повторите ввод");
                        return (false);
                    }
                } else if (day < 31) {
                    return (true);
                } else {
                    System.out.println("В месяце 30 дней. Ошибка при вводе Дня Рождения. Повторите ввод");
                    return (false);
                }
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    if (day < 30) {
                        return (true);
                    } else {
                        System.out.println("Високосный год. В феврале 29 дней. Ошибка при вводе Дня Рождения. Повторите ввод");
                        return (false);
                    }
                } else if (day < 29) {
                    return (true);
                } else {
                    System.out.println("Не високосный год. В феврале 28 дней. Ошибка при вводе Дня Рождения. Повторите ввод");
                    return (false);
                }
        }
        return (false);
    }

    public static int daysInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return (31);
            case 4:
            case 6:
            case 9:
            case 11:
                return (30);
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    return (29);
                } else {
                    return (28);
                }
        }
        return 0;
    }
}

