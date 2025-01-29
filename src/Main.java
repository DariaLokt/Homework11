import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void task(int n) {
        if (n != 1) {
            System.out.println("-----------------------");
        }
        System.out.println("Task " + n);
    }

    public static void date() {
        int day = LocalDate.now().getDayOfMonth();
        Month month1 = LocalDate.now().getMonth();
        int year = LocalDate.now().getYear();
        System.out.println("Дата: " + day + " " + month1 + " " + year);
    }

    public static boolean isLeap(int y) {
        boolean isLeap;
        isLeap = y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
        return isLeap;
    }

    public static void determineAppVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1 && clientDeviceYear < currentYear)
        {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < currentYear)
        {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear == currentYear)
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        if (clientOS != 1 && clientOS != 0) {
            System.out.println("Для Вашей операционной системы приложение ещё не адаптировано");
        }
        if (clientDeviceYear > currentYear) {
            System.out.println("У Вас телефон из будущего!");
        }
    }

    public static int determineDeliveryTime(int distance) {
        int time;
        if (distance <= 20)
        {
            time = 1;
        } else if (distance <= 60) {
            time = 2;
        } else if (distance <= 100) {
            time = 3;
        } else {
            time = 0;
        }
        return time;
    }

    public static void main(String[] args) {
        System.out.println("Методы");
        date();
        task(1);
        int year = 2000;
        boolean isLeap = isLeap(year);
        System.out.println(isLeap ? year + " год — високосный год" : year + " год — невисокосный год");

        task(2);
        int clientDeviceYear = 2025;
        int clientOS = 0;
        determineAppVersion(clientOS, clientDeviceYear);

        task(3);
        int deliveryDistance = 25;
        int deliveryTime = determineDeliveryTime(deliveryDistance);
        switch (deliveryTime) {
            case 0:
                System.out.println("Доставки нет");
                break;
            case 1:
                System.out.println("Потребуется дней: 1");
                break;
            case 2:
                System.out.println("Потребуется дней: 2");
                break;
            case 3:
                System.out.println("Потребуется дней: 3");
                break;
        }
    }
}