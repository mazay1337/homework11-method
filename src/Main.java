import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        task1 ();
//        task2 ();
        task3 ();
    }

//    1) Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным,
//    и выводит результат в консоль.
    public static void printLeapYear(int year) {
        if ((year > 1584) && (year % 4 == 0) && ((year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task1() {
        int year = 2023;
        printLeapYear(year);
    }

    //   2) Два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
//   Если устройство старше текущего года, предложите ему установить облегченную версию.
//   Текущий год можно получить таким способом: int currentYear = LocalDate.now().getYear();
//   Или самим задать значение вручную — ввести в переменную числовое значение.
//   В результате сообщить, какую версию (обычную или облегченную) и для какой ОС (Android или iOS) установить.

    public static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2023;

        determinesDeviceVersion(clientDeviceYear);
        definesClientOS(clientOS);
    }
    public static void determinesDeviceVersion(int clientDeviceYear) {
        if (clientDeviceYear < 2015) {
            System.out.print("Установите облегченную версию приложения для ");
        } else
        System.out.print("Установите версию приложения для ");
    }
    public static void definesClientOS(int clientOS) {
        if (clientOS == 0) {
            System.out.println("iOS ");
        } else
        System.out.println("Android");
    }

    //    3) Написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
    public static void task3() {
        int deliveryDistance = 102;
        deliveryTimeCalculator(deliveryDistance);
    }
    public static int deliveryTimeCalculator(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance < 20) {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60){
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime += 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("По вашему адресу доставки нет");
        }
        return deliveryTime;
    }
}