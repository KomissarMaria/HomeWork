package lesson05.Task5_package;

public abstract class Phone {

    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize;
    protected String number;

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

    public String getNumber() {
        return number;
    }

    public void call(String number) {
        System.out.println("Phone class is calling " + number);
    }

    public abstract void sendSMS(String number, String message);

    public abstract void answer();
}
