class Microwave {

    static boolean isOn;

    public static boolean power() {
        if (!isOn) {
            isOn = true;
            System.out.println("Microwave is ON: " + isOn);
        } else {
            isOn = false;
            System.out.println("Microwave is OFF: " + isOn);
        }
        return isOn;
    }
}