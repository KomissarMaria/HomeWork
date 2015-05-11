package lesson05.Task2_package;

public class IPhone extends Phone {
    protected String imei;

    public IPhone() {
        System.out.println("IPhone constructor");

        touch = true;
        hasWifi = true;
        screenSize = 3;
    }

    @Override
    final public void call(String number) {
        System.out.println("IPhone class is calling " + number);
        callcount++;
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("IPhone class is sending sms " + message + " to " + number);
        smscount++;
    }

    @Override
    public void counterSMS() {
        System.out.println("IPhone class is sending sms " + smscount + " times");
    }

    @Override
    public void countercall() {
        System.out.println("IPhone class is calling " + callcount + " times");
    }
}
