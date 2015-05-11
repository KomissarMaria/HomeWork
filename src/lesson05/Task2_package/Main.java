package lesson05.Task2_package;

import java.util.Random;

/**
 * Модифицировать класс Phone так, чтобы он считал количество звонков и сообщений отдельно для каждого объекта.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Nokia3310 nokia = new Nokia3310();
        System.out.println("Nokia3310 screent size: " + nokia.getScreenSize());

        int nokiacall = random.nextInt(10);
        for (int i = 0; i < nokiacall; i++) {
            nokia.call("111-11-11");
        }
        nokia.countercall();

        int nokiasms = random.nextInt(20);
        for (int i = 0; i < nokiasms; i++) {
            nokia.sendSMS("567-78-89", "text message");
        }
        nokia.counterSMS();

        System.out.println("----------------------------------");

        IPhone iphone = new IPhone();
        System.out.println("IPhone screent size: " + iphone.getScreenSize());
        int iphonecall = random.nextInt(10);
        for (int i = 0; i < iphonecall; i++) {
            iphone.call("222-22-22");
        }
        iphone.countercall();

        int iphonesms = random.nextInt(20);
        for (int i = 0; i < iphonesms; i++) {
            iphone.sendSMS("567-78-89", "text message");
        }
        iphone.counterSMS();

        System.out.println("----------------------------------");

        IPhone5 iphone5 = new IPhone5();
        System.out.println("IPhone5 screent size: " + iphone5.getScreenSize());
        int iphone5call = random.nextInt(10);
        for (int i = 0; i < iphone5call; i++) {
            iphone5.call("333-33-33");
        }
        iphone5.countercall();

        int iphone5sms = random.nextInt(20);
        for (int i = 0; i < iphone5sms; i++) {
            iphone5.sendSMS("567-78-89", "text message");
        }
        iphone5.counterSMS();

        System.out.println("----------------------------------");

        SamsungS4 samsungS4 = new SamsungS4();
        System.out.println("IPhone5 screent size: " + samsungS4.getScreenSize());
        int samsungS4call = random.nextInt(10);
        for (int i = 0; i < samsungS4call; i++) {
            samsungS4.call("444-44-44");
        }
        samsungS4.countercall();

        int samsungS4sms = random.nextInt(20);
        for (int i = 0; i < samsungS4sms; i++) {
            samsungS4.sendSMS("567-78-89", "text message");
        }
        samsungS4.counterSMS();

    }

}
