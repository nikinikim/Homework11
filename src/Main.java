public class Main {

    public static int checkLeapYear(int x) {
        int year = x;
        if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)) {
            System.out.println(year + " - год високосный");
        }else{
            System.out.println(year + " - год невисокосный");
        }
        return year;
    }
    public static void appOffer(int clientDevice, int deviceYear) {
        int clientOS = clientDevice;
        int clientDeviceYear = deviceYear;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложеня для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегчнную версию приложения для Android по ссылке");
        }
    }

    public static int deliveryCard(int distance) {
        int deliveryDistance = distance;
        int deliveryTime = 1;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + deliveryTime);
            return deliveryTime;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + (deliveryTime + 1));
            return (deliveryTime + 1);
        } else {
            System.out.println("Потребуется дней " + (deliveryTime + 2));
            return (deliveryTime + 2);
        }
    }
    public static double[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        double[] arr = new double[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static double monthlySpending() {
        double[] arr = generateRandomArray();
        int sumOfSpending = -1;
        for (double j : arr) {
            sumOfSpending += j;
        }
        System.out.println("Сумма трат за месяц составила " + sumOfSpending + " рублей");
        return sumOfSpending;

    }
    public static double monthAndAverageSpending(){
        double sumOfSpending = monthlySpending();
        double averageSpending = sumOfSpending / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей.");
        return averageSpending;
    }
    public static void main(String[] args) {
        checkLeapYear(2016);
        appOffer(1, 2017);
        deliveryCard(40);
        monthAndAverageSpending();
    }


}