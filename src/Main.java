public class Main {
    public static void main(String[] args) {
        //task1 homework6
        int clientOS = 0;
        int clientAndroid = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        //task2
        int clientDeviceYearIOS = 2018;
        if (clientDeviceYearIOS >= 2015 && clientDeviceYearIOS <= 2022) {
            System.out.println("Приложенние будет работать корректно");
        } else if (clientDeviceYearIOS < 2015) {
            System.out.println("установите облегченную версию приложения для iOS по ссылке");
        }
        int clientDeviceYearAndroid = 2014;
        if (clientDeviceYearAndroid >= 2015 && clientDeviceYearAndroid <= 2022) {
            System.out.println("Приложенние будет работать корректно");
        } else if (clientDeviceYearAndroid < 2015) {
            System.out.println("установите облегченную версию приложения для Android по ссылке");
        }
        //task3
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("год не является високосным");
        }
        //task4
        int deliveryDistance = 95;
        if (deliveryDistance == 20) {
            System.out.println("Потребуется дней: " + " 24 часа");
        } else if (deliveryDistance >20 && deliveryDistance<60 ){
            System.out.println("Потребуется дней: " + " двое суток");
        }else {
            System.out.println("Потребуется дней: " + " трое суток");
        }
        //task5
        int monthNumber =12;
        switch (monthNumber){
            case 1:
            case 2:
                System.out.println("Принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Принадлежит к сезону зима");
                break;
            default:
                System.out.println("Номер месяца больше 13, такого быть не может");
        }
    }
}