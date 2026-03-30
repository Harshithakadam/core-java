class MovieDetails {

    static String movieNames[] = {
    "Leo","Jailer","KGF","Salaar","Pushpa",
    "RRR","Bahubali","Master","Vikram","Kaithi",
    "Beast","Animal","Tiger","War","Pathaan"
    };

    static char movieGrades[] = {
    'A','B','A','U','A','U','U','A','U','A','B','A','U','A','U'
    };

    static float ticketPrices[] = {
    150.5f,200.0f,180.5f,220.0f,210.5f,
    190.0f,175.5f,160.0f,230.5f,240.0f,
    250.5f,260.0f,170.5f,165.0f,155.5f
    };

    static double movieDurations[] = {
    2.30,2.45,2.50,2.40,2.35,
    2.55,2.48,2.20,2.30,2.25,
    2.15,2.10,2.05,2.50,2.45
    };

    public static void main(String[] args) {

        for(int i = 0; i < movieNames.length; i++) {
            if(i % 2!= 0) {
                System.out.println(movieNames[i]);
            }
        }

        for(int i = 0; i < movieGrades.length; i++) {
            if(i % 2 != 0) {
                System.out.println(movieGrades[i]);
            }
        }

        for(int i = 0; i < ticketPrices.length; i++) {
            if(i % 2 != 0) {
                System.out.println(ticketPrices[i]);
            }
        }

        for(int i = 0; i < movieDurations.length; i++) {
            if(i % 2 != 0) {
                System.out.println(movieDurations[i]);
            }
        }

    }
}