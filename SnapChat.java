class SnapChat {
    // return type is String
    public static String validateAndRegisterUser(long mobileNumber, String pwd, String birthday, String fullName,String userName) {
        System.out.println("validateAndRegisterUser method is started");
        String registrationStatus = null;
        if (mobileNumber != 0 && pwd != null && birthday != null && fullName != null && userName != null) {
            if (pwd.length() > 8 && fullName.length() > 8 && userName.length() > 8) {
                registrationStatus = "Thank you " + fullName + " registered successfully";
            } else {
                registrationStatus = "Please check the length of the psw,fullName,userName";
            }
        } else {
            registrationStatus = "Please enter the valid data";
        }
        System.out.println("validateAndRegisterUser method is ended");
        return registrationStatus;
    }
}