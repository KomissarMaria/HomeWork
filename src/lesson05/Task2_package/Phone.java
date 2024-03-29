package lesson05.Task2_package;

public abstract class Phone {
    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize;
    protected int callcount;
    protected int smscount;

    public Phone() {
        System.out.println("Phone constructor");
    }

    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void call(String number) {
        System.out.println("Phone class is calling " + number);
        callcount++;
    }

    public void sendSMS(String number, String message) {
        smscount++;
    }

    public abstract void counterSMS();

    public abstract void countercall();
}
