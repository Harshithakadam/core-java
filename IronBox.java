class IronBox {

    static boolean isOn;

    public static boolean power() {
        if (!isOn) {
            isOn = true;
            System.out.println("Iron Box is ON: " + isOn);
        } else {
            isOn = false;
            System.out.println("Iron Box is OFF: " + isOn);
        }
        return isOn;
    }
}