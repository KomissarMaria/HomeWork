package lesson05.Task2_package;

public class SamsungS4 extends Phone {

    public SamsungS4() {
        System.out.println("SamsungS4 constructor");

        touch = true;
        hasWifi = true;
        screenSize = 5;
    }

    @Override
    public void call(String number) {
        super.call(number);
        System.out.println("SamsungS4 class is calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("SamsungS4 class is sending sms " + message + " to " + number + ". Hello!");
        smscount++;
    }

    @Override
    public void counterSMS() {
        System.out.println("SamsungS4 class is sending sms " + smscount + " times");
    }

    @Override
    public void countercall() {
        System.out.println("SamsungS4 class is calling " + callcount + " times");
    }

}
