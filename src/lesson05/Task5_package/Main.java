package lesson05.Task5_package;

/**
 * Написать код для связи телефонов между собой. У каждого телефона будет свой номер.
 * При вызове call(x) телефон должен найти собеседника по номеру x из всех доступных в данный момент телефонов )из всех созданных объектов типа Phone) и вызвать его метод answer()
 */
public class Main {
    public static void main(String[] args) {
        // Phone p = new Phone();
        Phone[] array = new Phone[3];

        Nokia3310 nokia = new Nokia3310();
        array[0] = nokia;
        nokia.setNumber("111-11-11");
        System.out.println("Nokia3310 screent size: " + nokia.getScreenSize());
        nokia.sendSMS("567-78-89", "text message");

        System.out.println("----------------------------------");

        IPhone iphone = new IPhone();
        array[1] = iphone;
        iphone.setNumber("222-22-22");
        System.out.println("IPhone screent size: " + iphone.getScreenSize());
        iphone.sendSMS("567-78-89", "text message");

        System.out.println("----------------------------------");

        IPhone5 iphone5 = new IPhone5();
        array[2] = iphone5;
        iphone5.setNumber("333-33-33");
        System.out.println("IPhone5 screent size: " + iphone5.getScreenSize());
        iphone5.sendSMS("567-78-89", "text message");

        System.out.println("----------------------------------");

        String callnumber = "333-33-33";
        nokia.call(callnumber);

        for (int i = 0; i < 3; i++) {
            if (array[i].number == callnumber) {
                array[i].answer();
                break;
            }
        }
    }
}


