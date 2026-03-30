class AirConditioner {

    static boolean isOn;

    public static boolean power() {
        if (!isOn) {
            isOn = true;
            System.out.println("AC is ON: " + isOn);
        } else {
            isOn = false;
            System.out.println("AC is OFF: " + isOn);
        }
        return isOn;
    }
}