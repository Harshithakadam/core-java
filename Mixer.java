class Mixer {

    static boolean isOn;

    public static boolean power() {
        if (!isOn) {
            isOn = true;
            System.out.println("Mixer is ON: " + isOn);
        } else {
            isOn = false;
            System.out.println("Mixer is OFF: " + isOn);
        }
        return isOn;
    }
}