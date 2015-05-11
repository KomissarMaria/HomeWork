package lesson05.Task5_package;

import java.lang.String;

public class IPhone extends Phone {
    protected String imei;

    public IPhone() {
        System.out.println("IPhone constructor");

        touch = true;
        hasWifi = true;
        screenSize = 3;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    final public void call(String number) {
        System.out.println("IPhone class is calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("IPhone class is sending sms " + message + " to " + number);
    }

    @Override
    public void answer() {
        System.out.println("IPhone class is answer");
    }
}
