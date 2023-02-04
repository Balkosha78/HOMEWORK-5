public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int userIOs = 1;
        if (userIOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (userIOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неверное значение");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int userIOs = 1;
        int clientDeviceYear = 2014;
        if (userIOs == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println(" Установите версию приложения для iOS по ссылке ");
            }
        } else if (userIOs == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке ");
            }
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int currentYear = 2023;
        if ((currentYear % 4 == 0 && currentYear % 100 != 0) || (currentYear % 400 == 0)) {
            System.out.println(currentYear + " Високосный год");
        } else {
            System.out.println(currentYear + " Не високосный год");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 110;
        int time = 1;
        if (deliveryDistance > 20) {
            ++time;
        }
        if (deliveryDistance > 60) {
            ++time;
        }
        if (deliveryDistance > 100) {
            time = -1;
        }
        if (time == -1) {
            System.out.println("Не можем доставить");
        } else {
            System.out.println("Срок доставки " + time + " дней");
        }
    }
}


