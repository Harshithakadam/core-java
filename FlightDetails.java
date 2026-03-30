class FlightDetails {

    static String flightNames[] = {
    "Indigo","AirIndia","SpiceJet","Vistara","Akasa",
    "AirAsia","GoAir","SkyJet","BlueAir","ZoomAir",
    "StarAir","TruJet","Alliance","GlobalAir","JetAir"
    };

    static char flightCodes[] = {
    'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'
    };

    static float ticketPrices[] = {
    20000.5f,25000.5f,30000.0f,28000.5f,32000.0f,
    27000.0f,26000.5f,31000.0f,29000.5f,33000.0f,
    34000.0f,22000.5f,21000.0f,30500.5f,31500.0f
    };

    static double distances[] = {
    500.5,600.2,550.3,620.4,580.1,
    610.7,540.6,570.8,590.9,560.2,
    630.4,520.3,510.6,605.7,615.8
    };

    public static void main(String[] args) {

        for(int i = 0; i < flightNames.length; i++) {
            if(i % 2 != 0) {
                System.out.println(flightNames[i]);
            }
        }

        for(int i = 0; i < flightCodes.length; i++) {
            if(i % 2 != 0) {
                System.out.println(flightCodes[i]);
            }
        }

        for(int i = 0; i < ticketPrices.length; i++) {
            if(i % 2 != 0) {
                System.out.println(ticketPrices[i]);
            }
        }

        for(int i = 0; i < distances.length; i++) {
            if(i % 2 != 0) {
                System.out.println(distances[i]);
            }
        }

    }
}