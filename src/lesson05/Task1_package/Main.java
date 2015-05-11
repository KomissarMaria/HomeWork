package lesson05.Task1_package;

/**
 * Написать класс наследник SamsungS4 с диагональю экрана 5 дюймов, поддержкой Wifi и методом отправки SMS, который будет дописывать к сообщению слово “Hello”.
 */
public class Main {
    public static void main(String[] args) {
        // Phone p = new Phone();

        Nokia3310 nokia = new Nokia3310();
        System.out.println("Nokia3310 screent size: " + nokia.getScreenSize());
        nokia.sendSMS("567-78-89", "text message");

        System.out.println("----------------------------------");

        IPhone iphone = new IPhone();
        System.out.println("IPhone screent size: " + iphone.getScreenSize());
        iphone.sendSMS("567-78-89", "text message");

        System.out.println("----------------------------------");

        IPhone5 iphone5 = new IPhone5();
        System.out.println("IPhone5 screent size: " + iphone5.getScreenSize());
        iphone5.sendSMS("567-78-89", "text message");

        System.out.println("----------------------------------");

        SamsungS4 samsungS4 = new SamsungS4();
        System.out.println("IPhone5 screent size: " + samsungS4.getScreenSize());
        samsungS4.sendSMS("567-78-89", "text message");


    }
}
