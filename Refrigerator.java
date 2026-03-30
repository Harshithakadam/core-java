class Refrigerator {

    static boolean isOn;

    public static boolean power() {
        if (isOn == false) {
            isOn = true;
            System.out.println("Refrigerator is ON: " + isOn);
        } else {
            isOn = false;
            System.out.println("Refrigerator is OFF: " + isOn);
        }
        return isOn;
    }
}