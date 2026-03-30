class Heater {

    static boolean isOn;

    public static boolean power() {
        if (!isOn) {
            isOn = true;
            System.out.println("Heater is ON: " + isOn);
        } else {
            isOn = false;
            System.out.println("Heater is OFF: " + isOn);
        }
        return isOn;
    }
}