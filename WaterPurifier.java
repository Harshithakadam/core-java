class WaterPurifier {

    static boolean isOn;

    public static boolean power() {
        if (!isOn) {
            isOn = true;
            System.out.println("Water Purifier is ON: " + isOn);
        } else {
            isOn = false;
            System.out.println("Water Purifier is OFF: " + isOn);
        }
        return isOn;
    }
}