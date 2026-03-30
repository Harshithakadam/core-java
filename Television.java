class Television {

    static boolean isOn;

    public static boolean power() {
        if (isOn == false) {
            isOn = true;
            System.out.println("Television is ON: " + isOn);
        } else {
            isOn = false;
            System.out.println("Television is OFF: " + isOn);
        }
        return isOn;
    }
}